// Team Death by Salad - Jannie Li, Joel Ye, Bayle Smith-Salzberg
// APCS1 pd10
// HW30 -- Ye Olde Role Playing Game, Expanded
// 2015-11-13


/*=============================================
  class Rogue
  =============================================*/


public class Rogue extends Character {

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Rogue() {
	_name = "Rogue";
	_hitPts = 125;
	_strength = 60 + (int)(Math.random() * 50) ;//give the monster a chance to receive no damage, but mostly...
	_defense = 70;
	_attack = .35;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Rogue( String name ) {
	this();
	_name = name;
    }
    
	public void normalize() {
	_defense = 40;
	_attack = 0.4;
    }
	
	public void specialize() {
	_defense = 20;
	_attack = .75;
    }
	
	public String about() {
        String s = "\n==================";
	s += "\nABOUT THE CHARACTERS: \n";
	s += "\n - Rogues: They sound cool. Strength at 90. Defense at 70. Attack at .35.\n";
	s += "==================";
	s += "\n\n";
	return s;	
    }
	

}//end class Rogue
