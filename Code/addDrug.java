import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addDrug extends JFrame{
    addDrug(Pharmacy p1){
        setTitle("Add drug");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panel3);
        setVisible(true);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                int ID = Integer.parseInt(textField2.getText());
                double price = Double.parseDouble(textField3.getText());
                String category = textField4.getText();
                int Quantity = Integer.parseInt(textField5.getText());
                if(price < 1 || ID < 1 || Quantity < 1 || name == null || category == null){
                    JOptionPane.showMessageDialog(null, "Enter valid info!");
                }
                else {
                    boolean x = p1.addDrug(name, ID, price, category, Quantity);
                    if(x) {
                        JOptionPane.showMessageDialog(null, "Drug Added returing to Main Menu!");
                        frame2 f2 = new frame2(p1);
                        dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "No capacity!!!! returing to Main Menu!");
                        frame2 f2 = new frame2(p1);
                        dispose();
                    }
                }
            }
        });
    }
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton submitButton;
    private JPanel panel3;
    private JLabel id;
    private JLabel price;
    private JLabel category;
    private JLabel name1;
    private JLabel quantity;
}
