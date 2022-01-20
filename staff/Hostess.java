package staff;

public class Hostess extends Staff {

    public Hostess(String name, String position, double expirience) {
        super(name, position, expirience);
    }


    public void offerABasket(){
        System.out.println("Не забывайте покупательскую корзину" + "\n" + "--------------------------------------------------");
    }

    @Override
    public void advise() {
        System.out.println("С радостью, провожу Вас до необходимого отдела");

    }


}
