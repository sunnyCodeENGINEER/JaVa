import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListStudy {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(6);
        numbers.add(2);
        numbers.add(9);
        numbers.add(3);
        numbers.add(12);
        numbers.add(4);
        System.out.println(numbers.toString());
        System.out.println(numbers.get(2));

        // sorting an Array List
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers.toString());
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers.toString());
         
        // removing an exact element
        numbers.remove(Integer.valueOf(3));
        System.out.println(numbers.toString());

        // set an element in an Array List
        numbers.set(0, Integer.valueOf(75));
        System.out.println(numbers.toString());                     

        // clear an entire Array List
        numbers.clear();
        System.out.println(numbers.toString());

        // size of an Array List
        System.out.println(numbers.size());

        // check if an Array List contains a particular element
        System.out.println(numbers.contains(Integer.valueOf(80)));

        // check if Array List is empty
        System.out.println(numbers.isEmpty());

        numbers.add(1);
        numbers.add(6);
        numbers.add(2);
        numbers.add(9);
        numbers.add(3);
        numbers.add(12);
        numbers.add(4);
        // for each loops
        numbers.forEach(number -> {
            System.out.println(number * 2);
        });
    }
}
