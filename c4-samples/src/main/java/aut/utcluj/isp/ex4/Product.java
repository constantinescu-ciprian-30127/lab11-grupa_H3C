package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class Product {
    private String productId;
    private Double price;

    public Product(String productId, Double price) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    

    public String getProductId() {
        return productId;
    }

    public Double getPrice() {
        return price;
    }
}
