package DsaOne.Array;

public class AddTwoArray {
    public static void main(String[] args) {
        int [] arr1={9,5,7,9};
        int [] arr2={2,1,6,2};//out:11741
        int ansarr[]=new int [arr1.length>arr2.length?arr1.length:arr2.length];
        int carry=0,sum=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        
                for(int k=ansarr.length-1;k>=0;k--){
                   if(i>=0 && j>=0){
                    sum=arr1[i]+arr2[j]+carry;
                   }
                   else if(i>=0 && j<0){
                    sum=arr1[i]+carry;
                   }
                   else if(i<0 && j>=0){
                    sum=arr2[i]+carry;
                }
                carry=sum/10;  
                sum=sum%10; 
                ansarr[k]=sum;
                i--;j--;
            }
            if(carry!=0){
                System.out.print(carry);
            }
        for(int e:ansarr){
            System.out.print(e);
         }

    }
    
}

