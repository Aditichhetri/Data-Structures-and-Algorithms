package DsaOne.Array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr={1,1,1,1,2,2,2,3,3,4,4,4,5,5,5};
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){continue;}
            else
            System.out.print(arr[i]+" ");
        }
    }
    
}
