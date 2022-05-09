package board;
import cards.*;
import java.util.ArrayList;

public class Display implements Displayable {

    private ArrayList<Card> displayList = new ArrayList<Card>();

    @Override
    public void add(Card cardAddOne) {
        displayList.add(cardAddOne);
    }


    @Override
    public int size() {
        return displayList.size();
    }


    @Override
    public Card getElementAt(int index) {
        return displayList.get(index);
    }


    @Override
    public Card removeElement(int index) {

        return displayList.remove(index);
    }


}
