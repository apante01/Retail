package department;

public class Ball extends SportGood{
    private String type;
    private int size;
    private double weight;
    private String brand;
    private String shape;

    public Ball(){}
    public Ball(String name,double price,int item,int guaranteePeriod,String manufacturer,
                String matter,String purposeOfGood,String color,
                String type,int size,double weight,String brand,String shape) {
        super(name, price, item, guaranteePeriod, manufacturer, matter, purposeOfGood, color, null);
        this.type = type;
        this.size = size;
        this.weight = weight;
        this.brand = brand;
        this.shape = shape;
        System.out.println("Наименование - " + name);
        System.out.println("Цена - " + price + " рублей");
        System.out.println("Артикул - " + item);
        System.out.println("Материал - " +  matter);
        System.out.println("Применение - " + purposeOfGood);
        System.out.println("Цвет - " + color);
        System.out.println("Гарантия - " + guaranteePeriod+ " года");
        System.out.println("Производитель - " + manufacturer);
        System.out.println("Тип мяча - " + type);
        System.out.println("Размер - " + size);
        System.out.println("Вес - " + weight);
        System.out.println("Фирма - " + brand);
        System.out.println("Форма - " + shape);
        System.out.println(" ");




    }




        @Override
        public void putOnTheShelf () {
            System.out.println("На полках большой выбор мячей");
        }
        @Override
        public void choiceProduct () {
            System.out.println("Выбираем футбольный мяч, для игры на траве");
        }


        public void testProduct (String visualInspection){
            System.out.println(visualInspection);
        }

}
