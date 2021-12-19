package service;

public class WarantyService extends Service {
    private String type;
    private String guaranteePeriod;

    public WarantyService(String name,double price,String time,String quality,int grade,
                          String type,String guaranteePeriod){
        super(name,price,time,quality,grade);
        this.type = type;
        this.guaranteePeriod = guaranteePeriod;
    }
    public WarantyService(){}

    public void expertise(){
        System.out.println("Товар направлен на эеспертизу");
    }
    public void conclusion(){
        System.out.println("Получено заключение");
    }
    public void repair(){
        System.out.println("Гарантийный ремонт");
    }
    public void replacementOfGood(){
        System.out.println("Замена товара на новый");
    }
    public void returnOfGood (){
        System.out.println("Возврат товара");
    }
    public void refund(){
        System.out.println("Возврат денежных средств");
    }

    @Override
    public void feedbackSrvice() {
        System.out.println("Обратная связь по Гарантийному сервису");
    }
}
