package retailStart;

import department.Ball;
import staff.Cashier;
import staff.Merchandiser;
import staff.Staff;

public class Retail {

    public static void main(String[] args) {
	OfflineStore vesna = new OfflineStore("VESNA","10:00 - 22:00", 1000,
            "Blvd 12, London","897 765 876");
    vesna.openStore();
    vesna.closeStore();

    Ball footballBall = new Ball("Мяч",999.99,696969,2,"Фабрика Спорт Товаров, Россия",
            "Кожа","Для игры на траве","Бело-Черный",
            "Для Футбола",5,0.56,"DIADORA","Круглый");
    footballBall.putOnTheShelf();
    footballBall.choiceProduct();
    footballBall.takeFromTheShelf();
    footballBall.testProduct("Тестируем мяч в тестовой зоне");
    footballBall.putOnBasket();
    footballBall.takeFromBasket();
    footballBall.buy();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");







    }


}
