package edu.ntudp.fit.lb3.Model;

import java.util.List;
import java.util.Objects;

public class Department {
    private String departmentName;
    private Human departmentHead;
    private int groupsCount;
    private List<Group> groups;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Human getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(Human departmentHead) {
        this.departmentHead = departmentHead;
    }

    public int getGroupsCount() {
        return groupsCount;
    }

    public void setGroupsCount(int groupsCount) {
        this.groupsCount = groupsCount;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Department " + departmentName + " \n head of department " + departmentHead + "\n  count of groups: " + groupsCount +
                "\n groups: " + groups + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;
        return groupsCount == that.groupsCount && Objects.equals(departmentName, that.departmentName) && Objects.equals(departmentHead, that.departmentHead) && Objects.equals(groups, that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, departmentHead, groupsCount, groups);
    }
}
