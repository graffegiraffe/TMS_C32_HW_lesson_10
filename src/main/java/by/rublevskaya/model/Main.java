package main.java.by.rublevskaya.model;

import main.java.by.rublevskaya.model.card.ClientCard;
import main.java.by.rublevskaya.model.Client;

import static main.java.by.rublevskaya.model.operation.ClientCardStatistic.analyzeClientCards;
/*
There is a client.
The client can have any number of cards.
The card has three fields - cvv code, card number and amount on the card.
Display a message on the screen about how many identical cards the client has.
The field with the amount on the card should not be included in the comparison.
That is, two cards with the same cvv codes and numbers, but different amounts are considered the same.
Provide for different options for the output message - for example, the client does not have any cards at all,
the client does not have any identical cards and other possible situations.
 */
public class Main {
    public static void main(String[] args) {

        ClientCard[] katyaCards = {
                new ClientCard("666", "2525-1111-2005-000", 100000.0),
                new ClientCard("777", "1111-2222-3333-4444", 200.0),
                new ClientCard("666", "2525-1111-2005-000", 300.0)
        };

        Client katya = new main.java.by.rublevskaya.model.Client("Kate", katyaCards);
        System.out.println("Analysis of customer cards: " + katya.getName());
        analyzeClientCards(katya.getCards());

        ClientCard[] andreyCards = {
                new ClientCard("999", "1111-2222-3333-4444", 50000.0),
                new ClientCard("999", "5555-6996-9999-5555", 600.0)
        };
        Client andrey = new Client("Andrew", andreyCards);
        System.out.println("\nAnalysis of customer cards: " + andrey.getName());
        analyzeClientCards(andrey.getCards());
    }
}