package com.company;
import Student.Student;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input count of student: ");
        int size = in.nextInt();
        Student[] students = new Student[size];
        StudentArray(students);
        for (Student value : students){
            System.out.println(value.toString());
        }
        FindAndPrintStudentsOfAGivenFaculty(students, in);
        FindAndPrintStudentsBornAfterTheSpecifiedYear(students, in);
        FindAndPrintStudentsOfAGivenGroup(students,in);
        in.close();
    }


    static void ScanStudent(Student[] students, Scanner in) {
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("----------------------");
            System.out.print("Input id of student: ");
            students[i].setId(in.nextLong());
            in.nextLine();
            System.out.print("Input surname of student: ");
            students[i].setSurname(in.nextLine());
            System.out.print("Input middle name of student: ");
            students[i].setMiddleName(in.nextLine());
            System.out.print("Input date of birth of student: ");
            students[i].setDateOfBirth(in.nextInt());
            System.out.print("Input address of student: ");
            students[i].setAddress(in.nextLine());
            System.out.print("Input tel.number of student: ");
            students[i].setTelNumber(in.nextInt());
            System.out.print("Input faculty of student: ");
            students[i].setFaculty(in.nextLine());
            System.out.print("Input course of student: ");
            students[i].setCourse(in.nextInt());
            System.out.print("Input group of student: ");
            students[i].setGroup(in.nextLine());



        }
    }

    static void StudentArray(Student[] students) {
        Random random = new Random();
        String[] surname = {"МЕЛЬНИК","ШЕВЧЕНКО","БОЙКО", "КОВАЛЕНКО", "БОНДАРЕНКО", "ТКАЧЕНКО", "КОВАЛЬЧУК",
                "КРАВЧЕНКО", "ОЛІЙНИК", "ШЕВЧУК", "КОВАЛЬ", "ПОЛІЩУК","БОНДАР","ТКАЧУК", "МОРОЗ",
                "МАРЧЕНКО", "ЛИСЕНКО","РУДЕНКО","САВЧЕНКО","ПЕТРЕНКО"  };
        String[] name={   "ОЛЕКСІЙ", "ГРИГОРІЙ", "ВІТАЛІЙ", "ІГОР", "ДМИТРО" , "ОЛЕГ", "ВАЛЕРІЙ" ,"ЛЕОНІД" , "ПАВЛО" , "СТЕПАН",  "РОМАН","БОРИС",
                "МИКОЛА",  "ВОЛОДИМИР", "ОЛЕКСАНДР" , "ІВАН" , "ВАСИЛЬ" , "СЕРГІЙ", "ВІКТОР", "АНАТОЛІЙ", "МИХАЙЛО"     };
        String[] middleName = { "ФЕДОРОВИЧ" , "ВАЛЕНТИНОВИЧ" , "ЄВГЕНОВИЧ" , "ЯРОСЛАВОВИЧ", "ВЯЧЕСЛАВОВИЧ", "БОГДАНОВИЧ" ,
                "СТАНІСЛАВОВИЧ" , "МИКОЛАЙОВИЧ", "СЕРГІЙОВИЧ" , "ЮРІЙОВИЧ","ОЛЕКСІЙОВИЧ","ПАВЛОВИЧ","ВАЛЕРІЙОВИЧ"    };
        String[] address = {"Літня ", "Смородинова ","Медова ","Фіалкова ", "Липова ","Польова ","Паркова ","Підгірна ",
        "Вереснева ","Травнева ","Стрітенська ","1 Травня ", "Радісна ","Творча ","Ясна "};
        String[] faculty = {"ІАРД", "ІГСН" , "ІКТА" , "ІППО", "ІКНІ" , "ІНЕМ" };
        String[] group = {"AB", "IT", "IK","AP", "AT", "EB","EE","KI","KH","MB"};
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setId(random.nextInt(9999999));
            students[i].setSurname(surname[random.nextInt(surname.length)]);
            students[i].setName(name[random.nextInt(name.length)]);
            students[i].setMiddleName(middleName[random.nextInt(middleName.length)]);
            students[i].setDateOfBirth(random.nextInt(5) + 1998);
            students[i].setAddress(address[random.nextInt(address.length)] + random.nextInt((25)+10)) ;
            students[i].setTelNumber(random.nextInt(49999999) + 380950000000L);
            students[i].setFaculty(faculty[random.nextInt(faculty.length)]);
            students[i].setCourse(random.nextInt(3)+1 );
            students[i].setGroup(group[random.nextInt(group.length)] ); ;

        }



    }
    static void FindAndPrintStudentsOfAGivenFaculty( Student[] students, Scanner in){
        System.out.print("Input faculty about which you wanna get info: ");
        in.nextLine();
        String faculty = in.nextLine();
        for (Student value : students) {
            if (value.getFaculty().equals(faculty)) {
                System.out.println(value.toString());
            }
        }
    }
    static void FindAndPrintStudentsBornAfterTheSpecifiedYear(Student[] students, Scanner in){

        System.out.print("Input year : ");
        int year = in.nextInt();
        for (Student value : students){
            if(value.getDateOfBirth() > year){
                System.out.println(value.toString());
            }
        }
    }
    static void FindAndPrintStudentsOfAGivenGroup(Student[] students, Scanner in){

        System.out.print("Input group: ");
        String groups = in.next();
        in.nextLine();
        for (Student value: students){
            if(value.getGroup().equals(groups)){
                System.out.println(value.toString());
            }

        }
    }



}
