package DsaOne.Array;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int first=0,last=matrix.length-1,key=33;
        while(first<matrix.length && last>=0){
            if(matrix[first][last]==key){
                System.out.println(key+" Found at "+ first+" "+last);
                return;
            }
            if(matrix[first][last]<key)
            first++;
            else
            last--;
            
        }
    }
    
}
