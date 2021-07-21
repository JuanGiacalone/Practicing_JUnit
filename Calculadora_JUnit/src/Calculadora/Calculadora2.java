package Calculadora;

public class Calculadora2 {

    private int ans;

    public Calculadora2 () {
        ans = 0;
    }
    public int add (int a, int b) {
        ans = a + b;
        return ans;
    }

    public int sub (int a, int b) {
        ans = a - b;
        return ans;
    }

    public int add (int value) {
        ans += value;
        return ans;
    }

    public int sub (int value) {
        ans -= value;
        return ans;
    }

    public int getAns() {
        return ans;
    }

    public void clear() {
        ans = 0;
    }
}
