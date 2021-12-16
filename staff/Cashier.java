package staff;

public class Cashier extends Staff {

    public Cashier(String name,String position,double expirience){
        super(name,position,expirience);
    }
    public Cashier(){}

    public void scanGood(){
        System.out.println("Сканирую товар");
    }
    public void packGood(){
        System.out.println("Упаковывет товар в пакет");
    }
    public void saySum(){
        System.out.println("Сумма вашей покупки ХХХ рублей");
    }
    public void printCheck(){
        System.out.println("Печатается чек");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Всего доброго, будем рады видеть Вас снова");
    }
}




