package service;

public class Delivery {
    private String typeDelivery;
    private double timeDelivery;
    private double distance;
    private String adress;
    private int trackingNumber;

    public Delivery(String typeDelivery,double timeDelivery,double distance,
                    String adress,int trackingNumber ){
        this.typeDelivery = typeDelivery;
        this.timeDelivery = timeDelivery;
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
