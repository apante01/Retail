package staff;

public class Staff {

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
        System.out.println("Здравствуйте");
    }
    public void advise(){
        System.out.println("Советы при выборе товара");
    }
    public void helpsWithTheChoice(){
        System.out.println("Помощь в выборе товара");
    }
    public void sayGoodbye(){
        System.out.println("До свидания");
    }

     }




