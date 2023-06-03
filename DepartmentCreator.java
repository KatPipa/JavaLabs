package edu.ntudp.fit.lb3.Controller;

import edu.ntudp.fit.lb3.Model.Department;
import edu.ntudp.fit.lb3.Model.Group;

import java.util.ArrayList;
import java.util.List;

public class DepartmentCreator {
    public Department createDepartment(int groupsCount) {
        Department department = new Department();
        GroupCreator groupCreator = new GroupCreator();
        List<Group> groups = new ArrayList<>();
        for (int i = 0; i < groupsCount; i++) {
            groups.add(groupCreator.createTypicalGroup());
        }
        department.setGroups(groups);
        return department;
    }

    public Department createTypicalDepartment() {
        Department department = createDepartment(2);
        return department;
    }
}
