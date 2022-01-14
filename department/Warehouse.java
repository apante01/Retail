package department;

public class Warehouse {

    private String warName;
    private double square;


    public Warehouse(String warName,double square) {
        this.warName = warName;
        this.square = square;
        System.out.println("В магазине для хранения товаров есть - "+ warName+ "\n" +
                "Общая площадь склада - "+square+" м2");
    }

    private int generalBallStock = 145;
    private int stockBallStore = 20;
    private int stockBallWarehouse = generalBallStock - stockBallStore;
    private int orderBall = 8;
    private int ballSaleDay = 5;
    private int generalStockAfterOrder = orderBall + generalBallStock - ballSaleDay;
    private double salesWeek = 21;
    private int week = 4;
    private double salesFourWeek = salesWeek * week;
    private double stockOfBallInMonth = generalStockAfterOrder / salesFourWeek;
    private double value = stockOfBallInMonth;
    private String result = String.format("%.2f",value);


    public void movementOfBall() {
        System.out.println("Общий остаток мячей - " + generalBallStock + "\n" + "Запас магазина - " +
                stockBallStore + "\n" + "Запас склада - " + stockBallWarehouse + "\n" +
                "Заказанное кол-во - " + orderBall + "\n" + "Общий запас после поставки и продаж за день - "
                + generalStockAfterOrder + "\n" + "Продажи за 4 недели - " + salesFourWeek + "\n" +
                "Запас мячей на - " + result + " - месяцев");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
    }

    public void orderABall() {

        for (int i = 145; i > 100; i = i - 42) { // 145 - общий остаток, 100 - минимально допустимый остаток, 42 - продажи за 2 недели
            System.out.println(i + " - Осткток начальный/конечный");
            if (i <= 103) {
                System.out.println("Небходимо сдлеть заказ");
                System.out.println("-------------------------------------------------------------- ");
            }
        }

    }

    public String getWarName() {
        return warName;
    }

    public void setWarName(String warName) {
        this.warName = warName;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void salesBallWeek() {
        salesWeek = 21;


        while (salesWeek > 15) {
            salesWeek = salesWeek - 1;
            System.out.println(salesWeek + " - Снижение продаж");
            if (salesWeek <= 15) {
                System.out.println("Сократить кол-во заказов");
                System.out.println("--------------------------------------------------------------------");
            }


        }
    }



}
