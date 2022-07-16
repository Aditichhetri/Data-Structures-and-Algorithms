package DsaOne.Stack;

public class ImplementKStacks {
    int arr[];
    int top[];//3n -->3 top
    int next[];//freespace and next element
    int n,s;//s-->size of array ,n-->stacks
    int freespot;
    ImplementKStacks(int n,int s){
        arr=new int [s];
        top=new int [n];
        next=new int[s];
        //Initialize top
        for(int i=0;i<n;i++){
            top[i]=-1;//Arrys.fill(top,-1);
        }
        //Initialize next
        for(int i=0;i<s;i++){
            next[i]=i+1;
        }
        next[s-1]=-1;
        freespot=0;
        
    }
    //Pushes x into mth stack
    boolean push(int x,int m){
        if(freespot==-1)//Stack Overflow
        return false;
        //find index
        int index=freespot;
        //Insert
        arr[index]=x;
        //update freespot
        freespot=next[index];
        //Update next
        next[index]=top[m-1];
        //Update top
        top[m-1]=index;
        return true;

    }
    int pop(int m){
        if(top[m-1]==-1)//Stack underflow
        return -1;
        int index=top[m-1];
        top[m-1]=next[index];
        next[index]=freespot;
        freespot=index;
        return arr[index];
    }
    public static void main(String[] args) {
        ImplementKStacks kStacks=new ImplementKStacks(3, 6);
        kStacks.push(10, 1);
        kStacks.push(210, 1);
        kStacks.push(50, 2);
        kStacks.push(100, 3);
        kStacks.push(160, 2);
        kStacks.push(70, 3);
        System.out.println(kStacks.pop(1));
        System.out.println(kStacks.pop(2));
        System.out.println(kStacks.pop(3));
    }
}
