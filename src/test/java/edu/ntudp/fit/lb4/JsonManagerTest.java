package edu.ntudp.fit.lb4;

import edu.ntudp.fit.lb4.Controller.UniversityCreator;
import edu.ntudp.fit.lb4.Model.University;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JsonManagerTest {

    @Test
    void writeToFile() {
        String filePath = "src/main/java/edu/ntudp/fit/lb4/universityText.json";
        JsonManager jsonManager = new JsonManager();
        UniversityCreator universityCreator = new UniversityCreator();
        University oldUniversity = universityCreator.createTypicalUniversity();
        jsonManager.writeToFile(oldUniversity, filePath);
        University newUniversity = (University) jsonManager.readFromFile(filePath);

        Assertions.assertEquals(newUniversity, oldUniversity);
    }
}
