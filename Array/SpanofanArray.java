package DsaOne.Array;

public class SpanofanArray {
    public static void main(String[] args) {
        int arr[]={10,20,11,90,9};
        int min=arr[0],max=arr[0];
        for(int i=1;i<arr.length;i++){
    if(min>arr[i])
        min=arr[i];
    if(max<arr[i])
        max=arr[i];
    
        }
        System.out.println(max-min);
    }
    
}
