package aut.utcluj.isp.ex1;

/**
 * @author stefan
 */
public class Shop {
    private String name;
    private String city;

    public Shop(String name, String city) {
        throw new UnsupportedOperationException("nu exista:.");
    }

    public Shop(String name) {
        this.city = "";
        throw new UnsupportedOperationException("Andraacd");
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
