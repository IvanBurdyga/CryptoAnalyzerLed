package com.javarush.burdygin;



import com.javarush.burdygin.controller.Controller;
import com.javarush.burdygin.view.ConsoleApplication;
import com.javarush.burdygin.view.Menu;

import java.util.Scanner;

public class ConsoleRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Menu menu = new Menu(scanner);
        Controller controller = new Controller();
        ConsoleApplication consoleApplication = new ConsoleApplication(menu, controller);
        consoleApplication.run();
    }
}
