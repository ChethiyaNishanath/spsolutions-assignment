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


    ///////////////////////////////////////////
    // Problem 2
    private static List<String> combineTwoLists(List<String> list1, List<String> list2) {

        if (list1 == null || list1.isEmpty() || list2 == null || list2.isEmpty()) {
            throw new IllegalArgumentException("Lists cannot be null or empty");
        }

        List<String> combined = new ArrayList<>();

        int maxSize;

        if(list1.size() < list2.size()) {
            maxSize = list2.size();
        }else {
            maxSize = list1.size();
        }

        for(int i = 0; i < maxSize ; i++) {
            if(list1.size() > i && list1.get(i) != null) {
                combined.add(list1.get(i));
            }
            if(list2.size() > i && list2.get(i) != null) {
                combined.add(list2.get(i));
            }
        }

        return combined;
    }

    ///////////////////////////////////////////
    // Problem 3
    private static List<Long> getFibonacciSeries(int n) {
        List<Long> fibonacciSeries = new ArrayList<>();
        fibonacciSeries.add(0L);
        fibonacciSeries.add(1L);

        long first = 0;
        long second = 1;

        for (int i = 1 ; i < n - 1 ; i++) {
            long next = first + second;
            first = second;
            second = next;
            fibonacciSeries.add(next);
        }

        return fibonacciSeries;
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


        
        // Problem 2 execution
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");

        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");

        List<String> combined = combineTwoLists(list1, list2);
        System.out.println(combined);

         // problem 3 execution
        List<Long> fibonacciSeris = getFibonacciSeries(100);
        System.out.println(fibonacciSeris);

    }
}