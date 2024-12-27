package patterns;

import model.*;

public class FoodFactory implements MenuFactory {
    @Override
    public Menu createMenu(String type) {
        switch (type.toLowerCase()) {
            case "appetizer":
                return new Appetizer();
            case "maincourse":
                return new MainCourse();
            default:
                return null;
        }
    }
}
