package staff;

public class ShopAssistant extends Staff{

    public ShopAssistant(String name,String position,double expirience){
        super(name,position,expirience);
    }

    @Override
    public void sayHello() {
        System.out.println("Добрый день");
    }

    @Override
    public void helpsWithTheChoice() {
        System.out.println("Как я могу Вам помочь?");
    }

    @Override
    public void advise() {
        System.out.println("Товар ХХХ лидер продаж");
    }

}
