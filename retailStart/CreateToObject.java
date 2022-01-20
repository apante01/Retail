package retailStart;

import department.Ball;
import department.Department;
import department.Warehouse;
import staff.Cashier;
import staff.Hostess;
import staff.ShopAssistant;

public class CreateToObject {

    public static Hostess createHostess() {
        return new Hostess("Елена", "Хостесс", 3);
    }

    public static ShopAssistant createShopAssistant() {
        return new ShopAssistant("Игорь", "Продавец консультант", 5);
    }

    public  static Cashier createCashier() {
        return new Cashier("Светлана", "Кассир", 1);
    }

    public static Ball createBall() {
        return new Ball("Раздел Спортиынх товаров МЯЧИ");
    }

    public static Warehouse createWarehouse() {
        return new Warehouse("Склад", 150.5);
    }

    public static Department createDepartment(String string) {

        return new Department(string);
    }
}
