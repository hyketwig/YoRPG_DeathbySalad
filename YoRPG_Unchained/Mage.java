// Team Death by Salad - Jannie Li, Joel Ye, Bayle Smith-Salzberg
// APCS1 pd10
// HW31 -- Ye Olde Role Playing Game, Unchained
// 2015-11-16


/*=============================================
  class Mage 
  =============================================*/

public class Mage extends Character {
    

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Mage() {
	_name = "Mage";
	_hitPts = 125;
	_strength = 20 + (int) (Math.random() * 60); //maximum:80, minimum: 20 (monster's defense)
	_defense = 60;
	_attack = .4;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Mage( String name ) {
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
	s += "\n - Mages: Mages do magic. Strength at 80. Defense at 60. Attack at .4.\n";
	s += "==================";
	s += "\n\n";
	return s;	
    }
    
}//end class Mage
