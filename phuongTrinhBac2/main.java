package phuongTrinhBac2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double a, b, c, delta;

        Scanner input = new Scanner(System.in);
        System.out.println("PT:  ax2 + bx + c = 0 :");
        System.out.println("Enter a : ");
        a = input.nextDouble();
        System.out.println("Enter b : ");
        b = input.nextDouble();
        System.out.println("Enter c : ");
        c = input.nextDouble();
        System.out.println();
        PhuongTrinhBac2 sum = new PhuongTrinhBac2(a, b, c);
        delta = sum.getDiscriminant();
        if (delta > 0) {
            System.out.println("x1= " + sum.getRoot1());
            System.out.println("x2= " + sum.getRoot2());
        } else if (delta == 0) {
            System.out.println("x1 = x2 = " + sum.nghiemKep());
        } else {
            System.out.println("phuong trinh vo nghiem");
        }


    }
}
