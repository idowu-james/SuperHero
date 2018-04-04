public class Hero {



  private int strength;
  private int speed;
  private int health;
  public String name;

  //Getter Section ++++++++++++++++++
  public int getStrength() {
    return strength;
  }

  public int getSpeed() {
    return speed;
  }

  public int getHealth() {
    return health;
  }

  //Constructor ++++++++++++++++++++++
  public Hero(String name) {
    this.name = name;

    generateAbilities();
  }

  public void showAbilities(){
    System.out.println("Strength is: " + this.strength);
    System.out.println("Speed is: " + this.speed);
    System.out.println("Health is: " + this.health);
  }

  private void generateAbilities(){

    this.strength = (int)(Math.random() * 100 +1);
    this.health = (int)(Math.random() * 100 +1);
    this.speed = (int)(Math.random() * 100 +1);

  }

   public void fight(){

    System.out.println(this.name + "is fighting");
    }

   public void run(){

     System.out.println(this.name + "is running");
   }
}
