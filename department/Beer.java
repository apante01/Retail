package department;

import Product.Product;

public class Beer extends Alcohol{

public Beer(String depName){
    super(depName);
    System.out.println(depName);
    Product pivko = new Product("Пиво",(short)119,(short)1010,null,null,
            null,(short)0,"ПивЗавод №1",(short)5,null,"30 дней",0.5,
            5.5,"ЖБ","ПивКо",(short)0,null);
    System.out.println(pivko.getBrand());
    System.out.println("----------------------------------------------------------------------------------");

}
}
