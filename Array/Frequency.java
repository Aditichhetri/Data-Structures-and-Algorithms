package DsaOne.Array;

public class Frequency {
    public static void main(String[] args) {
        // Frequency in Sorted Array
        int count=1;
        int arr[]={10,10,10,30,30,40};
      
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
            System.out.println(arr[i-1]+"-"+count);
            count =1;
        }
    }
    System.out.println(arr[arr.length-1]+"-"+count);

    }
    
}
