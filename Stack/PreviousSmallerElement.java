package DsaOne.Stack;
import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallerElement {
    static void pse( int arr[],int  n,int ans[]){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.size()==0){
                ans[i]=-1;
            }
            else if(s.size()>0 && arr[i]>s.peek()){
               ans[i]=s.peek();
            }
            else if(s.size()>0 && arr[i]<=s.peek()){
                while(s.size()>0 && arr[i]<=s.peek()){
                    s.pop();
                }
                if(s.size()==0){
                    ans[i]=-1;
                }
                else{
                    ans[i]=s.peek();
                }
            }
            s.push(arr[i]);

        }
    }
    static void printArray(int ans[]) {
        System.out.print(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4 };
        int n = arr.length;
        int ans[] = new int[n];
        pse(arr, n, ans);
        printArray(ans);
    
    }
    
}
