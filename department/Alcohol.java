package department;

public class Alcohol extends Department{


    public Alcohol(){}
    public Alcohol(String departmentName,String typeProduct,Product product){
        super(departmentName,typeProduct,product);
        Alcohol alcohol = new Alcohol();
        alcohol.setDepartmentName("Алкоголь");
        alcohol.setTypeProduct("Спиртосодержащие напитки");

    }

    @Override
    public void giveDepartment() {
        System.out.println("В магазине есть отдел Алкоголь");
    }

    public void visualInspection(){
        System.out.println("Товар можно осмотреть в отделе");
    }



}
