import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class getTotalSales extends JFrame{
    private JButton pressToShowSalesButton;
    private JPanel panel6;
    private JLabel label2;
    private JLabel label1;
    private JButton returnToMainMenuButton;

    getTotalSales(Pharmacy p1){
        setTitle("Get total sales");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panel6);
        setVisible(true);
        pressToShowSalesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            label2.setText(p1.getTotalSales());
            }
        });
        returnToMainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2 f2 = new frame2(p1);
                dispose();
            }
        });
    }
}
