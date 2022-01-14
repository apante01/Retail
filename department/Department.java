package department;

import Product.Product;

public class Department {
    private String depName;
    private Product product;



    public Department(){}

    public Department(String depName) {
        this.depName = depName;
        product = new Product();


    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void putGoodsInDepartment(){
        System.out.println("Выложить товары в отделы");
    }
}
