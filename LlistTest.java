import java.util.LinkedList;

public class LlistTest {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addFirst(30);
        list.addFirst(20);
        var array = list.toArray();
        System.out.println(list.indexOf(10));
        System.out.println(list.contains(20));
        System.out.println(list);
    }
}
