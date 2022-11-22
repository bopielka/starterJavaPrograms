public enum Status {
    NEW("Złożono zamówienie, ale go nie opłacono"),
    PAID("Zamówienie opłacone"),
    SHIPPED("Zamóienie wysłane"),
    DELIVERED("Zamówienie dostarczone"),
    CANCELLED("Zamówienie anulowano");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name() +" - "+ description;
    }
}
