package perpustakaan2;

import controller.LibraryController;
import view.LibraryView;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryController controller = new LibraryController();
        LibraryView view = new LibraryView(controller);
        view.setVisible(true);
    }
}
