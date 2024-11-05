package main.java.by.rublevskaya.model.operation;

import main.java.by.rublevskaya.model.card.ClientCard;

public class ClientCardStatistic {

    public static void analyzeClientCards(ClientCard[] cards) {
        if (cards == null || cards.length == 0) {
            System.out.println("the client does not have a single card");
        } else if (cards.length == 1) {
            System.out.println("the client has a single card");
        } else {
            int identicalCount = countIdenticalCards(cards);
            if (identicalCount > 0) {
                System.out.printf("the client has %d identical cards\n", identicalCount);
            } else {
                System.out.println("the client does not have identical cards");
            }
        }
    }

    private static int countIdenticalCards(ClientCard[] cards) {
        int identicalCount = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].equals(cards[j])) {
                    identicalCount++;
                }
            }
        }
        return identicalCount;
    }
}
