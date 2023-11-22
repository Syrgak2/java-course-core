package colections;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNumber(nums);
        printEvenNumbers(nums);

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        printUniqueWord(strings);
        printCountDuplicate(strings);
    }

    private static void printOddNumber(List<Integer> nums) {
        List<Integer> oddNumbers = new ArrayList<>();

        oddNumbers = nums
                .stream()
                .filter(element -> (element % 2) == 0)
                .collect(Collectors.toList());

        System.out.println(oddNumbers);
    }

    private static void printEvenNumbers(List<Integer> nums) {
        Set<Integer> evenNumbers = new HashSet<>();

        evenNumbers = nums
                .stream()
                .filter(element -> (element % 2) != 0)
                .sorted()
                .collect(Collectors.toSet());

        System.out.println(evenNumbers);
    }

    private static void printUniqueWord(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);

        System.out.println(uniqueWords);

    }

    private static void printCountDuplicate(List<String> strings) {
        Map<String, Integer> countDuplicate = new HashMap<>();

        strings.forEach(element -> {
            if (countDuplicate.containsKey(element)) {
                countDuplicate.put(element, countDuplicate.get(element) + 1);
            } else {
                countDuplicate.put(element, 1);
            }
        });

        System.out.println(countDuplicate);
    }


}
