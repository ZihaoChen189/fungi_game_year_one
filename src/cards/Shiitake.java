package cards;

public class Shiitake extends Mushroom{

    public Shiitake(CardType type) {
        super(type, "shiitake");

        if (type == CardType.DAYMUSHROOM) {
            flavourPoint = 2;
            sticksPerMushroom = 2;
        }
        if (type == CardType.NIGHTMUSHROOM) {
            flavourPoint = 4;
            sticksPerMushroom = 4;
        }

    }

}
