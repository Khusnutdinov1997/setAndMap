import java.util.*;

public class Main {

    private static final List<Integer> numbers = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("csf","csf","abc","etr","etr","ad", "ad"));


    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    public static void exercise1() {
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    public static void exercise2() {
        Collections.sort(numbers);

        int previousNumber = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number % 2 == 0 && number != previousNumber) {
                System.out.println(number);
                previousNumber = number;
            }
        }
    }

    public static void exercise3() {
        Set<String> uniqueNumber = new HashSet<>(words);
        System.out.println(uniqueNumber);
    }

    public static void exercise4() {
        Set<String> uniqueNumber = new HashSet<>(words);
        System.out.println(words.size() - uniqueNumber.size());
    }
}