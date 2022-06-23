import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    ImageIcon buttonIcon = new ImageIcon("logo1.png");
    Button button = new Button(100, 100, 250, 100);

    Frame(){
        this.setSize(1200, 800);
        this.setResizable(true);
        this.setTitle("Tytuł ramki");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon logo = new ImageIcon(getClass().getResource("logo1.png"));
        this.setIconImage(logo.getImage());
//        this.getContentPane().setBackground(new Color(123,50,250));

//Dodawanie Buttons

//        this.add(button);
        button.addActionListener(this);
//        button.setIcon(buttonIcon);
//        button.setHorizontalTextPosition(JButton.RIGHT);
//        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalAlignment(JButton.RIGHT);
        button.setVerticalAlignment(JButton.BOTTOM);
        button.setFont(new Font("Sans Serif", Font.BOLD, 25));
        button.setForeground(Color.RED);
        button.setBackground(Color.BLACK);
        button.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5));
        button.setEnabled(true);    // można wyłączyć przycisk

//Dodawanie Labels
        Label label = new Label();
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.LEFT);

//Dodawanie Paneli

        Panel redPanel = new Panel(Color.RED, 0, 0, 250, 200);
//        this.add(redPanel);

        Panel greenPanel = new Panel(Color.GREEN, 250, 0, 400, 400);
//        this.add(greenPanel);
        greenPanel.add(label);
        greenPanel.setLayout(null);
        greenPanel.add(button);
        label.setVisible(true);
/*
Layout Manager - defines the natural layout for components within a container
BorderLayout - places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER
All extra space is placed in the center area
 */

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100, 50));
        panel2.setPreferredSize(new Dimension(100, 50));
        panel3.setPreferredSize(new Dimension(50, 100));
        panel4.setPreferredSize(new Dimension(50, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        this.setLayout(new BorderLayout(10, 10));   //W nawiasie grubość pionowych i poziomych lini między panelami

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.SOUTH);
        this.add(panel3, BorderLayout.EAST);
        this.add(panel4, BorderLayout.WEST);
        this.add(panel5, BorderLayout.CENTER);

//----------------------------------subpanels------------------------------

        panel5.setLayout(new BorderLayout());   //teraz można na tej samej zasadzie podokładać panele do tego panelu



//Wyłącza Layout Managera i można ręcznie ustawiać rozmieszczenie elementów w ramce
//        this.setLayout(null);

/*
dopasowuje rozmieszczenie elementów w ramce automatycznie, ale trzeba wył ręczne opcje ustawień, np bounds
należy użyć przed dodatniem wszsytkich elementów
 */
//        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("pooo");
        }
    }
}
