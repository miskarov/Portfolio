package university;


import java.util.Locale;

public class Run {
    public static void main(String[] args) {
        Student st1 = new Student("Vasya");
        Student st2 = new Student("Petya");
        Student st3 = st1;
        System.out.println(st1.equals(st3));
        System.out.println(st1);
        System.out.println(st2);

    }
}

