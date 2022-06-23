package DsaOne.Array;

import java.util.Scanner;


public class CRUDOperations {

    int size;
    int arr[];
     CRUDOperations(int capacity){
        this.arr=new int[capacity];
         int size =0;
     }

    void insert(int index, int value) {

        if (index > size) {
            System.out.println("Position can't be greater than size");
        }
       
        if (size == arr.length){ 
        
            System.out.println("Array full can't add more elements");
        }

        for(int i=size-1;i>=index;i--){
           arr[i+1] = arr[i];
        }
        arr[index]=value;
        size++;
        System.out.println("element added");
        print();
    }

    void remove(int index1){
        if(size==0){
            System.out.println("Array is empty you cant remove further");
        }
        for(int i=index1;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        arr[size-1]=0;
        System.out.println("Element Deleted ");
        size--;
        print();

    }

    int search(int value)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==value){
                
                System.out.println("Element found at:"+ i +"th positon");
               return 1;
            }
        }
                System.out.println("Element not found!!");
            
        return -1;
    }
     
    void update(int index,int value ){
    //  for(int i=0;i<arr.length;i++){ //int update
    //     if(arr[i]==arr[index]){
    //     arr[i]=value;
    //     print();
    //     return 1;
    //     }
    // }
    //     return -1;
    int ans=search(value);
    if(ans==-1){
        return ;
    }
    else{
        arr[ans]=value;
        System.out.println("Array Updated");
        print();
    }

       
    }


    void print() {
        for(int element:arr)
        {
            System.out.println(element);
        }

    }
   


    public static void main(String[] args) {
        CRUDOperations opr = new CRUDOperations(5);
        Scanner sc = new Scanner(System.in);

        int choice, index, value;

        while (true) {
             System.out.println("Press 1:Insert at specific Positon");
             System.out.println("Press 2:Delete at specific Positon");
             System.out.println("Press 3:Search in Array");
             System.out.println("Press 4:Print the Array");
             System.out.println("Press 5:Update the Array");
             System.out.println("Press 6:Exit");

            System.out.println("Enter your Choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter the index");
                    index = sc.nextInt();
                    System.out.println("Enter the value");
                    value = sc.nextInt();
                    opr.insert(index, value);
                    break;
                }
                 case 2 : {
                    System.out.println("Enter the index");
                    index= sc.nextInt();
                    opr.remove(index);
                break;
                }
                case 3 : {
                    System.out.println("Enter the element to find");
                    value=sc.nextInt();
                    opr.search(value);
                break;
                }
                case 4: {
                    opr.print();
                    break;
                }
                case 5 : {
                    System.out.println("Enter the index ");
                    index=sc.nextInt();
                    System.out.println("Enter the value ");
                    value=sc.nextInt();
                    opr.update(index, value);
                break;
                }
                default : {
                    System.exit(0);
                    break;
                }
            }

        }

    }

}
