package DsaOne.Array;

public class ZeroShift {
    public static void main(String[] args) {
        //Naive Solution -->O(n^2)
        int i=0;
        int arr[]={10,5,0,8,0,9,0,0,2,0};
        while (i<arr.length)
    {
        if(arr[i]==0){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]!= 0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
                }
            }
        }
        i++; 
    }
    for(int e: arr){
    System.out.print(e + " ");
    }

// Efficient Solution-->O(n)
int arr1[]={10,5,0,8,0,9,0,0,2,0};
int count=0;
for(int j=0;j<arr1.length;j++){
    if(arr1[j]!= 0){
        int temp=arr1[count];
        arr1[count]=arr1[j];
        arr1[j]=temp;
        count++;
            }

}for(int e1: arr1){
    System.out.print(e1 + " ");
    }
    
}
}
