package retailStart;

import Product.Product;
import department.*;

public class Retail {

    public static void main(String[] args) {

        OfflineStore vesna = new OfflineStore("VESNA",1000,"c 10:00 до 22:00",
                "Blvd 12, London","897 765 876");
        vesna.openStore();
        vesna.closeStore();
        vesna.workTime();

        Ball ball = new Ball("Раздел Спортиынх товаров МЯЧИ");
        ball.getProduct().testGood();

        Warehouse warehouse = new Warehouse("Склад", 150.5);
        warehouse.movementOfBall();
        warehouse.orderABall();
        warehouse.salesBallWeek();





















    }



}
