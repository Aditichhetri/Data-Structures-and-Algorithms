package DsaOne.Array;

public class SecondLargestElement {
    //Without Sorting
    public static void main(String[] args) {
        int arr[] = { 80, 80, 80 };//-1
        int max = arr[0], secondmax = -1;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                secondmax = max;
                max = arr[i];
            }
            if (arr[i] != max) 
            {
                if (arr[i] > secondmax)
                    secondmax = arr[i];
            }
        }
        System.out.println(secondmax);

    }
}
