package student;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String nameStudent;
    private int ageStudent;
    private double[] pointStudent;

    public double[] getPointStudent() {
        return pointStudent;
    }


    public Student(String nameInput, int ageInput, double[] pointInput) {
        this.nameStudent = nameInput;
        this.ageStudent = ageInput;
        this.pointStudent = pointInput;
    }

    public double avg() {

        double sum = 0;
        for (int i = 0; i < pointStudent.length; i++) {
            sum += pointStudent[i];

        }
        return sum / pointStudent.length;


    }

    public void editName(String newName) {
        this.nameStudent = newName;
    }

    public void editAge(int newAge) {
        this.ageStudent = newAge;
    }

    public void editPoint(double[] newPoint) {
        this.pointStudent = newPoint;
    }



    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", ageStudent=" + ageStudent +
                ", pointStudent=" + Arrays.toString(pointStudent) +
                ",AVG point=" + avg() +
                '}';
    }
    

}


