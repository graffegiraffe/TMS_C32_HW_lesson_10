package main.java.by.rublevskaya;

import main.java.by.rublevskaya.card.ClientCard;

import static main.java.by.rublevskaya.card.ClientCardStatistic.analyzeClientCards;
/*
There is a client.
The client can have any number of cards.
The main.java.by.rublevskaya.card has three fields - cvv code, main.java.by.rublevskaya.card number and amount on the main.java.by.rublevskaya.card.
Display a message on the screen about how many identical cards the client has.
The field with the amount on the main.java.by.rublevskaya.card should not be included in the comparison.
That is, two cards with the same cvv codes and numbers, but different amounts are considered the same.
Provide for different options for the output message - for example, the client does not have any cards at all,
the client does not have any identical cards and other possible situations.
 */
public class Main {
    public static void main(String[] args) {
        ClientCard[] cards = {
                new ClientCard("666", "2525-1111-2005-000", 100000.0),
                new ClientCard("777", "1111-2222-3333-4444", 200.0),
                new ClientCard("666", "2525-1111-2005-000", 300.0)
        };
        analyzeClientCards(cards);
    }
}