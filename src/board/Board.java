package board;
import cards.*;
import java.util.ArrayList;

public class Board {

    private static CardPile forestCardsPile;
    private static CardList forest;
    private static ArrayList<Card> decayPile;

    public static void initialisePiles () {
        forestCardsPile = new CardPile();
        forest = new CardList();
        decayPile = new ArrayList<>();
    }


    public static void setUpCards () {
        
        for (int i = 1; i < 4; i++) {
            forestCardsPile.addCard(new Butter());
        }
        for (int i = 1; i < 4; i++) {
            forestCardsPile.addCard(new Cider());
        }
        for (int i = 1;  i < 12;  i++) {
            forestCardsPile.addCard(new Pan());
        }
        for (int i = 1; i < 6; i++) {
            forestCardsPile.addCard(new Basket());
        }

        for (int i = 1; i < 11; i++) {
            forestCardsPile.addCard(new HoneyFungus(CardType.DAYMUSHROOM));
        }

        forestCardsPile.addCard(new HoneyFungus(CardType.NIGHTMUSHROOM));

        for (int i = 1; i < 9; i++) {
            forestCardsPile.addCard(new TreeEar(CardType.DAYMUSHROOM));
        }

        forestCardsPile.addCard(new TreeEar(CardType.NIGHTMUSHROOM));

        for (int i = 1; i < 7; i++) {
            forestCardsPile.addCard(new LawyersWig(CardType.DAYMUSHROOM));
        }

        forestCardsPile.addCard(new LawyersWig(CardType.NIGHTMUSHROOM));

        for (int i = 1; i < 6; i++) {
            forestCardsPile.addCard(new Shiitake(CardType.DAYMUSHROOM));
        }

        forestCardsPile.addCard(new Shiitake(CardType.NIGHTMUSHROOM));

        for (int i = 1; i < 6; i++) {
            forestCardsPile.addCard(new HenOfWoods(CardType.DAYMUSHROOM));
        }

        forestCardsPile.addCard(new HenOfWoods(CardType.NIGHTMUSHROOM));

        for (int i = 1; i < 5; i++) {
            forestCardsPile.addCard(new BirchBolete(CardType.DAYMUSHROOM));
        }

        forestCardsPile.addCard(new BirchBolete(CardType.NIGHTMUSHROOM));

        for (int i = 1; i < 5; i++) {
            forestCardsPile.addCard(new Porcini(CardType.DAYMUSHROOM));
        }

        forestCardsPile.addCard(new Porcini(CardType.NIGHTMUSHROOM));

        for (int i = 1; i < 5; i++) {
            forestCardsPile.addCard(new Chanterelle(CardType.DAYMUSHROOM));
        }

        forestCardsPile.addCard(new Chanterelle(CardType.NIGHTMUSHROOM));

        for (int i = 1; i < 4; i++) {
            forestCardsPile.addCard(new Morel(CardType.DAYMUSHROOM));
        }

    }


    public static CardPile getForestCardsPile () {
        return forestCardsPile;
    }


    public static CardList getForest () {
        return forest;
    }


    public static ArrayList<Card> getDecayPile () {
        return decayPile;
    }


    public static void updateDecayPile () {
        if (getDecayPile().size() < 4) {
            getDecayPile().add(getForest().getElementAt(getForest().size() - 1));
            Board.getForest().removeCard(getForest().size() - 1);
        } else {
            getDecayPile().clear();
            getDecayPile().add(getForest().getElementAt(getForest().size() - 1));
            Board.getForest().removeCard(getForest().size() - 1);
        }
    }


}
