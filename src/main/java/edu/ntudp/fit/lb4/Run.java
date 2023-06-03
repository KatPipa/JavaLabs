package edu.ntudp.fit.lb4;

import edu.ntudp.fit.lb3.Controller.UniversityCreator;
import edu.ntudp.fit.lb3.Model.University;

public class Run {
    public static void main(String[] args) {
        edu.ntudp.fit.lb3.Controller.UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();
        System.out.println(university.toString());
    }
}
