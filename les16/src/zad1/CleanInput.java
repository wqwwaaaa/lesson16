package zad1;

public class CleanInput {
    public static String fixString(String str) {
        if (str == null || str.isBlank()) {
            return "Вы ничего не ввели!";
        } else {
            return str.trim();
        }
    }
}