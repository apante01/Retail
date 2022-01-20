package department;

import staff.ShopAssistant;

public class Alcohol extends Department{

    public Alcohol() {
    }
    public Alcohol(String depName){
        super(depName);
    }


    @Override
    public void putGoodsInDepartment() {
        System.out.println("Наполнить товарами отдел Алкоголь");
    }



}
