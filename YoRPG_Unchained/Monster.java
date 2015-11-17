/*=============================================
  class Monster -- Represents random incarnations of 
  the adventurer's natural enemy in Ye Olde RPG
  =============================================*/

public class Monster extends Character {


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Monster() {
	super();
	_hitPts = 150;
	_strength = 20 + (int)( Math.random() * 45 ); // [20,65)
	_defense = 20;
	_attack = 1;
    }

	public void normalize() {
	_defense = 40;
	_attack = 0.4;
    }
	
	public void specialize() {
	_defense = 20;
	_attack = .75;
    }
	
	public static String about() {
        String s = "\n==================";
	s += "\nABOUT THE CHARACTERS: \n";
	s += "\n A monster is not playable, perhaps.\n";
	s += "==================";
	s += "\n\n";
	return s;	
    }

}//end class Monster
