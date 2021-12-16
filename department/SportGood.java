package department;

public class SportGood {
    private String name;
    private double price;
    private int item;
    private int guaranteePeriod;
    private String manufacturer;
    private String matter;
    private String purposeOgGood;
    private String color;
    private Product product;
    private Department department;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public SportGood(){}


    public SportGood(String name, double price, int item, int guaranteePeriod, String manufacturer,
                     String matter,String purposeOgGood,String color,Department department) {
        this.name = name;
        this.price = price;
        this.item = item;
        this.guaranteePeriod = guaranteePeriod;
        this.manufacturer = manufacturer;
        this.matter = matter;
        this.purposeOgGood = purposeOgGood;
        this.color = color;
        this.department = department;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(byte guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void putOnTheShelf(){
        System.out.println("Товар выложен на полки");}

    public void choiceProduct(){
        System.out.println("Выбираем товар");
    }
    public void takeFromTheShelf(){
        System.out.println("Берем товар с полки");
    }
    public void testProduct(){
        System.out.println("Протестировать товар");
    }
    public void putOnBasket(){
        System.out.println("Кладем товар в корзину");
    }
    public void takeFromBasket(){
        System.out.println("Выкладываем товар из корзины");
    }
    public void buy(){
        System.out.println("Оплачиваем товар");
    }







}
