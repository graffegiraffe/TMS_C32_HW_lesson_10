package main.java.by.rublevskaya.card;

public class ClientCardStatistic {

    public static void analyzeClientCards(ClientCard[] cards) {
        if (cards == null || cards.length == 0) {
            System.out.println("the client does not have a single main.java.by.rublevskaya.card");
            return;
        }

        int uniqueCount = 0;
        ClientCard[] countedCards = new ClientCard[cards.length];
        int[] counts = new int[cards.length];

        for (ClientCard card : cards) {
            boolean found = false;
            for (int i = 0; i < uniqueCount; i++) {
                if (card.equals(countedCards[i])) {
                    counts[i]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                countedCards[uniqueCount] = card;
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        int identicalCount = 0;
        for (int count : counts) {
            if (count > 1) {
                identicalCount++;
            }
        }

        if (identicalCount == 0) {
            System.out.println("the client does not have identical cards");
        } else {
            System.out.println("the client has the same cards:");
            for (int i = 0; i < uniqueCount; i++) {
                if (counts[i] > 1) {
                    System.out.println("main.java.by.rublevskaya.card with cvv: " + countedCards[i].getCvv() +
                            " and number " + countedCards[i].getNumber() +
                            " we can see " + counts[i] + " times ");
                }
            }
        }
    }
}
