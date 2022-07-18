package DsaOne.Stack;
import java.util.Stack;

public class Pattern132 {
    // O(n^3)
    static boolean approach1(int arr[],int n){
       
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[k] > arr[i] &&arr[j]> arr[k])
                    return true;
                }
            }
        }
        return false;
    }
    // O(n^2)
    static boolean approach2(int arr[],int n){
        int min=arr[0];
        for(int j=0;j<n-1;j++){
        min=Math.min(min,arr[j]);
        if(min==arr[j])
        continue;

        for(int k=j+1;k<n;k++){
            if(min<arr[k]&& arr[j]>arr[k])
            return true;
        }
    }
    return false;
    }
    // O(n)
    static boolean approach3(int arr[],int n){
        int prefixmin[]=new int [n];
        prefixmin[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixmin[i]=Math.min(prefixmin[i-1], arr[i]);
        }
        Stack <Integer> s=new Stack<>();
        for(int j=n-1;j>=0;j--){
            if(arr[j]>prefixmin[j]){
                while(s.size()>0 && prefixmin[j]>=s.peek())
                s.pop();
            if(s.size()>0 && arr[j]>=s.peek())
            return true;
            }
            s.push(arr[j]);
        }
return false;
    }
    
    public static void main(String[] args) {
        int []arr={-1,3,2,0};
        int n=arr.length;
       System.out.println(approach3(arr,n)); 
    }
    
}
