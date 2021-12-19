package service;

public class Sale extends Service {
    private String puymentType;
    private double serviceTime;

    public Sale(String name,double price,String time,String quality,int grade,
                String puymentType,double serviceTime){
        super(name,price,time,quality,grade);
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
