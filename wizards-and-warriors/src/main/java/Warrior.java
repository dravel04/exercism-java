class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
// A Warrior is never vulnerable.
// A Warrior deals 6 points of damage if the fighter they are attacking is not vulnerable.
// A Warrior deals 10 points of damage if the fighter they are attacking is vulnerable.
class Warrior extends Fighter {

    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter){
        return (fighter.isVulnerable()) ? 10 : 6;
    }
}


// TODO: define the Wizard class
// A Wizard can prepare a spell in advance.
// A Wizard is vulnerable unless they have prepared a spell in advance.
// A Wizard deals 12 points of damage if they prepared a spell in advance.
// A Wizard deals 3 points of damage if they did not prepare a spell in advance.
class Wizard extends Fighter {
    private boolean spellPrepared = false;

    public String toString(){
        return "Fighter is a Wizard";
    }

    @Override
    public boolean isVulnerable(){
        return (!spellPrepared);
    }

    public void prepareSpell(){
        this.spellPrepared = true;
    }

    @Override
    public int getDamagePoints(Fighter fighter){
        return (spellPrepared) ? 12 : 3;
    }
}
