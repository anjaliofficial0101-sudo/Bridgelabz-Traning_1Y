public class Student {

    public int roll;
    protected String name;
    private double cgpa;

    public void setCgpa(double c) {
        cgpa = c;
    }

    public double getCgpa() {
        return cgpa;
    }

    public static void main(String[] args) {

        PostgraduateStudent s = new PostgraduateStudent();

        s.roll = 15;
        s.name = "Anjali";
        s.setCgpa(7.1);

        s.show();
    }
}

class PostgraduateStudent extends Student {

    public void show() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCgpa());
    }
}
