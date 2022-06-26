package DsaOne.Array;

public class ConverttoZigzag {
    public static void main(String[] args) {
        //a<b>c
        int  [] arr={4,3,2,8,6,7,1};
        int temp;
        boolean flag=true;

        for(int i=0;i<arr.length-1;i++){
            if(flag){
          
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                }
            }
            else{
                if(arr[i]<arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            flag =! flag;
        }
        for(int e:arr){
        System.out.print(e+ " ");
    }
}
    
}
