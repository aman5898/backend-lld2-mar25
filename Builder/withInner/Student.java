package Builder.withInner;

public class Student {
    int age;
    String name;
    String batch;
    int gradyear;
    String course;

    private Student(StudentBuilder builder){

        if(builder.course!=null){
            this.course = builder.course;
        }else{
            this.course="Academy";
        }

        this.age = builder.age;
        this.name = builder.name;
        this.gradyear = builder.gradyear;
        this.batch = builder.batch;
    }

//    Student(AuthorName,BookName,ccc, , , )

    static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        int age;
        String name;
        String batch;
        int gradyear;
        String course;

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public StudentBuilder setCourse(String course) {
            this.course = course;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setGradyear(int gradyear) {
            this.gradyear = gradyear;
            return this;
        }

        public Student build(){

            // validations
            if(this.age<10){
                throw new IllegalArgumentException("Age must be atleast 10");
            }

            if(this.gradyear>2024){
                throw new IllegalArgumentException("GradYear must smaller than 2024");
            }

            if(this.name==null){
                throw new IllegalArgumentException("Name can't be empty");
            }

            return new Student(this);
        }
    }




}

// 10:21pm to 10:28pm;
