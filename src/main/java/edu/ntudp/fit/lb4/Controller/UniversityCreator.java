package edu.ntudp.fit.lb4.Controller;

import edu.ntudp.fit.lb4.Model.Faculty;
import edu.ntudp.fit.lb4.Model.Human;
import edu.ntudp.fit.lb4.Model.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityCreator {
    public University createUniversity(String universityName, int facultiesCount, Human universityHead) {
        University university = new University();
        FacultyCreator facultyCreator = new FacultyCreator();
        university.setUniversityName(universityName);
        university.setUniversityHead(universityHead);
        List<Faculty> faculties = new ArrayList<>();
        for (int i = 1; i < facultiesCount; i++) {
            faculties.add(facultyCreator.createTypicalFaculty());
        }
        university.setFaculties(faculties);
        return university;
    }

    public University createTypicalUniversity() {
        HumanCreator humanCreator = new HumanCreator();
        University university = createUniversity("NTU-DP", 2, humanCreator.createTypicalHuman());
        return university;
    }
}
