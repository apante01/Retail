package department;

import Product.Product;

public class HomeTechnics extends Department{
    public HomeTechnics() {
    }
    public HomeTechnics(String depName){
        super(depName);
    }

    @Override
    public void putGoodsInDepartment() {
        System.out.println("Наполнить товарами отдел Бытовая техника");
    }
}
