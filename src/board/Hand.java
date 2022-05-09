package board;
import cards.Card;
import java.util.ArrayList;

public class Hand implements Displayable {

    private ArrayList<Card> handList = new ArrayList<Card>();

    @Override
    public void add(Card cardAddOne) {
        handList.add(cardAddOne);
    }


    @Override
    public int size() {
        return handList.size();
    }


    @Override
    public Card getElementAt (int index) {
        return handList.get(index);
    }


    @Override
    public Card removeElement(int index) {
        return handList.remove(index);
    }


}
