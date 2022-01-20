package product;

import department.Department;

public class Product {
    private String name;
    private double price;
    private int item;
    private String matter;
    private String purposeOfGood;
    private String color;
    private int guaranteePeriod;
    private String manufacturer;
    private int rating;
    private String technicalSpecifications;
    private String expirationDate;
    private double size;
    private double volume;
    private String typePack;
    private String brand;
    private double weight;
    private String shape;
    private Department department;

    public Product(){}

    public Product(String name, double price, int item, String matter, String purposeOfGood,
                   String color, int guaranteePeriod, String manufacturer, int rating,
                   String technicalSpecifications, String expirationDate, double size,
                   double volume, String typePack, String brand, double weight, String shape) {
        this.name = name;
        this.price = price;
        this.item = item;
        this.matter = matter;
        this.purposeOfGood = purposeOfGood;
        this.color = color;
        this.guaranteePeriod = guaranteePeriod;
        this.manufacturer = manufacturer;
        this.rating = rating;
        this.technicalSpecifications = technicalSpecifications;
        this.expirationDate = expirationDate;
        this.size = size;
        this.volume = volume;
        this.typePack = typePack;
        this.brand = brand;
        this.weight = weight;
        this.shape = shape;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public String getPurposeOfGood() {
        return purposeOfGood;
    }

    public void setPurposeOfGood(String purposeOfGood) {
        this.purposeOfGood = purposeOfGood;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

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

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getTypePack() {
        return typePack;
    }

    public void setTypePack(String typePack) {
        this.typePack = typePack;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void testGood(){
        System.out.println("Перед покупкой товар можно протестировать в присутствии консультанта");
        System.out.println("---------------------------------------------------------------------------");
    }



}
