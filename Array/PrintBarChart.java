package DsaOne.Array;


public class PrintBarChart {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 1, 7, 9, 0 };
        int max_element=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
           if( arr[i]>max_element){max_element=arr[i];}}

            for(int j=max_element;j>0;j--){
                for(int k=0;k<arr.length;k++){
                    if(j<= arr[k])
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                System.out.println(); 
            } 

        
   
   
   
    }}

