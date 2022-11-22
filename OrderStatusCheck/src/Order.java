import java.util.List;

public class Order {
    private String name;
    private double price;
    private Status status;

    public Order(String name, double price, Status status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public String getStatusString() {
        return status.name();
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return name + "(" + price + " zł) - " + status;
    }

    public static Order addOrder(String name, double price, Status status){
        return new Order(name, price,status);
    }
    public static void findByStatus(List<Order> orders, String status){

        for (Order o: orders) {
            if (o.getStatusString().equals(status)){
                System.out.println(o);
            }
        }
    }
}
