package DsaOne.Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
//Naive Solution-Using Array
    static void calculateSpan(int arr[], int n, int ans[]) {
        ans[0]=1;
        for (int i = 1; i < n; i++) {
          ans[i]=1;
          for(int j=i-1;(j>=0)&&(arr[i]>=arr[j]);j--)
          ans[i]++;
        }

    }
    //Optimized-Using Stack
    static void approach2(int arr[],int n,int ans[]){
       Stack <Integer>stack=new Stack<>();
       stack.push(0);
       ans[0]=1;
       for(int i=1;i<n;i++){
        while(!stack.isEmpty()&&arr[i]>arr[stack.peek()])
        stack.pop();
        ans[i]=(stack.empty())?(i+1):(i-stack.peek());
        stack.push(i);
       } 
    }

    static void printArray(int ans[]){
            System.out.print(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 75, 85};
        int n = arr.length;
        int ans[] = new int[n];
        // calculateSpan(arr, n, ans);
        // printArray(ans);
        approach2( arr, n,ans);
        printArray(ans);

    }

}
