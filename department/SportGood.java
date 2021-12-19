package department;

public class SportGood extends Department {

    public SportGood(){}
    public SportGood(String departmentName,String typeProduct){
        super(departmentName,typeProduct);
        SportGood sportGood = new SportGood();
        sportGood.setDepartmentName("Спортивные товары");
        sportGood.setTypeProduct("Товары для спорта");
    }

    @Override
    public void giveDepartment() {
        System.out.println("В магазине есть отдел СпортТовары");
    }

    @Override
    public void putOnTheShelf() {
        System.out.println("СпортТовыры выложены на полках в отделе");
    }
    public void testProduct(){
        System.out.println("Товары можно протестировать в отделе");
    }

}

