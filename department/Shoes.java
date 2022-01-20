package department;

import product.Product;
import staff.ShopAssistant;

public class Shoes extends Department {


    private String name;
    private String type;
    private Product product;

    public Shoes(String name, String type, Product product) {
        this.name = name;
        this.type = type;
        this.product = product;
    }


    public void getCheck() {
        System.out.println("Название продукта " + product.getName() +
                " " + product.getPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
