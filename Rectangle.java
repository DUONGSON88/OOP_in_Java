import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Scanner;

public class Rectangle {
    public int length;
    public int width;


    public Rectangle(int lengthInput, int widthInput) {
        this.length = lengthInput;
        this.width = widthInput;
    }

    public int S() {
        return this.length * this.width;
    }

    public int C() {
        return (this.length + this.width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

class showRectangle {
    public static void main(String[] args) {
        int chieuDai;
        int chieuRong;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter lenght of Rectangle : ");
            chieuDai = input.nextInt();
            System.out.println("Enter width of Rectangle : ");
            chieuRong = input.nextInt();

            if (chieuDai == chieuRong) {
                System.out.println("Please don't enter 2 same values. Enter again please !");
            }else if (chieuDai < chieuRong) {
                System.out.println("In a rectangle the length must be greater than the width.Enter again please ! ");
            }else {
                Rectangle rec = new Rectangle(chieuDai, chieuRong);
                System.out.println(rec);
                System.out.println("1: S= " + rec.S() + " , C=" + rec.C());
            }

        } while (chieuDai == chieuRong || chieuDai<chieuRong);




    }
}
