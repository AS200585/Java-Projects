//School class keeps information about the school(Students, Teachers, Total fees collected, Total money on teacher's salary)

//Implementing teachers and students using ArrayLists

import java.util.List;

public class School {
    private final List<Teacher> teachers;
    private final List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    //using static, we can access a method otherwise we have to create an instance of that method

    /**
     * New School object created
     * @param teachers list of teachers
     * @param students list of students
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * Adding 
     * @param teachers adds teachers
     * @param students adds students
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }
    public void addStudents(Student student) {
        students.add(student);
    }
    /**
     * @param moneyEarned total money earned
     * Adding the total money earned
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }
    /**
     * @param totalMoneySpent total money spent. Updated everytime
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent -= moneySpent;
    }

    /**
     * @return list of teachers
     * @return list of students
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public List<Student> getStudents() {
        return students;
    }
    /**
     * @return the total money earned
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    /**
     * @return the total money spent
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }


}