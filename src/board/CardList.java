package board;
import cards.*;
import java.util.ArrayList;

public class CardList {

    private ArrayList<Card> cList;

    public CardList() {
        cList = new ArrayList<>();
    }


    public void add (Card cardAddOne) {
        Board.getForest().cList.add(0, cardAddOne);
    }


    public int size () {
        return cList.size();
    }


    public Card getElementAt (int index) {
        return cList.get(index);
    }


    public Card removeCard (int position) {
        return cList.remove(position);
    }


}
