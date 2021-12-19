package retailStart;

import department.Department;
import department.Product;

public class OfflineStore {
    private String name;
    private int square;
    private String workHours;
    private String adress;
    private String phone;
    private Department department; // Композиция
    private Product product; // Композиция


    public OfflineStore(){}

    public OfflineStore(String name,String workHours,int square,String adress,String phone){
        this.name = name;
        this.workHours = workHours;
        this.square = square;
        this.adress = adress;
        this.phone = phone;
        department = new Department("Отдел Спортивных товаров",
                "Товары для Спорта");
        product = new Product();


        System.out.println("Магазин называется - " + name+ "\n"+"Режим работы - " + workHours+
                "\n"+"Площадь магазина - " + name + " - " + square + " квадратных метров"+ "\n"+
                "Адрес магазина - " + name + " - " + adress+"\n"+"Телефон магазина - "
                + name + " - " + phone);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -  ");
    }

    public Department getDepartment(){
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }







    public void openStore(){
        System.out.println("Магазин - "+name+ " работает с - "+workHours);
    }
    public void closeStore(){
        System.out.println("Магазин - "+name+" закрыт");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        department.giveDepartment(); // Метод из класса Department
        department.departmentName();// Метод из класса Department
        department.putOnTheShelf(); // Метод из класса Department
        department.takeFromTheShelf(); // Метод из класса Department
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

    }




}
