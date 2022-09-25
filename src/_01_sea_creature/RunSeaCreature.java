package _01_sea_creature;

public class RunSeaCreature {
    public static void main(String[] args) {
    	
    	SeaCreature spunglebop = new SeaCreature("spunglebop");
    	spunglebop.eat();
    	spunglebop.laugh();
    	System.out.println("UH OH HERE COME PACHKIN AND SQUORBLE");
    	SeaCreature PACHKIN = new SeaCreature("PACHKIN");
    	SeaCreature SQUORBLE = new SeaCreature("SQUORBLE");
    	PACHKIN.eat();
    	PACHKIN.laugh();
    	SQUORBLE.eat();
    	SQUORBLE.laugh();
    }
}
