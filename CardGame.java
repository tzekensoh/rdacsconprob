/**
 * From Wikipedia:
 * According to the law of large numbers, the average of the results obtained from a large number of trials
 * should be close to the expected value and will tend to become closer to the expected value as more trials
 * are performed.
 */

public class CardGame {
    private static int lengthOfSimulation = 10000;

    /**
     * The simulation is about drawing random cards from a specific deck of cards. (See CardDeck for details)
     * Reshuffle every time (including flipping some cards randomly too)
     * Calculate the experimental conditional probability P(A|B) for both sides are "+" (Event A)
     * with the given condition: the up side is "+" (Event B)
     * The theoretical conditional probability P(A|B) = P(A and B)/P(B)
     * P(A and B) = 2/6 (2 out of 6 cards are + +)
     * P(B) = 6/12 (6 cards * 2 sides/card = 12 sides that can be the up side. 6 of them are +)
     * So P(A|B) = 2/3 = 66%
     */
    private static void runSimulations() {
        CardDeck cardDeck = new CardDeck();
        int upSideIsPlusTally = 0;
        int bothSidesArePlusesTally = 0;

        for (int i = 0; i < lengthOfSimulation; i++) {
            Card card = cardDeck.takeOne();
            System.out.println(i + " : " + card);
            if (Card.PLUS.equals(card.getUpSide())) {
                upSideIsPlusTally++;
                System.out.println("current upSideIsPlusTally : " + upSideIsPlusTally);
                if (Card.PLUS.equals(card.getDownSide())) {
                    bothSidesArePlusesTally++;
                    System.out.println("current bothSidesArePlusesTally : " + bothSidesArePlusesTally);
                }
            }
        }
        System.out.println("Final upSideIsPlusTally : " + upSideIsPlusTally);
        System.out.println("Final bothSidesArePlusesTally : " + bothSidesArePlusesTally);
        System.out.println("Experimental conditional probability = "
                + (double) bothSidesArePlusesTally / upSideIsPlusTally * 100 + "%");
    }

    public static void main(String[] argv) {
        if (argv.length > 0)
            lengthOfSimulation = Integer.parseInt(argv[0]);
        runSimulations();
    }
}
