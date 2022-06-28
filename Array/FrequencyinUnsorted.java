package DsaOne.Array;

public class FrequencyinUnsorted {
    public static void main(String[] args) {
        int arr[] = { 9, 6, 5,6,9 };
        int[] visitedarr = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    visitedarr[j] = visited;
                }
            }
                if (visitedarr[i] != visited) {
                    visitedarr[i] = count;
                }
            }
            for(int i=0;i<visitedarr.length;i++){
            if (visitedarr[i] != visited) {
                System.out.println(arr[i] + "-" + visitedarr[i]);
            }
        }
        }

    }

