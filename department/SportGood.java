package department;

import Product.Product;

public class SportGood extends Department {
    public SportGood(){}

    public SportGood(String depName){
        super(depName);


    }




    @Override
    public void putGoodsInDepartment() {
        System.out.println("Наполнить Спорт отдел товарами");

    }

}

