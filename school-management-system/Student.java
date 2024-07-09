//Student class to keep information of students(Name, ID, Grade, Total Fees, Fees Collected)

public class Student{
    
    private final String name;
    private final int ID;
    private int grade;
    private final int feesTotal;
    private int feesPaid;

    /**
     * to initialize the Student object
     * @param feesTotal total fees of student : 12,000
     * @param feesPaid fees paid by the student
     * @param ID id of the student : unique
     * @param name name of the student
     * @param grade grade of student : maybe unique
     */
    public Student(String name, int ID, int grade){
        this.name = name;
        this.ID = ID;
        this.grade = grade;
        this.feesTotal = 15000;
        this.feesPaid = 0;
    }

    //Student name and ID will remain same
    /**
     * @param grade new grade of student. Updated everytime
     * @param feesPaid fees paid by the student. Updated everytime
     */
    public void updateGrade(int grade){
        this.grade = grade;
    }
    /**
     * add the fees to fees paid.
     * school recieves funds.
     * feesPaid = 1st time + 2nd time + 3rd time +....
     * Keep adding the fees to feesPaid
     * @param paidFees the fees that student pays
     */
    public void payFees(int paidFees){
        feesPaid += paidFees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * @return ID of student
     */
    public int getID() {
        return ID;
    }
    /**
     * @return name of student
     */
    public String getName() {
        return name;
    }
    /**
     * @return grade of student
     */
    public int getGrade() {
        return grade;
    }
    /**
     * @return total fees of student
     */
    public int getFeesTotal() {
        return feesTotal;
    }
    /**
     * @return fees paid by students
     */
    public int getFeesPaid() {
        return feesPaid;
    }
    /**
     * @return remaining fees
     */
    public int getRemainingFees(){
        return  feesTotal - feesPaid;
    }

    @Override
    public String toString(){
        return "Student's name : " + name + " Total fees paid so far $" + feesPaid;
    }

}