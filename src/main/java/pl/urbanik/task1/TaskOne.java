package pl.urbanik.task1;

/** Napisz ciało metody createPicture(int n), która dla dowolnego n > 0 stworzy gotowy do wypisania w konsoli wzór.
 *
 * Przykłady:
 *
 * Dla n = 1 w konsoli powinien pojawić się wzór:
 * 1
 *
 * Dla n = 2 w konsoli powinien pojawić się wzór:
 * 2 2 2
 * 2 1 2
 * 2 2 2
 *
 * Dla n = 3 w konsoli powinien pojawić się wzór:
 * 3 3 3 3 3
 * 3 2 2 2 3
 * 3 2 1 2 3
 * 3 2 2 2 3
 * 3 3 3 3 3
 *
 * Dla n = 4 w konsoli powinien pojawić się wzór:
 * 4 4 4 4 4 4 4
 * 4 3 3 3 3 3 4
 * 4 3 2 2 2 3 4
 * 4 3 2 1 2 3 4
 * 4 3 2 2 2 3 4
 * 4 3 3 3 3 3 4
 * 4 4 4 4 4 4 4
 *
 */

public class TaskOne {

    public static String createPicture(int n) {
        if (n < 0) {
            return "n must be greater than zero! ";
        } else {
            for (int k = -n + 1; k <= n - 1; k++) {
                int i = n - 1 - Math.abs(k);
                for (int j = n; j > n - i; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 0; j < 2 * (n - i) - 1; j++) {
                    System.out.print(n - i + " ");
                }
                for (int j = n - i + 1; j <= n; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(createPicture(4));
        System.out.println("--------------------------------");
        System.out.println(createPictureTwo(4));
    }

    /**
    * Drugie lepsze rozwiązanie problemu
    *
    * */
    private static String createPictureTwo(int n) {
        StringBuilder result = new StringBuilder();
        if (n < 0) {
            return "n must be greater than zero! ";
        } else {
            for (int k = -n + 1; k <= n - 1; k++) {
                int i = n - 1 - Math.abs(k);
                for (int j = n; j > n - i; j--) {
                    result.append(j).append(" ");
                }
                for (int j = 0; j < 2 * (n - i) - 1; j++) {
                    result.append(n - i).append(" ");
                }
                for (int j = n - i + 1; j <= n; j++) {
                    result.append(j).append(" ");
                }
                result.append("\n");
            }
        }
        return result.toString();
    }
}
