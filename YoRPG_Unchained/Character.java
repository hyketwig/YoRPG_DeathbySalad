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
    public abstract void normalize();

    /*=============================================
      specialize
      - decreases defense attribute 
      - increases attack attribute 
      =============================================*/
    public abstract void specialize();

    /*=============================================
      about
      - returns a String describing a Warrior,
        Monster, Mage, Rogue, etc.
      =============================================*/
    public abstract String about();
    
}//end class Character
