package PrototypeAndRegistry;

public class Client {

    static void doSomething(Student s){
//        Student st2 = new Student(s);
        Student st2 = s.copy();
//        Student st2 = s;
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.batch = "Test";
        st.name = "ScalerStudent";

//        doSomething(st);

        IntelligentStudent ist = new IntelligentStudent();
        doSomething(ist);
    }
}
