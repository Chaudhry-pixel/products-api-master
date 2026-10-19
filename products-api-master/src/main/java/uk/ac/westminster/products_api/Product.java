package uk.ac.westminster.products_api;

public class Product {

    // Attributes
    private Long id;
    private String name;
    private double price;

    // Empty constructor - needed by Jackson
    public Product() {
    }

    // Constructor with parameters
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

