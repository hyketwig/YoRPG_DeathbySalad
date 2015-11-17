// Team Death by Salad - Jannie Li, Joel Ye, Bayle Smith-Salzberg
// APCS1 pd10
// HW30 -- Ye Olde Role Playing Game, Expanded
// 2015-11-13


/*=============================================
  class Cleric 
  =============================================*/


public class Cleric extends Character {


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Cleric() {
	_name = "Cleric";
	_hitPts = 125;
	_strength = 50 + (int)(Math.random() * 40); //not so much strength, but at least has the power to overcome the monster
	_defense = 30;
	_attack = .2;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Cleric( String name ) {
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
	s += "\n - Clerics: They only SEEM boring. Strength at 50. Defense at 30. Attack at .2.\n";
	s += "==================";
	s += "\n\n";
	return s;	
    }
	
    
}//end class Cleric
