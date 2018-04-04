public class StrongMan extends Hero {

  //Constructor ++++++++++++++++++++++++++++++++++++++++++++++
  public StrongMan(String name) {
    super(name);

    strenghtBoast();
  }

  // Private Methods ++++++++++++++++++++++++++++++++++++++++++
  private void strenghtBoast(){
    this.strength += 50;

    if(this.strength > 100){
      this.strength = 100;
    }
  }
}
