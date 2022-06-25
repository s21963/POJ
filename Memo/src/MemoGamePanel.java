import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MemoGamePanel extends JPanel implements ActionListener {

    private static int size = 6;

    //----------------------       Array with letters      ------------------------------------
    private String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
            "P", "R", "S"};
    private String[][] lettersArray = makeArray(letters);   //Array randomized and adjusted with the GridLayout of buttons
    private MemoButton[][] buttons = addButtons();      //Tablica przycisków
    int currentIndex_i, currentIndex_j, previosIndex_i, previousIndex_j;
    public static int score, clickCount;

    //----------------------       Constructor MemoGamePanel      ------------------------------------
    public MemoGamePanel() {
        this.setBackground(Color.GRAY);
        this.setPreferredSize(new Dimension(100, 100));
        this.setLayout(new GridLayout(size, size, 3, 3));
        this.setBorder(BorderFactory.createLineBorder(Color.GRAY, 5));
    }

    //----------------------       Randomize Array      ------------------------------------
    //Przyporządkowanie Tablicy z indeksami wartości odpowiadających tym indeksom
    public String[][] makeArray(String[] letters) {
        int[] lettersIndexesRandom = new int[2 * letters.length];   //Tablica z indeksami
        lettersIndexesRandom[0] = 0;
        for (int j = 1, i = -(letters.length) + 1; i < letters.length; i++, j++) {
            lettersIndexesRandom[j] = i;
        }
        //Mieszanie indeksów w tablicy z indeksami
        Random generator = new Random();
        for (int i = (lettersIndexesRandom.length - 1); i >= 0; i--) {
            int randomNumber = generator.nextInt(i + 1);
            int temp = Math.abs(lettersIndexesRandom[i]);
            lettersIndexesRandom[i] = Math.abs(lettersIndexesRandom[randomNumber]);
            lettersIndexesRandom[randomNumber] = temp;
        }
        //Wpisanie do tablicy lettersArray wartości z tablicy letters, każda po 2x, w oparciu o losowe indeksy z powyżej
        int count = 0;
        String[][] lettersArray = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                lettersArray[i][j] = letters[lettersIndexesRandom[count]];
                count++;
                //System.out.println("lettersArray[i][j] = " + lettersArray[i][j]);
            }
        }
        return lettersArray;
    }

//----------------------        add Buttons         ------------------------------------
    public MemoButton[][] addButtons() {
        MemoButton[][] buttons = new MemoButton[size][size];
        MemoButton temp = new MemoButton();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                MemoButton tempButton = new MemoButton();
//                tempButton.setText(lettersArray[i][j]);
                tempButton.addActionListener(this::actionPerformed);
                buttons[i][j] = tempButton;
                this.add(buttons[i][j]);

            }
        }
        return buttons;
    }

    //----------------------        Actions         ------------------------------------
    Timer timer = new Timer(1000, this::resetButtons);

    //zasłanianie przycisków po niedopasowaniu
    public void resetButtons (ActionEvent e){
        buttons[currentIndex_i][currentIndex_j].setText("");
        buttons[previosIndex_i][previousIndex_j].setText("");
        timer.stop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (timer.isRunning())
        return;

        clickCount++;
        MemoMenuPanel.clickCard.setText("Liczba kliknięć:: " + Integer.toString(clickCount));
        System.out.println("Liczba kliknięć: " + clickCount);   //przekazanie ilości kliknięć do panelu Menu

        //Przypisanie właściwych wartości indeksów do zmiennych po kliknięciu przycisku
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (e.getSource() == buttons[i][j] && buttons[i][j] != buttons[previosIndex_i][previousIndex_j]) {
                    currentIndex_i = i;
                    currentIndex_j = j;
                    buttons[currentIndex_i][currentIndex_j].setText(lettersArray[currentIndex_i][currentIndex_j]);
                }
            }
        }
        if (clickCount % 2 == 0) {

            //Eliminacja podwójnych kliknięć
            if (currentIndex_i == previosIndex_i && currentIndex_j == previousIndex_j) {
                clickCount--;
                return;
            }
            if(lettersArray[currentIndex_i][currentIndex_j] != lettersArray[previosIndex_i][previousIndex_j]) {
                timer.start();
            } else {
                score++;
                MemoMenuPanel.scoreCard.setText("Twój wynik:: " + Integer.toString(score));
                System.out.println("Twój wynik to: " + score);      //przekananie nowego wyniku do panelu Menu
            }
        } else {
//            System.out.println("current = " + lettersArray[currentIndex_i][currentIndex_j] + "-----previous = " + lettersArray[previosIndex_i][previousIndex_j]);
            previosIndex_i = currentIndex_i;
            previousIndex_j = currentIndex_j;
        }
    }
}