import java.util.Arrays;
import java.util.ArrayList;

public class arraysTest {
    public static void main(String[] args) {
       int[] numbers = {1, 2, 3};
       System.out.println(Arrays.toString(numbers));
       System.out.println(numbers.length);
        
       ArrayList<Integer> list = new ArrayList<>(); 
       list.add(10);
       list.add(20);
       list.add(30);
       list.remove(0);
       System.out.println(list);
       System.out.println(list.size());
           
        // Arrays numbers = new Arrays(length:3);
        // numbers.insert(item:10);
        // numbers.insert(item:20);
        // numbers.insert(item:30);
        // numbers.insert(item:40);
        // numbers.print();
        // System.out.println(numbers.indexOf(item:30));
    }
}

