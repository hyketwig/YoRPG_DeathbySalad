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
	_strength = 200;
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
    
}//end class Tamer
