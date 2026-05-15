package com.pluralsight;

public class Game
{
    private Deck deck;

    public void playGame()
    {
        deck = new Deck();
        deck.shuffle();
        System.out.println("Number of cards in deck: " + deck.getCardCount());
        Card card = deck.takeTopCard();
        System.out.println(card.getSuit() + " : " + card.getFaceValue());
        System.out.println("Number of cards in deck: " + deck.getCardCount());
    }
}
