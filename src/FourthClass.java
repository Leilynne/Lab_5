public class FourthClass {
    private char symbol;
    private int number;


    public FourthClass(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public FourthClass(double charNumber) {
        this.symbol = (char) charNumber;
        this.number = (int) (charNumber * 100 % 100);
    }
}
