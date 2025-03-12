package PrototypeAndRegistry;

import java.util.ArrayList;

public class IntelligentStudent extends Student {
    int iq;
    ArrayList<Integer> list;

    IntelligentStudent(){

    }

    IntelligentStudent(IntelligentStudent is){
        super(is);
        this.iq = is.iq;
    }

    @Override
    public IntelligentStudent copy(){
        IntelligentStudent it = new IntelligentStudent(this);
        return it;
    }
}
