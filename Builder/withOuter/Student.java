package Builder.withOuter;

public class Student {
    int age;
    String name;
    String batch;
    int gradyear;
    String course;

    Student(StudentBuilder builder){



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
}

// 10:21pm to 10:28pm;
