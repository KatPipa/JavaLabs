package edu.ntudp.fit.lb3.Model;

public class Student extends Human {
    private Human head;

    @Override
    public String toString() {
        return "Student: " + name + " " + surname + " " + patronymic + " sex: " + sex + "\n";
    }
}
