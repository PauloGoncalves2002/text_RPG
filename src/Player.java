public class Player {
    int health, gold, level;


    /**
    * @param health life of player (int)
    * @param gold gold of player (int)
    * @param level level of player (int)
    */

    Player(int health, int gold, int level) {
        this.health = health;
        this.gold = gold;
        this.level = level;
    }


    //get
    public int getHealth() {
        return health;
    }
    public int getGold() {
        return gold;
    }
    public int getLevel() {
        return level;
    }

    //set
    public void setHealth(int health){
        this.health = health;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public void setLevel(int level) {
        this.level = level;
    }
}
