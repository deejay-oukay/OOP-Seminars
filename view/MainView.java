package view;

import java.util.Scanner;

import controller.MainController;

// SOLID
// S - Этот класс отвечает только за общение с пользователем
public class MainView {
    private static final Scanner scan = new Scanner(System.in);
    private static MainController control = new MainController();

    public void MainMenu() {
        boolean needToExit = false;
        int command;
        while (!needToExit) {
            System.out.println("===============================");
            System.out.println("Что нужно сделать?:");
            System.out.println("1 - Создать обычный автомат");
            System.out.println("2 - Создать автомат для горячих напитков");
            System.out.println("3 - Получить список созданных автоматов");
            System.out.println("4 - Создать еду");
            System.out.println("5 - Создать обычный напиток");
            System.out.println("6 - Создать горячий напиток");
            System.out.println("7 - Получить список созданных продуктов");
            System.out.println("8 - Добавить продукт в автомат");
            System.out.println("9 - Получить список продуктов в автомате");
            System.out.println("0 - Выйти");
            command = scan.nextInt();
            scan.nextLine();
            switch (command) {
                case 1:
                    System.out.println("Создаём обычный автомат...");
                    control.createAutomat();
                    break;
                case 2:
                    System.out.println("Создаём автомат для горячих напитков...");
                    control.createHotAutomat();
                    break;
                case 3:
                    System.out.println("Получаем список созданных автоматов...");
                    System.out.println(control.getAutomats());
                    break;
                case 4:
                    System.out.println("Создаём еду...");
                    control.createFood();
                    break;
                case 5:
                    System.out.println("Создаём обычный напиток...");
                    control.createBeverage();
                    break;
                case 6:
                    System.out.println("Создаём горячий напиток...");
                    control.createHotBeverage();
                    break;
                case 7:
                    System.out.println("Получаем список созданных продуктов...");
                    System.out.println(control.getProducts());
                    break;
                case 8:
                    System.out.println("Добавляем продукт в автомат...");
                    control.addProduct2Automat();
                    break;
                case 9:
                    System.out.println("Получаем список продуктов в автомате...");
                    System.out.println(control.getProductsFromAutomat());
                    break;
                case 0:
                    System.out.println("Выходим из матрицы...");
                    needToExit = true;
                    break;
            }
        }
    }

    public String AskParam(String name) {
        System.out.print("Введите " + name + ": ");
        return scan.nextLine();
    }

    public void Error(String message) {
        System.out.println(message);
    }
}
