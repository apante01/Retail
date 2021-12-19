package service;

public class Delivery extends Service{
    private String typeDelivery;
    private double distance;
    private String adress;
    private int trackingNumber;

    public Delivery(String name,double price,String time,String quality,int grade,
                    String typeDelivery,double distance,
                    String adress,int trackingNumber ){
        super(name,price,time,quality,grade);
        this.typeDelivery = typeDelivery;
        this.distance = distance;
        this.adress = adress;
        this.trackingNumber = trackingNumber;
    }
    public Delivery(){}

    public void productLoaded(){
        System.out.println("Заказ на погрузке");
    }
    public void goodsOfTranzit(){
        System.out.println("Товар передан на доставку");
    }
    public void orderDelivered(){
        System.out.println("Товар доставлен");
    }

}
