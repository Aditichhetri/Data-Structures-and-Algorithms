package DsaOne.Array;

public class TransposeofMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int e[]:arr){
            for(int i:e){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
