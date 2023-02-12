import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        List<Integer> values = Arrays.asList(1, 2, 30, -43, 5, -16, 7, 48, 89);

        //Internal Iteration
        values.forEach(i -> System.out.print(i + " "));
        System.out.println();

        //stream
        values.parallelStream().forEach(i -> System.out.print(i + " "));
        System.out.println();
        //Sum using stream
        int sum = values.stream()
                .reduce(0, (a, b) -> a + b);
        int sum1 = values.stream().
                reduce(0, Integer::sum);

        System.out.println("Sum : " + sum);
        int max = values.stream()
                .reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("Max : " + max);


        values.stream()
                .filter(i -> i > 0)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        Optional<Integer> firstNegative = values.stream()
                                                .filter(i->i<0).findFirst();
        System.out.println(firstNegative);

        int[] arr1={1,2,3,4,4,5};
        int[] arr2={1,2,3,4,5};
        boolean isSubset = Arrays.stream(arr1).allMatch(x-> Arrays.stream(arr2).anyMatch(y->x==y));
        System.out.println(isSubset);

        new Random().ints().limit(10).forEach(i->System.out.print(i+" "));
        System.out.println();

        List<Integer> numbers = Arrays.asList(1,4,3,6,7,2,4);
        List<Integer> squares = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
        squares.forEach(i->System.out.print(i+" "));
        System.out.println();

        IntSummaryStatistics stats = numbers.stream().mapToInt(i->i).summaryStatistics();
        System.out.println("Max is "+stats.getMax());
        System.out.println("Min is "+stats.getMin());
        System.out.println("Sum is "+stats.getSum());
        System.out.println("Average is "+stats.getAverage());



    }
}