package edu.ntudp.fit.lb4.Controller;

import edu.ntudp.fit.lb4.Model.*;

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
        Group group = createGroup(2);
        return group;
    }
}
