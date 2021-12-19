package department;

public class Department {
    private String departmentName;
    private String typeProduct;
    private Product product; // агрегация

    public Department(){}

    public Department(String departmentName,String typeProduct){
        this.departmentName = departmentName;
        this. typeProduct = typeProduct;
        this.product = product;
    }

    public String getDepartmentName(){

        return departmentName;
    }
    public void setDepartmentName(String departmentName){

        this.departmentName = departmentName;
    }

    public String getTypeProduct(){

        return typeProduct;
    }
    public void setTypeProduct(String typeProduct){

        this.typeProduct = typeProduct;
    }


    public Product getProduct(){

        return product;
    }
    public void setProduct(Product product){

        this.product = product;
    }



    public void giveDepartment(){

        System.out.println("В магазине есть  отделы");
    }
    public void departmentName(){

        System.out.println(departmentName);// Имя отдела создано в классе OfflineStore
    }

    public void putOnTheShelf(){

        System.out.println("Товары выложены в отделы");
    }
    public void takeFromTheShelf(){

        System.out.println("Товар забирают из отделов");
    }

}
