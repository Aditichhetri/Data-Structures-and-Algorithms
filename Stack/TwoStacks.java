package DsaOne.Stack;

public class TwoStacks {
        int size;
        int [] arr;
        int top1,top2;
        TwoStacks(int n){
            arr=new int [n];
            size=n;
            top1=-1;
            top2=size;
        }
    void push1(int data){ 
        if(top1<top2-1) {
        top1++;
        arr[top1]=data;}
        else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        
    }
    void push2(int data){
        if(top1<top2-1){
        top2--;
        arr[top2]=data;}
        else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
       
    }
    int pop1(){
       if(top1>=0){ 
        int t=arr[top1];
        top1--;
    return t;}
    else{
    System.out.println("Stack Underflow");
    System.exit(0);
}
    return 0;
       
    }
    int  pop2(){
        if(top2<size){
            int t=arr[top2];
            top2++;
        return t;}
        else{
        System.out.println("Stack Underflow");
        System.exit(0);}
        return 0;

    }
    public static void main(String[] args) {
        TwoStacks ts=new TwoStacks(6);
        ts.push1(20);
        ts.push2(10);
        ts.push2(40);
        ts.push1(50);
        ts.push2(60);
        ts.push2(70);
        System.out.println("Popped from stack1 "+ts.pop1());
        System.out.println("Popped from stack2 "+ts.pop2());
    }
    
}
