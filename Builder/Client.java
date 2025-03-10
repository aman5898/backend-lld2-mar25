package Builder;

public class Client {
    public static void main(String[] args) {
//        Student st = new Student();

        StudentBuilder sb = new StudentBuilder();

        sb.setAge(25);
        sb.setGradyear(2025);
        sb.setBatch("Jan 2025");

        Student st = new Student(sb);
    }
}
