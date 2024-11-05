package main.java.by.rublevskaya.model;

import main.java.by.rublevskaya.model.card.ClientCard;
import java.util.Arrays;

public class Client {
    private String name;
    private ClientCard[] cards;

    public Client(String name, ClientCard[] cards) {
        this.name = name;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public ClientCard[] getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", cards=" + Arrays.toString(cards) +
                '}';
    }
}
