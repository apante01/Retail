package department;

public class Department {
    private String departmentName;
    private String typeProduct;
    private Product product; // агрегация



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

    public Department(String departmentName,String typeProduct){
        this.departmentName = departmentName;
        this. typeProduct = typeProduct;
    }
    public Product getProduct(){
        return product;
    }
    public void setProduct(Product product){
        this.product = product;
    }
    public Department(){}



    public void giveDepartment(){
        System.out.println("В магазине есть  отделы");
    }

    public void putOnTheShelf(){

        System.out.println("Товары выложены в отделы");
    }
    public void takeFromTheShelf(){

        System.out.println("Товар забирают из отделов");
    }

}
