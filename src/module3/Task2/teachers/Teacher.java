package module3.Task2.teachers;

import module3.Task2.base.Person;
import module3.Task2.enums.Gender;

public class Teacher extends Person {

    private String education;
    private String direction;


    public Teacher(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public Teacher(String name, int age, Gender gender, String education, String direction) {
        super(name, age, gender);
        this.education = education;
        this.direction = direction;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
