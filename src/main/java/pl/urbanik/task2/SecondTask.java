package pl.urbanik.task2;

import java.util.ArrayList;

/**
 * Liczba doskonała to liczba, której suma dzielników bez niej samej równy jest tej liczbie
 * 6 jest liczbą doskonałą, bo jej dzielniki to: 1,2,3,6 a 1+2+3 = 6
 * 28 jest liczbą doskonałą, bo jej dzielniki to: 1,2,4,7,28 a 1+2+4+7 = 28
 * <p>
 * Zadanie: napisz ciało metody findNPerfectNumbers, która znajdzie n pierwszych liczb doskonałych i zwróci je w postaci listy
 */


public class SecondTask {

    public static ArrayList<Integer> findNPerfectNumbers(int n) {
        ArrayList<Integer> perfectNumbers = new ArrayList<>();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                perfectNumbers.add(i);
            }
        }
        return perfectNumbers;
    }

    public static Integer sumArrayList(ArrayList<Integer> perfectNumbers) {
        return perfectNumbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(findNPerfectNumbers(4));
        int result = sumArrayList(findNPerfectNumbers(4));

        if(result == 4){
            System.out.println("That is the perfect number");
        }else {
            System.out.println("This is not a perfect number");
        }
    }
}
