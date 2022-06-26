package DsaOne.Array;

import java.util.Arrays;
import java.util.HashMap;

public class PairSum {
    public static void main(String[] args) {
        int arr[] = { 2, 9, 6, 3, 1, 10, 4 };
        int k = 9;
        // Approach 1
        for (int i = 0; i <arr.length; i++) {
        for(int j=i+1;j<arr.length;j++){
        if(arr[j]+arr[i]==k){
        System.out.println("["+arr[i]+","+arr[j]+"]");

        }
        }
        }

        // Approach 2-Array is sorted
        Arrays.sort(arr);
        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println();
        int key = 9;
        int first=0, last=arr.length-1;
       while(first<last){
        if(arr[first]+arr[last]==key){
            System.out.println("["+arr[first]+","+arr[last]+"]");
            return;
        }
       
       if((arr[first]+arr[last])<key)
       first++;
       else if((arr[first]+arr[last])>key)
       last--;
    }

// Approach 3-HashMap
HashMap <Integer,Integer> map=new HashMap<>();

for(int element:arr){
    if(map.get(element)==null){
        map.put(k-element,element);
    }
    else
    {
        System.out.print("["+map.get(element)+","+element+"]");
    }
}

    }}