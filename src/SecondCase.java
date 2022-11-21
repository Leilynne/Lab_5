public class SecondCase {
    private final char first = 'a';
    private final char second = 'd';

    public void printChars() {
        char temp = first;
        while (temp <= second) {
            System.out.print(temp++ + " ");
        }
    }
}
