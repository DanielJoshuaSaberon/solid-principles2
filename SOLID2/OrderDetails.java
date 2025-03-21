package SOLID2;

public class OrderDetails {
    private String customerName;
    private String address;
    private double amount;
    private int quantity;
    private String fileName;
    private String email;

    public OrderDetails(String customerName, String address, double amount, int quantity, String fileName, String email) {
        this.customerName = customerName;
        this.address = address;
        this.amount = amount;
        this.quantity = quantity;
        this.fileName = fileName;
        this.email = email;
    }

    public OrderDetails(){}

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
