package cards;

public class EdibleItem extends Card {

    protected int flavourPoint;

    public EdibleItem(CardType type, String cardName) {
        super(type, cardName);
    }


    public int getFlavourPoints () {
        return flavourPoint;
    }


}
