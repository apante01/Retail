package department;

public class HomeTechnics extends Department{
    public HomeTechnics(){}

    public  HomeTechnics(String departmentName,String typeProduct,Product product){
        super(departmentName,typeProduct,product);
        HomeTechnics homeTechnics = new HomeTechnics();
        homeTechnics.setDepartmentName("Бытовая Техника");
        homeTechnics.setTypeProduct("Товары для дома");

    }

    @Override
    public void giveDepartment() {
        System.out.println("В магазине есть отдел Бытовая техника");
    }

    @Override
    public void putOnTheShelf() {
        System.out.println("Товары для дома выложены на полках в отделе");
    }
    public void visualInspection(){
        System.out.println("Товар можно проверить с консультантом");
    }
}
