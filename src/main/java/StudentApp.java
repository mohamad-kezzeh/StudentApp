import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        String name1 = input.nextLine();
        System.out.print("Email: ");
        String email1 = input.nextLine();
        System.out.print("Course: ");
        String course1 = input.nextLine();


        Student student1 = new Student();
        student1.setName(name1);
        student1.setEmail(email1);
        student1.setCourse(course1);


        System.out.println("\nEnter details for Student 2:");
        System.out.print("Name: ");
        String name2 = input.nextLine();
        System.out.print("Email: ");
        String email2 = input.nextLine();
        System.out.print("Course: ");
        String course2 = input.nextLine();


        Student student2 = new Student(name2);
        student2.setEmail(email2);
        student2.setCourse(course2);


        System.out.println("\nEnter details for Student 3:");
        System.out.print("Name: ");
        String name3 = input.nextLine();
        System.out.print("Email: ");
        String email3 = input.nextLine();
        System.out.print("Course: ");
        String course3 = input.nextLine();


        Student student3 = new Student(name3, email3, course3);

        System.out.println("\nStudent 1 Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Email: " + student1.getEmail());
        System.out.println("Course: " + student1.getCourse());

        System.out.println("\nStudent 2 Details:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Email: " + student2.getEmail());
        System.out.println("Course: " + student2.getCourse());

        System.out.println("\nStudent 3 Details:");
        System.out.println("Name: " + student3.getName());
        System.out.println("Email: " + student3.getEmail());
        System.out.println("Course: " + student3.getCourse());



    }
}