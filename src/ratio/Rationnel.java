package ratio;

public class Rationnel {
    private int num;
    private int den;

    public Rationnel(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    public Rationnel addition(Rationnel r2) {
        int denumerateurResult = den * r2.getDen();
        int numerateurResult = num*r2.getDen() + r2.getNum()*den;
        return new Rationnel(numerateurResult, denumerateurResult).simplifier();
    }

    private static int pgcd(int a, int b) {
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        if (a == b) return a;
        else if (a > b) return pgcd (a-b, b);
        else if (b > a) return pgcd (a, b - a);
        return 1;
    }

    public Rationnel simplifier() {
        int gcd = pgcd(num, den);
        return new Rationnel(num / gcd, den / gcd);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rationnel rationnel = (Rationnel) obj;
        if (num != rationnel.num) return false;
        return den == rationnel.den;
    }

    @Override
    public int hashCode() {
        int result = num;
        result = 31 * result + den;
        return result;
    }

    public Rationnel soustraction(Rationnel r2) {
        int denumerateurResult = den * r2.getDen();
        int numerateurResult = num*r2.getDen() - r2.getNum()*den;
        return new Rationnel(numerateurResult, denumerateurResult).simplifier();
    }

}
