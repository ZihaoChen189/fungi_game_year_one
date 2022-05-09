package cards;

public class BirchBolete extends Mushroom {

    public BirchBolete(CardType type) {
        super(type, "birchbolete");

        if (type == CardType.DAYMUSHROOM) {
            flavourPoint = 3;
            sticksPerMushroom = 2;
        }
        if (type == CardType.NIGHTMUSHROOM) {
            flavourPoint = 6;
            sticksPerMushroom = 4;
        }

    }

}
