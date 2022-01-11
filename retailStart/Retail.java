package retailStart;

import department.*;

public class Retail {

    public static void main(String[] args) {
	OfflineStore vesna = new OfflineStore("VESNA","10:00 - 22:00", 1000,
            "Blvd 12, London","897 765 876",null,null);
    vesna.workTime();
    vesna.openStore();
    vesna.closeStore();


    Product footballBall = new Product("Мяч",399.99,3434,"Кожа",
            "Для игры в зале", "Желтый",1,
            "Фабрика футбольных мячей",0,null,null,
            4d,0d,null,"ЗВЕЗДА",0.56,"Круглый");
    footballBall.giveProduct();
    footballBall.putOnTheShelf();
    footballBall.choiceProduct();
    footballBall.takeFromTheShelf();
    footballBall.testProduct();
    footballBall.putOnBasket();
    footballBall.takeFromBasket();
    footballBall.buy();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        Warehouse warehouse = new Warehouse();
        warehouse.movementOfBall();
        warehouse.orderABall();
        warehouse.salesBallWeek();

        /*Product shoes = new Product("Кроссовки",359.99,3434,"Кожа",
                "Для игры в зале", "Желтый",1,
                "Фабрика футбольных мячей",0,null,null,
                4d,0d,null,"ЗВЕЗДА",0.56,"Круглый");
        New n = new New("Name","Good",shoes);
        n.getCheck();

         */






    }



}
