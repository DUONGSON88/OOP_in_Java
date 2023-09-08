package phuongTrinhBac2;

public class PhuongTrinhBac2 {
    private double a, b, c;

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta;
        delta = this.b * 2 - 4 * this.a * this.c;
        return delta;

    }
    public double nghiemKep(){
        double rKep;
        rKep=-this.b/(2*this.a);
        return rKep;
    }
    public double getRoot1(){
        double r1;
        r1= (-this.b+(Math.sqrt((this.b*this.b)-4*this.a*this.c)) )/ (2*this.a);
        return r1;
    }
    public double getRoot2(){
        double r2;
        r2= (-this.b-(Math.sqrt((this.b*this.b)-4*this.a*this.c)) )/ (2*this.a);
        return r2;
    }
}
