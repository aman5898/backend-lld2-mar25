package Builder;

public class StudentBuilder {
    int age;
    String name;
    String batch;
    int gradyear;
    String course;

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGradyear(int gradyear) {
        this.gradyear = gradyear;
    }
}
