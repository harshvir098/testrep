package exDeArraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Student> students = new ArrayList<Student>();


    public static void main(String[] args) {


        boolean start = false;
        while (!start) {

            try {
                switch (menu()) {

                    case 1:
                        insertStudent();
                        break;

                    case 2:deleteStudent();
                    break;

                    case 3: modifyStudent();
                    break;

                    case 4: showAllStudent();
                    break;

                    default: System.out.println("Choose correct option.");
                        break;

                }
            } catch (Exception e) {
                System.out.println("Enter valid input");
            }


        }


    }

    public static int menu() {

        System.out.println("1: Insert new student");
        System.out.println("2: Delete Student");
        System.out.println("3: Modify Student");
        System.out.println("4: Display all student");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        try {
            choice = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Invalid input, please enter a number.");
        }
        return choice;
    }


    public static void insertStudent() throws IOException {
        System.out.println("You have selected option 1");

        System.out.print("Please enter your name: ");

        String nombre = br.readLine();

        System.out.print("Please enter your age: ");
        int age = Integer.parseInt(br.readLine());

        Student s = new Student();
        s.setName(nombre);
        s.setAge(age);
        students.add(s);


    }

    public static void showAllStudent() throws IOException {

        for (Student su : students) {
            System.out.println("Name: " + su.getName() + " age: " + su.getAge());

        }

    }

    public static void deleteStudent() throws IOException {
        System.out.print("Please enter the name of student you want to delete: ");
        String nombre = br.readLine();

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student su = iterator.next();
            if (nombre.equals(su.getName())) {
                iterator.remove();

                System.out.println("Student " + nombre + " has been deleted.");
                break;
            } else System.out.println("enter correct name");

    }


    }

    public static void modifyStudent() throws IOException {
        System.out.print("Please enter the name of student you want to modify: ");
        String nombre = br.readLine();

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student su = iterator.next();
            if (nombre.equals(su.getName())) {
                System.out.print("Please modified name: ");
                String modifiedname = br.readLine();

                System.out.print("Please modified age: ");
               int modifiedAge= Integer.parseInt(br.readLine());

               su.setAge(modifiedAge);
               su.setName(modifiedname);

                break;

            } else System.out.println("enter correct name");

        }


    }

    }