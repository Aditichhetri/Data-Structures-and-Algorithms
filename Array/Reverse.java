package DsaOne.Array;

public class Reverse {
    public static void main(String[] args) {
        // Using another array
    
          int arr[]={10,20,30,40,50};
          int n=arr.length;
          int j=0;
          int ans[]=new int[n];
          for(int i=n;i>0;i--,j++){
          ans[j]=arr[i-1];
          System.out.print(ans[j]+" ");
          }
         
        // Without using another array
        int arr1[] = { 10, 20, 30, 40, 50 };
        int first = 0, last = arr1.length - 1;
        while (first < last) {
            int temp = arr1[last];
            arr1[last] = arr1[first];
            arr1[first] = temp;
            first++;
            last--;
        }
        for (int e : arr1) {
            System.out.print(e+ " ");
        }

    }
}
