
package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it is a product
// that has additional details for shipping.

// A ShoppingCart is NOT a Product because it contains
// products rather than being a product itself.

public class PhysicalProduct extends Product {

    // Attributes specific to physical products
    private double weightKg;
    private String dimensions;

    // Empty constructor - needed by Jackson
    public PhysicalProduct() {
    }

    // Full constructor
    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {

        // Initialise inherited Product attributes
        super(id, name, price);

        // Initialise PhysicalProduct attributes
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // Getter for weight
    public double getWeightKg() {
        return weightKg;
    }

    // Getter for dimensions
    public String getDimensions() {
        return dimensions;
    }
}

