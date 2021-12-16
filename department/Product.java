package department;

public class Product {
    private String name;
    private double price;
    private int item;
    private Department department; // Агрегация

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Product(String name, double price, int item, Department department) {
        this.name = name;
        this.price = price;
        this.item = item;
        this.department = department;
    }
    public Product(){}

    public void putOnTheShelf(){
        System.out.println("Товар выложен на полки");
    }
    public void choiceProduct(){
        System.out.println("Выбираем товар");
    }
    public void takeFromTheShelf(){
        System.out.println("Берем товар с полки");
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
