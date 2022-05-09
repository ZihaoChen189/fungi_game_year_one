package cards;

public class Chanterelle extends Mushroom {

    public Chanterelle(CardType type) {
        super(type, "chanterelle");

        if (type == CardType.DAYMUSHROOM) {
            flavourPoint = 4;
            sticksPerMushroom = 2;
        }
        if (type == CardType.NIGHTMUSHROOM) {
            flavourPoint = 8;
            sticksPerMushroom = 4;
        }

    }
}
