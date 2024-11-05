package main.java.by.rublevskaya.model.card;

import java.util.Objects;

public class ClientCard {
    private String cvv;
    private String number;
    private double balance;

    public ClientCard(String cvv, String number, double balance) {
        this.cvv = cvv;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientCard that = (ClientCard) o;
        return Objects.equals(cvv, that.cvv) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvv, number);
    }
}
