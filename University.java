package edu.ntudp.fit.lb3.Model;

import java.util.List;
import java.util.Objects;

public class University {
    public String universityName;
    private Human universityHead;
    private List<Faculty> faculties;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public Human getUniversityHead() {
        return universityHead;
    }

    public void setUniversityHead(Human universityHead) {
        this.universityHead = universityHead;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University that)) return false;
        return Objects.equals(universityName, that.universityName) && Objects.equals(universityHead, that.universityHead) && Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(universityName, universityHead, faculties);
    }
}