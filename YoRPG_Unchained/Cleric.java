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
	_strength = 50;
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
    
}//end class Cleric
