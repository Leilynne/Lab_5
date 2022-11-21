public class FifthClass {

    private int number;

    public FifthClass(int number) {
        this.number = Math.max(number, 100);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = Math.max(number, 100);
    }

    public void setNumber() {
        this.number = 0;
    }
}
