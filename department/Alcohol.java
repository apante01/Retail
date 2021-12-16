package department;

public class Alcohol extends HomeTechnics{
    private String expirationDate;
    private double size;
    private double volume;
    private String typePack;

    public Alcohol(){}
    public Alcohol(String name,double price,int item,String manufacturer,Department department,
                   String expirationDate,double size,double volume,String typePack ){
        super(name,price,item,0,manufacturer,null,department,0,
                null);
        this.expirationDate = expirationDate;
        this.size = size;
        this.volume = volume;
        this.typePack = typePack;
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



}
