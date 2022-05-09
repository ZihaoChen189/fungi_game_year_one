package cards;

public class Morel extends Mushroom {

    public Morel(CardType type) {
        super(type, "morel");

        if (type == CardType.DAYMUSHROOM) {
            flavourPoint = 6;
            sticksPerMushroom = 4;
        }
        if (type == CardType.NIGHTMUSHROOM) {
            flavourPoint = 12;
            sticksPerMushroom = 8;
        }

    }

}
