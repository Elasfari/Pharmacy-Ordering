import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame2 extends JFrame{
    private JButton okButton;
    private JButton okButton1;
    private JButton okButton2;
    private JButton okButton3;
    private JButton okButton4;
    private JPanel panel2;

    private int choice = -1;
    frame2(Pharmacy p1){
        setTitle("Main Menu");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panel2);
        setVisible(true);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            addDrug addition = new addDrug(p1);
            dispose();
            }
        });
        okButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            removeDrug remover = new removeDrug(p1);
                dispose();
            }
        });
        okButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placeAnOrder placement = new placeAnOrder(p1);
                dispose();
            }
        });
        okButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTotalSales seller = new getTotalSales(p1);
                dispose();
            }
        });
        okButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });

    }
}
