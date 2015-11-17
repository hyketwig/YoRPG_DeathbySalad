// Team Death by Salad - Jannie Li, Joel Ye, Bayle Smith-Salzberg
// APCS1 pd10
// HW30 -- Ye Olde Role Playing Game, Expanded
// 2015-11-13

/*=============================================
  class Character -- superclass for combatants in Ye Olde RPG
  =============================================*/

public class Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected String _name; //monsters don't have names...?
    protected int _hitPts;
    protected int _strength;
    protected int _defense;
    protected double _attack;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Character() {
	_hitPts = 125;
	_strength = 100;
	_defense = 40;
	_attack = .4;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public int getDefense() { return _defense; }

    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    /*=============================================
      boolean isAlive() -- tell whether I am alive
      post: returns boolean indicated alive or dead
      =============================================*/
    public boolean isAlive() {
	return _hitPts > 0;
    }


    /*=============================================
      int attack(Character) -- simulates attack on a Monster
      pre:  Input not null
      post: Calculates damage to be inflicted, flooring at 0. 
            Calls opponent's lowerHP() method to inflict damage. 
	    Returns damage dealt.
      =============================================*/
    public int attack( Character opponent ) {

	int damage = (int)( (_strength * _attack) - opponent.getDefense() );
	//System.out.println( "\t\t**DIAG** damage: " + damage );

	if ( damage < 0 )
	    damage = 0;

	opponent.lowerHP( damage );

	return damage;
    }//end attack


    /*=============================================
      void lowerHP(int) -- lowers life by input value
      pre:  Input >= 0
      post: Life instance var is lowered by input ammount.
      =============================================*/
    public void lowerHP( int damageInflicted ) {
	_hitPts = _hitPts - damageInflicted;
    }


    
    /*=============================================
      normalize
      - resets defense attribute
      - resets attack attribute
      =============================================*/
    public void normalize() {
	_defense = 40;
	_attack = 0.4;
    }


    /*=============================================
      specialize
      - decreases defense attribute 
      - increases attack attribute 
      =============================================*/
    public void specialize() {
	_defense = 20;
	_attack = .75;
    }



    
    /*=============================================
      about
      - returns a String describing a Warrior,
        Monster, Mage, Rogue, etc.
      =============================================*/
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
    
}//end class Character
