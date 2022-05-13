package aut.utcluj.isp.ex3;

import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * @author stefan
 */
public class StockController {
    private int quantity;
    private final List<Product> catalogue = new ArrayList<>();
    private HashMap<String, List<Product>> map_catalogue = new HashMap<String, List<Product>>();
    /**
     * Add product to catalogue
     *
     * @param product  - product information
     * @param quantity - number of times the product should be added
     * @apiNote: if products with the same products id already exists, assume that @param product has the same data
     */
    public void addProductToCatalogue(final Product product, final int quantity) {
         if (catalogue.contains(product)) {
            System.out.println("This product already exist");
        } else {
        for (int i = 0 ; i <= quantity ; i++){
            catalogue.add(product);           
        }
           } 
         map_catalogue.put(product.getId(),catalogue);
    }

    /**
     * Return catalogue information
     *
     * @return dictionary where the key is the product id and the value is an array of products with the same id
     */
    public Map<String, List<Product>> getCatalogue() {
        //throw new UnsupportedOperationException("Not supported yet.");
         return map_catalogue;
    }

    /**
     * Return all the products with particular id
     *
     * @param productId - unique product id
     * @return - list of existing products with same id or null if not found
     */
    public List<Product> getProductsWithSameId(final String productId) {
        //throw new UnsupportedOperationException("Not supported yet.");
        List<Product> SameIdCatalogue = new ArrayList<>();
        for (Product i : catalogue){
            if ( i.getId().equals(productId)){
                SameIdCatalogue.add(i);
                }
            }
        return SameIdCatalogue;
        }

    /**
     * Get total number of products from catalogue
     *
     * @return
     */
    public int getTotalNumberOfProducts() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return catalogue.size();
    }

    /**
     * Remove all products with same product id
     *
     * @param productId - unique product id
     * @return true if at least one product was deleted or false instead
     */
    public boolean removeAllProductsWitProductId(final String productId) {
        //throw new UnsupportedOperationException("Not supported yet.");
        boolean ok = false;
        for (Product i : catalogue){
            if ( i.getId().equals(productId)){
                ok = true;
                catalogue.remove(i);
                }
            }
        if(ok == true){
            System.out.println("Deleted succesfully");
            return true;
        }
        else{
            System.out.println("No objects deleted");
            return false;
        }
    }

    /**
     * Update the price for all the products with same product id
     *
     * @param productId - unique product id
     * @param price     - new price to be added
     * @return true if at least one product was updated or false instead
     */
    public boolean updateProductPriceByProductId(final String productId, final Double price) {
        //throw new UnsupportedOperationException("Not supported yet.");
        boolean ok = false;
        for (Product i : catalogue){
            if ( i.getId().equals(productId)){
                ok = true;
                i.setPrice(price);
                }
            }
        if(ok == true){
            System.out.println("Deleted succesfully");
            return true;
        }
        else{
            System.out.println("No objects deleted");
            return false;
        }
        
    }
}