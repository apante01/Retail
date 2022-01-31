package retailStart;

import Product.Product;
import container.Basket;
import department.*;

import java.util.*;

public class Retail {

    public static void main(String[] args) {

        OfflineStore vesna = new OfflineStore("VESNA",1000,"c 10:00 до 22:00",
                "Blvd 12, London","897 765 876");
        vesna.openStore();
        vesna.closeStore();
        vesna.workTime();

        Ball ball = new Ball("Раздел Спортиынх товаров МЯЧИ");
        ball.getProduct().testGood();

        Beer beer = new Beer("Раздел Пиво");
        beer.getProduct().getBrand();



        Warehouse warehouse = new Warehouse("Склад", 150.5);
        warehouse.movementOfBall();
        warehouse.orderABall();
        warehouse.salesBallWeek("Средние продажи за неделю");

        Queue<Product>basket = new PriorityQueue<>();
        basket.add(new Product("Мяч"));
        basket.add(new Product("Пиво"));
        basket.add(new Product("Кроссовки"));
        basket.add(new Product("Чайник"));
       while(basket.size()>0){
           System.out.println(basket.poll());}
        System.out.println(basket.size());






        




























    }



}
