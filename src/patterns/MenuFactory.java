package patterns;

import model.Menu;

public interface MenuFactory {
    Menu createMenu(String type);
}
