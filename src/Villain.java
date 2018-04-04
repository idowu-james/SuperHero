public class Villain extends Hero {

  //Constructor ++++++++++++++++++++++++++++++++++
  public Villain(String name) {
    super(name);
  }

  //Public Methods ++++++++++++++++++++++++++++++++++
  public void steals(){
    System.out.println(this.name + "is stealing");
  }

  public void kills(){
    System.out.println(this.name + "is going around killing");
  }
}
