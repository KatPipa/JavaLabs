package edu.ntudp.fit.lb3.Controller;

import edu.ntudp.fit.lb3.Model.*;

import java.util.ArrayList;
import java.util.List;

public class FacultyCreator {
    Faculty createFaculty(int departmentsCount, Human facultyHead) {
        Faculty faculty = new Faculty();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        List<Department> departments = new ArrayList<>();
        for (int i = 0; i < departmentsCount; i++) {
            departments.add(departmentCreator.createTypicalDepartment());
        }
        faculty.setDepartments(departments);
        faculty.setDepartmentsCount(departmentsCount);
        faculty.setFacultyHead(facultyHead);
        return faculty;
    }

    Faculty createTypicalFaculty() {
        HumanCreator humanCreator = new HumanCreator();
        Faculty faculty = createFaculty(6, humanCreator.createTypicalHuman());
        return faculty;
    }
}