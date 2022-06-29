package DsaOne.Array;

import java.util.Arrays;

public class Soldier {
    public static void main(String[] args) {
       int matrix[][]={{1,1,0,0,0},
                       {1,1,1,1,0},
                       {1,0,0,0,0},
                       {1,1,0,0,0},
                       {1,1,1,1,1}};
                       
         int m=matrix.length;
         int n=matrix[0].length;
         int pair[][]=new int [m][2];
        //Calculate Strength and place that in array
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    break;}
                    count++;  

        }
        pair[i][0]=count;
        pair[i][1]=i;
    }
    //Sort on the basis of strength
   Arrays.sort(pair,(a,b)->{
    if(a[0]==b[0])
    return a[1]-b[1];
    else return a[0]-b[0];
   });
   int k=matrix.length;
   int indexes[]=new int[k];

for(int i=0;i<k;i++){
    indexes[i]=pair[i][1];
}
for (int e:indexes){
    System.out.print(e+" ");
}

}
}