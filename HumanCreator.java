package edu.ntudp.fit.lb3.Controller;

import edu.ntudp.fit.lb3.Model.Sex;
import edu.ntudp.fit.lb3.Model.Human;


public class HumanCreator {
    public Human createHuman(String name, String surname, String patronymic, Sex sex) {
        Human human = new Human();
        human.setName(name);
        human.setPatronymic(patronymic);
        human.setSex(sex);
        human.setSurname(surname);
        return human;
    }

    public Human createTypicalHuman() {

        return createHuman("Kateryna", "Pipa", "Ihoryvna", Sex.FEMALE);
    }
}