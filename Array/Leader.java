package DsaOne.Array;

public class Leader {
    public static void main(String[] args) {
        // An element is Leader if it is greater than all the elements to its right
  int arr[]={16,17,44,3,5,2};
  int leader=0;
  for(int i=arr.length-1;i>0;i--){
    if(arr[i]<arr[i-1]){
    leader=arr[i-1];}
    else{continue;}
  } 
  System.out.println(leader);
   
    }
    
}
