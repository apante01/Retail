package staff;

public abstract class Staff {

  private String name;
  private String position;
  private double expirience;

  public Staff(String name,String position,double expirience){
      this.name = name;
      this.position = position;
      this.expirience = expirience;
  }
  public Staff(){}

    public void sayHello(){

        System.out.println("Добрый день, " + "я " + getPosition() + ", меня зовут " + getName() + "\n" +
                "--------------------------------------------------");

    }
    public void advise(){
        System.out.println("Советы при выборе товара");
    }
    public void helpsWithTheChoice(){
        System.out.println("Помощь в выборе товара");
    }
    public void sayGoodbye(){

        System.out.println("Досвидания, ждём Вас снова в нашем магазине");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getExpirience() {
        return expirience;
    }

    public void setExpirience(double expirience) {
        this.expirience = expirience;
    }
}




