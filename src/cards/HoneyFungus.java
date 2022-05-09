package cards;

public class HoneyFungus extends Mushroom {

    public HoneyFungus(CardType type) {
        super(type, "honeyfungus");

        if (type == CardType.DAYMUSHROOM) {
            flavourPoint = 1;
            sticksPerMushroom = 1;
        }
        if (type == CardType.NIGHTMUSHROOM) {
            flavourPoint = 2;
            sticksPerMushroom = 2;
        }

    }

}
