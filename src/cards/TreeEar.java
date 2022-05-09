package cards;

public class TreeEar extends Mushroom{

    public TreeEar(CardType type) {
        super(type, "treeear");

        if (type == CardType.DAYMUSHROOM) {
            flavourPoint = 1;
            sticksPerMushroom = 2;
        }
        if (type == CardType.NIGHTMUSHROOM) {
            flavourPoint = 2;
            sticksPerMushroom = 4;
        }

    }

}
