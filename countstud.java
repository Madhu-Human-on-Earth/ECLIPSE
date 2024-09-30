
public class countstud {


    private String name;
    private int rollNumber;
    private static int count = 0;

    public countstud(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        count++;
    }

    public static int getStudentCount() {
        return count;
    }

    public static void main(String[] args) {
    	countstud student1 = new countstud("John", 1);
        countstud student2 = new countstud("Alice", 2);
        countstud student3 = new countstud("Bob", 3);

        int studentCount = countstud.getStudentCount();
        System.out.println("Total number of students: " + studentCount);
    }
}
