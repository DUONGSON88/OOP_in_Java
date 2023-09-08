package student;

import java.util.Scanner;

public class Main {
    static void spSanhAvg(Student a , Student b) {
        if (a.avg() > b.avg()) {
            System.out.println(a);
        } else if (a.avg() < b.avg()) {
            System.out.println(b);
        } else {
            System.out.println("Student 1 equals student 2's score");

        }
    }
    public static void main(String[] args) {
        String nameStudent;
        int age;
        double[] point;
        int size;
        Student[] list = new Student[2];
        Scanner input = new Scanner(System.in);
//        Student st1 = new Student("A", 11, new double[]{1, 2, 3});
//        System.out.println(st1);
        for (int i = 0; i < list.length; i++) {

            System.out.println("Enter name : ");
            nameStudent = input.nextLine();
            System.out.println("Enter age : ");
            age = input.nextInt();
            System.out.println("Enter size point:");
            size = input.nextInt();
            point = new double[size];
            int j = 0;
            while (j < point.length) {
                System.out.print("Enter element " + (j + 1) + " : ");
                point[j] = input.nextInt();
                j++;
            }
            list[i] = new Student(nameStudent, age, point);
            input.nextLine();
            System.out.println(list[i]);
        }

        int choice = -1;
        int vt;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("You can Edit : ");
            System.out.println("1. Edit name");
            System.out.println("2. Edit age ");
            System.out.println("3. Edit point");
            System.out.println("4. Average score comparison ");
            System.out.println("5. Edit ");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {

                case 1:
                    do {
                        System.out.println("Select Students :");
                        vt = input.nextInt();
                        input.nextLine();
                    } while (vt <= 0 || vt > list.length);
                    System.out.println("Enter new Name:");
                    String newName = input.nextLine();
                    list[vt - 1].editName(newName);
                    System.out.println(list[vt - 1]);
                    break;

                case 2:
                    do {
                        System.out.println("Select Students :");
                        vt = input.nextInt();
                        input.nextLine();
                    } while (vt <= 0 || vt > list.length);
                    System.out.println("Enter new Age:");
                    int newAge = input.nextInt();
                    list[vt - 1].editAge(newAge);
                    System.out.println(list[vt - 1]);
                    break;
                case 3:
                    do {
                        System.out.println("Select Students :");
                        vt = input.nextInt();
                        input.nextLine();
                    } while (vt <= 0 || vt > list.length);
                    System.out.println("Enter new Point:");
                    double[] newPoint = new double[list[vt - 1].getPointStudent().length];
                    for (int j = 0; j < newPoint.length; j++) {
                        System.out.print("Enter element " + (j + 1) + " : ");
                        newPoint[j] = input.nextDouble();
                    }
                    list[vt - 1].editPoint(newPoint);
                    System.out.println(list[vt - 1]);
                    break;
                case 4:
                    do {
                        System.out.println("Select Students1:");
                        vt = input.nextInt();
                        input.nextLine();
                    } while (vt <= 0 || vt > list.length);
                    Student st1= list[vt-1];
                    do {
                        System.out.println("Select Students2 :");
                        vt = input.nextInt();
                        input.nextLine();
                    } while (vt <= 0 || vt > list.length);
                    Student st2= list[vt-1];

                    spSanhAvg(st1,st2);
                case 5:
                    System.exit(5);
                default:
                    System.out.println("No choice!");

            }
        }
    }
}
