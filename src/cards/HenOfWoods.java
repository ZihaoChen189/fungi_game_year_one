package cards;

public class HenOfWoods extends Mushroom {

    public HenOfWoods(CardType type) {
        super(type, "henofwoods");

        if (type == CardType.DAYMUSHROOM) {
            flavourPoint = 3;
            sticksPerMushroom = 1;
        }
        if (type == CardType.NIGHTMUSHROOM) {
            flavourPoint = 6;
            sticksPerMushroom = 2;
        }

    }
    
}
