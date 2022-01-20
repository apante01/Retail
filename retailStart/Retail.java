package retailStart;

import department.*;
import staff.Hostess;
import staff.ShopAssistant;

public class Retail {

    public static void main(String[] args) {

        OfflineStore vesna = new OfflineStore("VESNA", 1000, "c 10:00 до 22:00",
                "Blvd 12, London", "897 765 876");
        vesna.openStore();
        vesna.closeStore();
        vesna.workTime();

        Hostess hostess = CreateToObject.createHostess();
        hostess.sayHello();
        hostess.advise();
        hostess.offerABasket();

        Ball ball = CreateToObject.createBall();
        ball.getProduct().testGood();

        Warehouse warehouse = CreateToObject.createWarehouse();
        warehouse.movementOfBall();
        warehouse.orderABall();
        warehouse.salesBallWeek();


    }

}
