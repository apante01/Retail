package staff;

public class Merchandiser {

    private String name;
    private String position;
    private Staff Staff;

    public Merchandiser(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public void layoutGood(){
        System.out.println("Выкладывает товар на полки");
    }
    public void facingGood (){
        System.out.println("Поправляет товар");
    }
    public void priceCheck (){
        System.out.println("Сверяет цены");
    }
    public void printPriceTag(){
        System.out.println("Распечатывает ценники");
    }
    public void replaceOfPriceTag(){
        System.out.println("Производит замену цен на полках");
    }







}
