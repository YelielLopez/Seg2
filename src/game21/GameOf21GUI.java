package game21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GameOf21GUI extends JFrame {
    private static final int MAX_SCORE = 21;
    private static final int DEALER_THRESHOLD = 17;
    private ArrayList<Integer> deck;
    private ArrayList<Integer> playerHand;
    private ArrayList<Integer> dealerHand;
    private JLabel playerCardsLabel;
    private JLabel dealerCardsLabel;
    private JLabel messageLabel;
    private JButton hitButton;
    private JButton standButton;

    public GameOf21GUI() {
        setTitle("Juego de 21");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        deck = createDeck();
        Collections.shuffle(deck);
        playerHand = new ArrayList<>();
        dealerHand = new ArrayList<>();
        playerHand.add(drawCard());
        playerHand.add(drawCard());
        dealerHand.add(drawCard());
        dealerHand.add(drawCard());

        playerCardsLabel = new JLabel("Tus cartas: " + printHand(playerHand) + " (Puntuación: " + calculateScore(playerHand) + ")");
        dealerCardsLabel = new JLabel("Carta oculta del dealer: " + dealerHand.get(0));
        messageLabel = new JLabel("Elige: [P] para recibir carta | [S] para plantarse");
        hitButton = new JButton("Pedir carta");
        standButton = new JButton("Plantarse");

        hitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hit();
            }
        });

        standButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stand();
            }
        });

        add(playerCardsLabel);
        add(dealerCardsLabel);
        add(messageLabel);
        add(hitButton);
        add(standButton);

        setVisible(true);
    }

    private void hit() {
        playerHand.add(drawCard());
        playerCardsLabel.setText("Tus cartas: " + printHand(playerHand) + " (Puntuación: " + calculateScore(playerHand) + ")");

        if (calculateScore(playerHand) > MAX_SCORE) {
            messageLabel.setText("Te has pasado de 21. ¡Pierdes!");
            hitButton.setEnabled(false);
            standButton.setEnabled(false);
        }
    }

    private void stand() {
        dealerCardsLabel.setText("Carta del dealer: " + printHand(dealerHand) + " (Puntuación: " + calculateScore(dealerHand) + ")");
        while (calculateScore(dealerHand) < DEALER_THRESHOLD) {
            dealerHand.add(drawCard());
            dealerCardsLabel.setText("Carta del dealer: " + printHand(dealerHand) + " (Puntuación: " + calculateScore(dealerHand) + ")");
        }

        int playerScore = calculateScore(playerHand);
        int dealerScore = calculateScore(dealerHand);

        if (playerScore > MAX_SCORE) {
            messageLabel.setText("Te has pasado de 21. ¡Pierdes!");
        } else if (dealerScore > MAX_SCORE || playerScore > dealerScore) {
            messageLabel.setText("¡Ganaste!");
        } else if (playerScore < dealerScore) {
            messageLabel.setText("¡Perdiste!");
        } else {
            messageLabel.setText("¡Empate!");
        }
        hitButton.setEnabled(false);
        standButton.setEnabled(false);
    }

    private ArrayList<Integer> createDeck() {
        ArrayList<Integer> deck = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 4; j++) { // Cuatro palos, aunque el palo no se usa aquí
                deck.add(i);
            }
        }
        return deck;
    }

    private int drawCard() {
        return deck.remove(new Random().nextInt(deck.size()));
    }

    private int calculateScore(ArrayList<Integer> hand) {
        int score = 0;
        for (int card : hand) {
            score += card;
        }
        return score;
    }

    private String printHand(ArrayList<Integer> hand) {
        StringBuilder sb = new StringBuilder();
        for (int card : hand) {
            sb.append(card).append(" ");
        }
        return sb.toString().trim();
    }
}
