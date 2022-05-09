package board;
import cards.*;

public interface Displayable {

    void add(Card cardAddOne);


    int size();


    Card getElementAt (int index);


    Card removeElement (int index);


}
