package DsaOne.Array;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={2,5,10,6,11,3};
        int m=arr[0];
        for(int i=0;i<arr.length;i++){
            if(m<arr[i]){
                m=arr[i];
            }
        }
        System.out.println(m);

    }
    
}
