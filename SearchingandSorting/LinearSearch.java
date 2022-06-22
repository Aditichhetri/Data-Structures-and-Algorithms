package DsaOne.SearchingandSorting;

public class LinearSearch {
    
    public static void main(String[] args) {
        int array[]={22,35,99,143,24,33,1,27,99};
        int key=99;
        int flag=0;
        
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                System.out.println("found at: "+(i+1)+"th position");
                flag=1;
                break;

            }
          
        }
        if(flag==0){System.out.println("Not Found");}
    }
}
