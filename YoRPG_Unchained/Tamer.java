// Team Death by Salad - Jannie Li, Joel Ye, Bayle Smith-Salzberg
// APCS1 pd10
// HW30 -- Ye Olde Role Playing Game, Expanded
// 2015-11-13


/*=============================================
  class Tamer
  =============================================*/

public class Tamer extends Character {

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Tamer() {
	_name = "Tamer";
	_hitPts = 125;
	_strength = 100 + (int)(Math.random() * 100);//impossible for monster to win, but not as drastically as before
	_defense = 10;
	_attack = .8;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Tamer( String name ) {
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
	s += "\n - Tamers: They have something to do with animals. Strength at 75. Defense at 15. Attack at .5.\n";
	s += "==================";
	s += "\n\n";
	return s;	
    }
	
}//end class Tamer
