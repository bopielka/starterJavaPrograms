import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(Order.addOrder("MacBook",10000, Status.NEW));
        orders.add(Order.addOrder("Suszarka", 20, Status.PAID));
        orders.add(Order.addOrder("Lampa", 200,Status.PAID));
        orders.add(Order.addOrder("Tablet graficzny", 300,Status.CANCELLED));
        orders.add(Order.addOrder("Słuchawki", 500, Status.DELIVERED));
        orders.add(Order.addOrder("Szklanka",2,Status.SHIPPED));

        System.out.println("_____________" +"\n"+ "Wszytskie zamówienia");
        for (Order o : orders) {
            System.out.println(o);
        }

        System.out.println("_____________" +"\n"+ "Możliwy status zamóienia: ");
        for (Status s:Status.values()) {
            System.out.println(s);
        }
        System.out.println("_____________" +"\n"+ "Jaki rodzaj zamówień chcesz zobaczyć?");
        Scanner input = new Scanner(System.in);
        String wantedStatus = input.nextLine().toUpperCase();
        Order.findByStatus(orders,wantedStatus);

        System.out.println("Naciścnij ENTER, aby zakończyć działanie programu.");
        input.nextLine(); // żeby w konsoli było widać wyniki
        input.close();
    }
}