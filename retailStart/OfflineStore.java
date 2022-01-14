package retailStart;

import department.Department;
import Product.Product;
import department.Warehouse;

import java.util.Random;

public class OfflineStore {
    private String nameStore;
    private int square;
    private String workHours;
    private String adress;
    private String phone;
    private Department department; // Композиция
    private Warehouse warehouse;

    public OfflineStore(String nameStore, int square, String workHours, String adress,
                        String phone) {
        Department sport = new Department("Спортивные товары");
        Department ht = new Department("Бытовая техника");
        Department alcohol = new Department("Алкоголь");
        Department sklad = new Department("Склад");


        System.out.println("Магазин - " + nameStore + "\n" + "Режим работы - " + workHours +
                "\n" + "Площадь магазина - " + nameStore + " - " + square + " квадратных метров" +
                "\n" + "Адрес магазина - " + nameStore + " - " + adress + "\n" + "Телефон магазина - "
                + nameStore + " - " + phone + "\n" + "В магазине " + nameStore + " есть отделы:");

        Department[] array = {sport, ht, alcohol, sklad};
        for (Department otdel : array) {
            System.out.println(otdel.getDepName());
        }

    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void openStore() {
        System.out.println("Магазин VESNA открыт с 10:00");
    }

    public void closeStore() {
        System.out.println("Магазин VESNA закрывается в 22:00");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
    }

    public void workTime() {
        Random time = new Random();
        int t = 1;
        while (t != 0) break;
        {
            t = time.nextInt(22);
            boolean worktime = t > 10 && t < 22;
            if (worktime) {
                System.out.println("Магазин открыт - Добро Пожаловать!");
            } else if (t == 10) {
                System.out.println("Всем занять рабочие места");
            } else if (t == 22) {
                System.out.println("Всем покинуть рабочие места");
            } else {
                System.out.println("Магазин закрыт,будем рады вас видеть ежедневно" +
                        " с 10:00 до 22:00");
            }


            System.out.println("-----------------------------------------------------------------");

        }
    }
}
