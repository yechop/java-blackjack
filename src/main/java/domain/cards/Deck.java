package domain.cards;

import java.util.List;

public class Deck {

    private static final int FIRST_CARD = 0;

    private final List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public Card pickOneCard() {
        return cards.remove(FIRST_CARD);
    }
}
