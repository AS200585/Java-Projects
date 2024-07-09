//Teacher class to keep information of teachers(Name, ID, totalSalary)

public class Teacher {
    private final String name;
    private final int id;
    private int salary;

    /**
     * to initialize the Teacher object
     * @param name name of the teacher
     * @param id id of the teacher : unique
     * @param salary salary of the teacher
     */
    public Teacher(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    /**
     * @return name of teacher
     */
    public String getName(){
        return name;
    }
    /**
     * @return id of teacher
     */
    public int getId(){
        return id;
    }

    /**
     * @param salary setting salary of teacher
     */
    public void setTotalSalary(int salary){
        this.salary = salary;
    }

    /**
     * @return salary of teacher
     */
    public int getTotalSalary(){
        return salary;
    }

    /**
     * Adds to salary. Removes from total money earned by school
     * @param salary recieving salary of teacher
     */
    public void recieveSalary(int salary){
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's name : " + name + " Total salary earned so far : $" + salary;
    }
}
