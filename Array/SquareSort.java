package DsaOne.Array;

import java.util.Arrays;

public class SquareSort {
    public static void main(String[] args) {
        int arr[]={-7,-5,-2,0,1};
        int n=arr.length;
        int ans[]=new int [n];
        int first=0,last=n-1;
        for(int i=0;i<n;i++){
            if(arr[first]<=arr[last]){
                ans[i]=arr[first]*arr[first];
                first++;
            }
            else{
                ans[i]=arr[last]*arr[last];
                last--;
            }
        }
        Arrays.sort(ans);
        for(int e:ans)
        System.out.print(e+" ");
      
}

    }
    

