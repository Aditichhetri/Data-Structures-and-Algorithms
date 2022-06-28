package DsaOne.Array;

public class Matrix {
    public static void main(String[] args) {
    //     int arr[][]=new int [3][3];
    //     int [][] arr1=new int [3][3];
    //     int [] arr2[]=new int [3][3];
    //     int arr3[] []=new int [3][];
    //     arr3[0]=new int [10];
    //     arr3[1]=new int [20];
    //     int arr4[][]={{1,2},{3,4}};
    //     for(int e[]: arr4){
    //         for(int i:e){
    //     System.out.print(i+" ");
    // }
    //       System.out.println();
    //     }

int arr[][]={{1,2,3},{4,5,6},{7,8}};

for(int i=0;i<arr.length;i++){
  for(int j=0;j<arr[i].length;j++){
    // Row Major Order
    System.out.print(arr[i][j]+" ");
     // Column Major Order
    System.out.print(arr[j][i]+" ");
  }  
  System.out.println();

}
      
     
    }
    
}
