package staff;

public class Hostess extends Staff {

    public Hostess(String name, String position, double expirience) {
        super(name, position, expirience);
    }

    @Override
    public void sayHello() {
        System.out.println("Рады Вас видеть!");
    }
    public void offerABasket(){
        System.out.println("Не забывайте покупательскую корзину");
    }

    @Override
    public void advise() {
        System.out.println("С радостью, провожу Вас до необходимого отдела");
    }
}
