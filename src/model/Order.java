package model;

public class Order {
    private String mainCourse;
    private String drink;
    private String dessert;

    public static class Builder {
        private String mainCourse;
        private String drink;
        private String dessert;

        public Builder setMainCourse(String mainCourse) {
            this.mainCourse = mainCourse;
            return this;
        }

        public Builder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder setDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Order build() {
            Order order = new Order();
            order.mainCourse = this.mainCourse;
            order.drink = this.drink;
            order.dessert = this.dessert;
            return order;
        }
    }

    @Override
    public String toString() {
        return "Main Course: " + mainCourse + ", Drink: " + drink + ", Dessert: " + dessert;
    }
}
