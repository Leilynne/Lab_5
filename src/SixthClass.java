public class SixthClass {
    private int min;
    private int max;

    public SixthClass(int m, int n) {
        this.min = Math.min(n, m);
        this.max = Math.max(n, m);
    }

    public void method(int n, int n2) {
       this.min = Math.min(Math.min(min, n), n2);
       this.max = Math.max(Math.max(n2, n), max);
    }

    public void method(int n) {
        this.max = Math.max(max, n);
        this.min = Math.min(n, min);
    }

    public void print() {
        System.out.println("Максимум: " + max + "\nМинимум: " + min);
    }
}
