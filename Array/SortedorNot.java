package DsaOne.Array;


import java.util.Scanner;

public class SortedorNot {

 static int  sorted_asc (int arr[],int n)
{
/* 
    for(int i=1;i<arr.length;i++){
        if(arr[i]<arr[i-1])
        {
         return false;   
        } 
    }
    return true;*/

    // Recursive 
    
    if(n==1||n==0)
    return 1;
    if(arr[n-1]<arr[n-2])
    return 0;
    return sorted_asc(arr, n-1);
}

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[6];
        int n=arr.length;
        
        System.out.println("Enter 6 element in array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
      /*   boolean ans=sorted_asc(arr);
        if(ans==true)
        System.out.println("Sorted");
        else
        System.out.println("Not sorted"); */
 
    //     boolean s=true;
    //     for(int i=0;i<arr.length-1;i++){
    //         if(arr[i]>arr[i+1]){
    //             s=false;
    //             break;
    //         }
         
    //     }
    //     if(s)
    //     { 
    //         System.out.println("sorted in asending order");
    //     }
    //     else
    //     System.out.println("Not sorted");
    if(sorted_asc(arr, n)!=0)
    System.out.println("sorted");
    else System.out.println("Not Sorted");
sc.close();
    }
    
}
