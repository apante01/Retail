package department;

import Product.Product;

public class Shoes {


    private String name;
    private String type;
    private Product product;

    public Shoes(String name, String type, Product product) {
        this.name = name;
        this.type = type;
        this.product = product;
    }

   public void getCheck(){
       System.out.println("Название продукта "+product.getName()+
               " "+product.getPrice());
   }
}
