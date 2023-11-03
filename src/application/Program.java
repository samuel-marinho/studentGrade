package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Student stud = new Student();

        System.out.print("Enter student's name: ");
        stud.name = sc.nextLine();
        System.out.print("Enter student's grade: ");
        stud.grade1 = sc.nextDouble();
        stud.grade2 = sc.nextDouble();
        stud.grade3 = sc.nextDouble();

        System.out.printf("Final grade: %.2f%n", stud.finalGrade());
        if (stud.finalGrade() > 60){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");
            double failed = 60 - stud.finalGrade();
            System.out.println("Missing "+ failed + " points");
        }

    }
}
