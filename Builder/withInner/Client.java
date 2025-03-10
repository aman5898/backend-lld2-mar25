package Builder.withInner;

public class Client {
    public static void main(String[] args) {
//        Student st = new Student();

//        StudentBuilder sb = new StudentBuilder();
//
//        sb.setAge(25);
//        sb.setGradyear(2025);
//        sb.setBatch("Jan 2025");
//
//        Student st = new Student(sb);


//        StudentBuilder sb = Student.getBuilder();
//
//        sb.setAge(25);
//        sb.setGradyear(2025);
//        sb.setBatch("Jan 2025");
//
//        Student st = new Student(sb);


//        StudentBuilder sb = Student.getBuilder()
//                .setAge(25)
//                .setGradyear(2025)
//                .setBatch("Jan 2025");
//
//        Student st = new Student(sb);


//        Student st = Student.getBuilder()
//                .setAge(25)
//                .setGradyear(2025)
//                .setBatch("Jan 2025")
//                .build();

        Student st = Student.getBuilder()
                .setAge(25)
                .setGradyear(2025)
                .setBatch("Jan 2025")
                .build();


    }
}
