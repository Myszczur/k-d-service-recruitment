
# K-D-Service-Recruitment

 Tasks performed for the recruitment process


## Authors

- [@Myszczur](https://www.github.com/Myszczur)


## Tech Stack

**Tools:** IntellIj IDE



## Appendix

Zadanie 1

     * Napisz ciało metody createPicture(int n), która dla dowolnego n > 0 stworzy gotowy do wypisania w konsoli wzór.
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
    public static String createPicture(int n) {
        //ciało metody
        return "";
    }

    public static void main(String[] args) {
        System.out.println(createPicture(4));
    }
}

Zadanie 2 


import java.util.ArrayList;

public class Zadanie2 {

    /**
     * Liczba doskonała to liczba, której suma dzielników bez niej samej równy jest tej liczbie
     * 6 jest liczbą doskonałą, bo jej dzielniki to: 1,2,3,6 a 1+2+3 = 6
     * 28 jest liczbą doskonałą, bo jej dzielniki to: 1,2,4,7,28 a 1+2+4+7 = 28
     *
     * Zadanie: napisz ciało metody findNPerfectNumbers, która znajdzie n pierwszych liczb doskonałych i zwróci je w postaci listy
     */
    public static ArrayList<Integer> findNPerfectNumbers(int n) {
        //ciało metody
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        System.out.println(findNPerfectNumbers(4));
    }
}

Zadanie 3
public class Zadanie3 {

    /**
     * Z publicznego API: https://jsonplaceholder.typicode.com pobierz wszystkie zapisane posty znajdujące się pod adresem
     * https://jsonplaceholder.typicode.com/posts tak by po wywołaniu metody getPosts() można było wypisać wszystkie elementy w konsoli,
     * podobnie jak wypisuje je przeglądarka po wejściu w link.
     *
     * Można skorzystać z dowolnych sposobów pobierania danych z API dostępnych dla języka Java.
     * */
    public static String getPosts() {
        return "";
    }

    public static void main(String[] args) {
        System.out.println(getPosts());
    }

}

