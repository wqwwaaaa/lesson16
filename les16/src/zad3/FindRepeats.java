package zad3;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;
        int index = 0;
        if (substring.isEmpty()) {
            return 0;
        }
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }
}