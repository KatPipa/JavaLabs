package edu.ntudp.fit.lb3.Controller;

import edu.ntudp.fit.lb3.Model.*;

import java.util.ArrayList;
import java.util.List;

public class GroupCreator {
    Group createGroup(int studentsCount) {
        Group group = new Group();
        StudentCreator studentCreator = new StudentCreator();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentsCount; i++) {
            students.add(studentCreator.createTypicalStudent());
        }
        group.setStudents(students);
        group.setStudentsCount(studentsCount);
        return group;
    }

    Group createTypicalGroup() {
        Group group = createGroup(28);
        return group;
    }
}
