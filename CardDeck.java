public class CardDeck {
    private Card[] cards;

    public CardDeck() {
        cards = new Card[6];
        cards[0] = new Card(new String[] {Card.MINUS, Card.MINUS});
        cards[1] = new Card(new String[] {Card.MINUS, Card.PLUS});
        cards[2] = new Card(new String[] {Card.PLUS, Card.PLUS});
        cards[3] = new Card(new String[] {Card.MINUS, Card.MINUS});
        cards[4] = new Card(new String[] {Card.MINUS, Card.PLUS});
        cards[5] = new Card(new String[] {Card.PLUS, Card.PLUS});
    }

    public Card takeOne() {
        // generate a number between 0-5 for the card
        int cardNumber = (int) (Math.random() * 6);
        Card card = cards[cardNumber];
        // generate a number between 0-1 for the up face
        int faceNumber = (int) (Math.random() * 2);
        card.setUpFace(faceNumber);
        return card;
    }
}
