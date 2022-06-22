package DsaOne.Array;

public class First {//extends object class
    public static void main(String[] args) {
        double salary []=new double[10];
      
        // for(int i=0;i<salary.length;i++){
        //     System.out.print(salary[i]);
        // }

        //Enhanced for loop-->cannot print in reverse order
        // for(double i : salary)
        // System.out.println(i);

        //Declaration 
        // double [] sal=new double[10];
        // double sal[]={1,35,6,3};
        // double sal[]=new double[]{23,51,3};
//Refrence: class_name@hexadecimal hashcode
    
First obj=new First();//internally:obj.toString-->it typecast{By this we can find reference }
System.out.println(obj);//DsaOne.Array.First@73d4cc9e
}
}
