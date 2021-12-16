package service;

public class WarantyService {
    private String type;
    private String guaranteePeriod;

    public WarantyService(String type,String guaranteePeriod){
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

}
