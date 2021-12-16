package service;

public class Service {
    private String name;
    private double price;
    private String time;
    private String quality;
    private int grade;

    public Service(String name,double price,String time,String quality,int grade){
        this.name = name;
        this.price = price;
        this.time = time;
        this.quality = quality;
        this.grade = grade;
    }
    public Service(){}
    public void servicePerformed(){
        System.out.println("Сервис предоставлен (Да/Нет)");
    }
    public void feedbackSrvice(){
        System.out.println("Отзыв по сервису");
    }
}
