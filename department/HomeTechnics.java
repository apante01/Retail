package department;

public class HomeTechnics extends SportGood{

    private int rating;
    private String technicalSpecifications;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTechnicalSpecifications() {
        return technicalSpecifications;
    }

    public void setTechnicalSpecifications(String technicalSpecifications) {
        this.technicalSpecifications = technicalSpecifications;
    }
    public HomeTechnics(){}
    public HomeTechnics(String name, double price, int item, int guaranteePeriod, String manufacturer, Object color, Department department, int rating, Object technicalSpecifications){

    }
    public HomeTechnics(String name,double price,int item,byte guaranteePeriod,String manufacturer,
                        String color,Department department,int rating,String technicalSpecifications){
        super(name,price,item,guaranteePeriod,manufacturer,null,null,color,department);
        this.rating = rating;
        this.technicalSpecifications = technicalSpecifications;
    }

    @Override
    public void testProduct() {
        System.out.println("Я визуально проверяю товар");
    }

}
