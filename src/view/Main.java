package view;

import controller.OrderController;
import java.util.Scanner;
import model.Order;
import model.PaymentAdapter;
import model.ThirdPartyPayment;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input pesanan dari pengguna
        System.out.println("Input Your Order:");
        System.out.print("Main Course: ");
        String mainCourse = scanner.nextLine();
        System.out.print("Drink: ");
        String drink = scanner.nextLine();
        System.out.print("Dessert: ");
        String dessert = scanner.nextLine();

        // Membangun objek Order menggunakan Builder Pattern
        Order order = new Order.Builder()
                .setMainCourse(mainCourse)
                .setDrink(drink)
                .setDessert(dessert)
                .build();

        // Menampilkan pesanan
        OrderView view = new OrderView();
        OrderController controller = new OrderController(order, view);
        controller.updateView();

        // Proses pembayaran menggunakan Adapter Pattern
        System.out.print("Enter payment amount: $");
        double amount = scanner.nextDouble();
        PaymentAdapter paymentAdapter = new PaymentAdapter(new ThirdPartyPayment());
        paymentAdapter.processPayment(amount);

        scanner.close();
    }
}
