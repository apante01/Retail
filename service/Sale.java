package service;

public class Sale {
    private String puymentType;
    private double serviceTime;

    public Sale(String puymentType,double serviceTime){
        this.puymentType = puymentType;
        this.serviceTime = serviceTime;
    }
    public void consultation(){
        System.out.println("Консультация по товару");
    }
    public void priceCheck(){
        System.out.println("Проверка цены");
    }
    public void scanGood(){
        System.out.println("Сканирование товара на кассе");
    }
    public void getACheck(){
        System.out.println("Получение чека");
    }
}
