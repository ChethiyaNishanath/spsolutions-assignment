import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ProblemSolving {

    ///////////////////////////////////////////
    // Problem 1
    private static int sumByForLoop(List<Integer> list) {

        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        int sum = 0;
        for(int item : list) {
            sum += item;
        }
        return sum;
    }

    private static int sumByWhileLoop(List<Integer> list) {

        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        int sum = 0;

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        return sum;

    }

    private static int sumByRecursion(List<Integer> list, int index) {

        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        if(index >= list.size()){
            return 0;
        }
        return list.get(index) + sumByRecursion(list, index+1);
    }

    public static void main(String[] args) {

        // Problem 1 execution
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);

        int sumFor = sumByForLoop(nums);
        System.out.println("Sum: "+sumFor);

        int sumWhile = sumByWhileLoop(nums);
        System.out.println("Sum: "+sumWhile);

        int sumByRecursion = sumByRecursion(nums, 0);
        System.out.println("Sum: "+sumByRecursion);

    }
}