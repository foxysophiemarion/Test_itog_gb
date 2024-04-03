package ru.gb.testitog;

import ru.gb.testitog.controller.AnimalController;
import ru.gb.testitog.services.AnimalList;


public class Main {
    public static void main(String[] args) throws Exception {
        AnimalController controller = new AnimalController();

        controller.Run();
    }
}
