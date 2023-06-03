package edu.ntudp.fit.lb4.Model;


import java.util.List;
import java.util.Objects;

public class Faculty {
    private String facultyName;
    private Human facultyHead;
    private int departmentsCount;
    private List<Department> departments;

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public Human getFacultyHead() {
        return facultyHead;
    }

    public void setFacultyHead(Human facultyHead) {
        this.facultyHead = facultyHead;
    }

    public int getDepartmentsCount() {
        return departmentsCount;
    }

    public void setDepartmentsCount(int departmentsCount) {
        this.departmentsCount = departmentsCount;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Faculty " + facultyName + " \n head of the faculty " + facultyHead + " \n count of departments: " + departmentsCount +
                "\n departments: " + departments + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty faculty)) return false;
        return departmentsCount == faculty.departmentsCount && Objects.equals(facultyName, faculty.facultyName) && Objects.equals(facultyHead, faculty.facultyHead) && Objects.equals(departments, faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facultyName, facultyHead, departmentsCount, departments);
    }
}
