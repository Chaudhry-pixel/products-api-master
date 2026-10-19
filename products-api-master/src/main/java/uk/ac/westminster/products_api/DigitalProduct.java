
package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {

    // Attributes specific to digital products
    private String downloadUrl;
    private double fileSizeMB;

    // Empty constructor - needed by Jackson
    public DigitalProduct() {
    }

    // Full constructor
    public DigitalProduct(Long id, String name, double price,
                          String downloadUrl, double fileSizeMB) {

        // Calls the constructor in Product
        super(id, name, price);

        // Sets the digital product attributes
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    // Getter for download URL
    public String getDownloadUrl() {
        return downloadUrl;
    }

    // Getter for file size
    public double getFileSizeMB() {
        return fileSizeMB;
    }
}

