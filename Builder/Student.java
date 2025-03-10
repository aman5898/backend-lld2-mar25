package Builder;

public class Student {
    int age;
    String name;
    String batch;
    int gradyear;
    String course;

    Student(StudentBuilder builder){

        // validations
        if(builder.age<10){
            throw new IllegalArgumentException("Age must be atleast 10");
        }

        if(builder.gradyear>2024){
            throw new IllegalArgumentException("GradYear must smaller than 2024");
        }

        this.age = builder.age;
        this.name = builder.name;
        this.gradyear = builder.gradyear;
        this.course = builder.course;
        this.batch = builder.batch;
    }


}
