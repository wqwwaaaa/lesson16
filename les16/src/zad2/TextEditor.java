package zad2;

public class TextEditor {
    private boolean isCapsLock = false;
    public void capsLock() {
        isCapsLock = !isCapsLock;
    }
    public void print(String str) {
        if (isCapsLock) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str);
        }
    }
}
