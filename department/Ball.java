package department;

import Product.Product;

public class Ball extends SportGood{
    public Ball(String depName) {
        super(depName);
        System.out.println(depName);
        Product footballBall = new Product("Мяч футбольный", 399.76, 3434, "Кожа",
                "Для игры в зале", "Желто-черный", 1,
                "Фабрика Футбольных мячей", 0, null, null,
                4d, 0d, null, "Звезда", 0.56, "Круглый");
        
        System.out.println("Наименование - " + footballBall.getName() + "\n" + "Цена - " + footballBall.getPrice() + " р."
                + "\n" + "Артикул - " + footballBall.getItem() + "\n" + "Материал - " + footballBall.getMatter()
                + "\n" + "Применение - " + footballBall.getPurposeOfGood() + "\n" + "Цвет - " + footballBall.getColor()
                + "\n" + "Гарантия - " + footballBall.getGuaranteePeriod() + " год." + "\n" + "Производитель - "
                + footballBall.getManufacturer() + "\n" + "Размер - " + footballBall.getSize() + "\n" + "Вес - "
                + footballBall.getWeight() + " кг" + "\n" + "Фирма - " + footballBall.getBrand() + "\n" +
                "Форма - " + footballBall.getShape());


    }

    }























