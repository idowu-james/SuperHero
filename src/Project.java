public class Project {

  public static void main(String[] args) {

   //Instantiate Hero +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    Hero hero = new Hero("Big Man");
    hero.fight();
    hero.runs();
    hero.showAbilities();

    //Instantiate Villain ++++++++++++++++++++++++++++++++++++++++++++++++++++++
    Villain villain = new Villain("Sly Man");
    villain.runs();
    villain.showAbilities();

    //Instantiate Vigilante +++++++++++++++++++++++++++++++++++++++++++++++++++++
    Vigilante vigilante = new Vigilante("Ms Sticks");
    vigilante.runs();
    vigilante.steals();
    vigilante.dealsJustice();
  }
}
