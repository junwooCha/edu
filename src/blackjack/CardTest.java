package blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card("스페이드", "A");
        Card c2 = new Card("스페이드", "2");
        Card c3 = new Card("스페이드", "3");

        List<Card> cards = new ArrayList();
        cards.add(c1);
        cards.add(new Card("스페이드", "2"));

        Card ccc = cards.get(0);


        System.out.println(c1.getPattern());
        System.out.println(c1.getDenomination());

        System.out.println(c1);
        System.out.println(c2);

        CardDeck cd = new CardDeck();
        cd.showAllCards();


    }
}
