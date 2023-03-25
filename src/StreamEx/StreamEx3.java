package StreamEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx3 {
    public static void main(String[] args) {
        streamFilter();
        streamMap();
        streamSort();
    }

    private static void streamMap() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        words.stream()
                .map(String::length)
                .forEach(System.out::println);
    }

    private static void streamFilter(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    private static void streamSort(){
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        words.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}
