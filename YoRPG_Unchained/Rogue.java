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
	_strength = 90;
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
	
	public static String about() {
        String s = "\n==================";
	s += "\nABOUT THE CHARACTERS: \n";
	s += "\n - Warriors: The biggest attribute of the Warrior is their physical prowess. Strength at 100. Defense at 40. Attack at .4.\n";
	s += "\n - Mages: Mages do magic. Strength at 80. Defense at 60. Attack at .4.\n";
	s += "\n - Rogues: They sound cool. Strength at 90. Defense at 70. Attack at .35.\n";
	s += "\n - Clerics: They only SEEM boring. Strength at 50. Defense at 30. Attack at .2.\n";
	s += "\n - Tamers: They have something to do with animals. Strength at 75. Defense at 15. Attack at .5.\n";
	s += "==================";
	s += "\n\n";
	return s;	
    }
	

}//end class Rogue
