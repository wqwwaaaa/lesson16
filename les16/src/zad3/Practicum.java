package zad3;

public class Practicum {
    public static void main(String[] args) {
        FindRepeats check = new FindRepeats();
        int count = check.numberOfRepeats("раз два три, раз два три", "раз"); // вернёт 2
        System.out.println(count);
    }
}
