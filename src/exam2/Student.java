package exam2;

import exam2.Group;

public class Student extends Group {

    public Student(String name) {
        super(name);
        Group.getStudentsList().add(this);
    }

}
