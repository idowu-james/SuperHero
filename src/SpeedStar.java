public class SpeedStar extends Hero {

  //Constructor ++++++++++++++++++++++++++++++++++++++++++++++
  public SpeedStar(String name) {
    super(name);

    // call speedBoast method immediately speed star is created
    speedBoast();
  }

  // Private Methods ++++++++++++++++++++++++++++++++++++++++++
  private void speedBoast(){
    this.speed += 50;

    if(this.speed > 100){
      this.speed = 100;
    }
  }
}
