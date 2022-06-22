package DsaOne.Array;

import java.util.Scanner;


public class CRUDOperations {
    public static void main(String[] args) {
        CRUDOperations opr = new CRUDOperations(5);
        Scanner sc = new Scanner(System.in);

        int choice, index, value;

        while (true) {
            System.out.println("Press 1:Insert at specific Positon");
            // System.out.println("Press 2:Delete at specific Positon");
            // System.out.println("Press 3:Search in Array");
            System.out.println("Press 4:Print the Array");
            // System.out.println("Press 5:Update the Array");
            // System.out.println("Press 6:Exit");

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
                // case 2 : {delete(arr[],postion);
                // break;}
                // case 3 : {search(arr[],key);
                // break;}
                case 4: {
                    opr.print();
                    break;
                }
                // case 5 : {update(arr[]);
                // break;}
                // default : {exit();
                // break;}
            }

        }

    }

    int size ;
    int arr[];
     CRUDOperations(int capacity){
        this.arr=new int[capacity];
        int size =0;
     }

    void insert(int index, int value) {
        if (index > size) {
            System.out.println("Position can't be greater than size");
        }
        if (size == arr.length) {
            System.out.println("Array full can't add more elements");
        }

        for(int i=size-1;i>=index;i--){
           arr[i+1]= arr[i];
        }
        arr[index]=value;
        size++;
        print();




    }

    void print() {
        for(int element:arr)
        {
            System.out.println(element);
        }

    }

}
