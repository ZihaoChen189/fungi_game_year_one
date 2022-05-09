package cards;

public class Porcini extends Mushroom{

    public Porcini(CardType type) {
        super(type, "porcini");

        if (type == CardType.DAYMUSHROOM) {
            flavourPoint = 3;
            sticksPerMushroom = 3;
        }
        if (type == CardType.NIGHTMUSHROOM) {
            flavourPoint = 6;
            sticksPerMushroom = 6;
        }

    }

}
