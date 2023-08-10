import view.MainView;

// SOLID
// S - Этот класс отвечает только за запуск программы
public class Main {
    private static MainView view = new MainView();

    public static void main(String[] args) {
        view.MainMenu();
    }
}
