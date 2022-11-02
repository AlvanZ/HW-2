
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ShowGroupTotal extends JButton implements ActionListener {
    private JButton button;
    public ShowGroupTotal(){
        button = new JButton();
        button.setText("Show Group Total");
        button.setFocusable(false);
        button.addActionListener(this);
        button.setBounds(0,0, 100, 50);
    }
    public JButton getButton(){
        return button;
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("Test");
        }
        
    }

}