package DsaOne.Array;

public class BoundSum {
    public static void main(String[] args) {
        int matrix[][] = { { 6, 5, 4 },
                           { 1, 2, 5 },
                           { 7, 9, 7 } };
        int uppersum = 0, lowersum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i <= j) {
                    uppersum += matrix[i][j];
                }
                if(j<=i){
                    lowersum += matrix[i][j];
                }
            }
        }
        System.out.println("Upper sum: "+uppersum+"Lower Sum: "+lowersum);

    }

}
