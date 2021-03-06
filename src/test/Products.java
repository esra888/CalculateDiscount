package test;

public class Products {
    private long id;
    private String productType;
    private double productPrice;
    private Customer customer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productName) {
        this.productType = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public Customer getCustomer() { return customer; }

    public void setCustomer(Customer customer) { this.customer = customer; }



}




