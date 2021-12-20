package department;

public class Warehouse {

    private double square;

    int generalBallStock = 145;
    int stockBallStore = 20;
    int stockBallWarehouse = generalBallStock-stockBallStore;
    int orderBall = 8;
    int ballSaleDay = 5;
    int generalStockAfterOrder = orderBall+generalBallStock-ballSaleDay;
    double salesWeek = 21;
    int week = 4;
    double salesFourWeek = salesWeek*week;
    double stockOfBallInMonth = generalStockAfterOrder/salesFourWeek;

    public void movementOfBall (){
        System.out.println("Общий остаток мячей - " + generalBallStock + "\n" + "Запас магазина - " +
                stockBallStore + "\n" + "Запас склада - " + stockBallWarehouse + "\n" +
                "Заказанное кол-во - " + orderBall + "\n" + "Общий запас после поставки и продаж за день - "
                + generalStockAfterOrder + "\n" + "Продажи за 4 недели - " + salesFourWeek + "\n" +
                "Запас мячей на - " + stockOfBallInMonth + " - месяцев");
    }















}
