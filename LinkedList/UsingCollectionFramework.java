package DsaOne.LinkedList;

import java.util.LinkedList;
public class UsingCollectionFramework {
    public static void main(String[] args) {
        LinkedList <String> list=new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.add("List");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("NULL");
        list.removeFirst();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
    
}
