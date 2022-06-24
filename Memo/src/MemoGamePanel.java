import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MemoGamePanel extends JPanel implements ActionListener {

    private static int size = 6;
    private String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
            "P", "R", "S"};
    private String[][] lettersArray = makeArray(letters);
    private MemoButton[][] buttons = addButtons();

    private MemoButton buttonPreviousClick = null;

    int currentIndex_i, currentIndex_j, previosIndex_i, previousIndex_j, clickCount;
    int score;


    public MemoGamePanel() {
        this.setBackground(Color.GRAY);
        this.setPreferredSize(new Dimension(100, 100));
        this.setLayout(new GridLayout(size, size, 3, 3));
        this.setBorder(BorderFactory.createLineBorder(Color.GRAY, 5));
    }

    //----------------------       Randomize Array      ------------------------------------
    public String[][] makeArray(String[] letters) {
        int[] lettersIndexesRandom = new int[2 * letters.length];
        lettersIndexesRandom[0] = 0;
        for (int j = 1, i = -(letters.length) + 1; i < letters.length; i++, j++) {
            lettersIndexesRandom[j] = i;
        }
        Random generator = new Random();
        for (int i = (lettersIndexesRandom.length - 1); i >= 0; i--) {
            int randomNumber = generator.nextInt(i + 1);
            int temp = Math.abs(lettersIndexesRandom[i]);
            lettersIndexesRandom[i] = Math.abs(lettersIndexesRandom[randomNumber]);
            lettersIndexesRandom[randomNumber] = temp;
        }

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
            // check whether same position is clicked twice!
//            if (currentIndex_i == previosIndex_i && currentIndex_j == previousIndex_j) {
//                clickCount--;
//                return;
//            }

            if(lettersArray[currentIndex_i][currentIndex_j] != lettersArray[previosIndex_i][previousIndex_j]) {
                System.out.println("Nie zrownalo sie");
                timer.start();
            } else {
                score++;
            }
        } else {
            System.out.println("current = " + lettersArray[currentIndex_i][currentIndex_j] + "-----previous = " + lettersArray[previosIndex_i][previousIndex_j]);
            previosIndex_i = currentIndex_i;
            previousIndex_j = currentIndex_j;
        }
    }
}