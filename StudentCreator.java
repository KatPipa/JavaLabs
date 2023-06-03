package edu.ntudp.fit.lb3.Controller;

import edu.ntudp.fit.lb3.Model.Human;
import edu.ntudp.fit.lb3.Model.Student;

public class StudentCreator {
    public Student createStudent(Human human) {
        Student student = new Student();
        student.setName(human.getName());
        student.setSurname(human.getSurname());
        student.setPatronymic(human.getPatronymic());
        student.setSex(human.getSex());
        return student;
    }

    public Student createTypicalStudent() {
        HumanCreator humanCreator = new HumanCreator();
        Human human = humanCreator.createTypicalHuman();
        Student student = createStudent(human);
        return student;
    }
}
