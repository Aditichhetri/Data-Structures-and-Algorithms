package DsaOne.Array;

public class Toplitz {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int flag=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr[i].length-1;j++){
                if(arr[i][j]!=arr[i+1][j+1])
                flag=0;
                else
                flag=1;
            }
        }
        if(flag==0)System.out.println("Not a Toplitz Matrix");
        else System.out.println(" Toplitz Matrix");
    }
    
}
