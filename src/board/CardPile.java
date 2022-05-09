package board;
import cards.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class CardPile {

    private Stack<Card> cPile ;

    public CardPile() {
        cPile = new Stack<>();
    }


    public void addCard (Card cardAddOne) {
        cPile.push(cardAddOne);
    }


    public Card drawCard () {
        return cPile.pop();
    }


    public void shufflePile() {
        List<Card> shuffleList = new ArrayList<>();
        int size = cPile.size();
        for (int i = 0; i < size; i++) {
            Card pop = cPile.pop();
            shuffleList.add(pop);
        }

        Collections.shuffle(shuffleList);
        Stack<Card> stack = new Stack<>();
        for (int i = 0; i < shuffleList.size(); i++) {
            stack.push(shuffleList.get(i));
        }
        this.cPile = stack;
    }


    public int pileSize () {
        return cPile.size();
    }


    public boolean isEmpty () {
        if (cPile.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    
}
