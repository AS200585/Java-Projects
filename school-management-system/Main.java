import java.util.ArrayList;
import java.util.List;

public class Main {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {  
        Teacher jenny = new Teacher("Jenny", 1, 600);
        Teacher matilda = new Teacher("Matilda", 2, 700);
        Teacher drew = new Teacher("Drew", 3, 800);
        Teacher hesh = new Teacher("Hesh", 4, 900);

        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(jenny);
        teachersList.add(matilda);
        teachersList.add(drew);
        teachersList.add(hesh);


        Student lizzy = new Student("Lizzy", 10, 11);
        Student sarah = new Student("Sarah", 11, 11);
        Student andrew = new Student("Andrew", 12, 11);
        Student logan = new Student("Logan", 13, 11);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(lizzy);
        studentsList.add(sarah);
        studentsList.add(andrew);
        studentsList.add(logan);

        School hsps = new School(teachersList, studentsList);

        // dddd

        lizzy.payFees(5000);
        sarah.payFees(6000);
        andrew.payFees(7000);
        logan.payFees(8000);
        System.out.println("Total money earned by hsps : $" + hsps.getTotalMoneyEarned());

        andrew.payFees(4500);
        lizzy.payFees(4000);
        System.out.println("Total money earned by hsps : $" + hsps.getTotalMoneyEarned());

        System.out.println("             "); //leaving space in between
        System.out.println("----Making School Pay Salary----");
        System.out.println("             ");

        jenny.recieveSalary(jenny.getTotalSalary());
        System.out.println("Total money spent by hsps : $" + hsps.getTotalMoneySpent());

        System.out.println(andrew);
        System.out.println(jenny);
    }
}
