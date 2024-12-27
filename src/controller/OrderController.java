package controller;

import view.OrderView;
import model.Order;

public class OrderController {
    private Order order;
    private OrderView view;

    public OrderController(Order order, OrderView view) {
        this.order = order;
        this.view = view;
    }

    public void updateView() {
        view.displayOrder(order.toString());
    }
}
