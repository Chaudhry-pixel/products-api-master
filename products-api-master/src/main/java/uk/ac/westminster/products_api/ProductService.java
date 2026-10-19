
package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    // List to store all products
    private List<Product> products = new ArrayList<>();

    // Automatically generates unique IDs
    private Long nextId = 1L;

    // Constructor - adds products when the application starts
    public ProductService() {

        // Digital product
        products.add(new DigitalProduct(
                nextId++,
                "Clean Code (E-book)",
                29.99,
                "/downloads/clean-code.pdf",
                4.2
        ));

        // Physical product
        products.add(new PhysicalProduct(
                nextId++,
                "27-inch Monitor",
                249.99,
                5.4,
                "61cm x 41cm x 18cm"
        ));
    }

    // GET - return all products
    public List<Product> getAllProducts() {
        return products;
    }

    // GET - find product by ID
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    // POST - add a new product
    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    // DELETE - remove a product by ID
    public boolean deleteProduct(Long id) {
        return products.removeIf(
                p -> p.getId().equals(id)
        );
    }

    // Search products by name
    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }
}



