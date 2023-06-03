package edu.ntudp.fit.lb3.Model;

import java.util.List;
import java.util.Objects;

public class Group {
    private String groupName;
    private Human groupHead;
    private int studentsCount;
    List<Student> students;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Human getGroupHead() {
        return groupHead;
    }

    public void setGroupHead(Human groupHead) {
        this.groupHead = groupHead;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group " + groupName + "\n head of group: " + groupHead + "\n count of students:" + studentsCount + "\n students: "
                + students.toString() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group group)) return false;
        return studentsCount == group.studentsCount && Objects.equals(groupName, group.groupName) && Objects.equals(groupHead, group.groupHead) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, groupHead, studentsCount, students);
    }
}