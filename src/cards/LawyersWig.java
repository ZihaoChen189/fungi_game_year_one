package cards;

public class LawyersWig extends Mushroom {

    public LawyersWig(CardType type) {
        super(type, "lawyerswig");

        if (type == CardType.DAYMUSHROOM) {
            flavourPoint = 2;
            sticksPerMushroom = 1;
        }
        if (type == CardType.NIGHTMUSHROOM) {
            flavourPoint = 4;
            sticksPerMushroom = 2;
        }

    }

}
