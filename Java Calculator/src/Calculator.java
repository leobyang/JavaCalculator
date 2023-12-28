import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator {
    private JPanel Calculator;
    private JTextField txtDisplay;
    private JButton ACButton;
    private JButton a9Button;
    private JButton multliplyButton;
    private JButton divideButton;
    private JButton equalButton;
    private JButton deleteButton;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton addButton;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton plusMinusButton;
    private JButton a6Button;
    private JButton a3Button;
    private JButton subtractButton;
    private JButton decimalButton;
    double a, b, c;
    String op;

    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a9Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a0Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+a00Button.getText());
            }
        });
        plusMinusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplay.getText().contains(".")){
                    double pm=Double.parseDouble(txtDisplay.getText());
                    pm=pm*-1;
                    txtDisplay.setText(String.valueOf(pm));
                }
                else{
                    int PM=Integer.parseInt(txtDisplay.getText());
                    PM=PM*-1;
                    txtDisplay.setText(String.valueOf(PM));
                }
            }
        });
        decimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtDisplay.getText().contains(".")){
                    txtDisplay.setText(txtDisplay.getText());
                }else{
                    txtDisplay.setText(txtDisplay.getText()+decimalButton.getText());
                }
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(txtDisplay.getText());
                op="+";
                txtDisplay.setText("");
            }
        });
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(txtDisplay.getText());
                op="-";
                txtDisplay.setText("");
            }
        });
        multliplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(txtDisplay.getText());
                op="x";
                txtDisplay.setText("");
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(txtDisplay.getText());
                op="/";
                txtDisplay.setText("");
            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b=Double.parseDouble(txtDisplay.getText());
                if (op.equals("+")){
                    c=a+b;
                    txtDisplay.setText(String.valueOf(c));
                }else if(op.equals("-")){
                    c=a-b;
                    txtDisplay.setText(String.valueOf(c));
                }else if (op.equals("x")){
                    c=a*b;
                    txtDisplay.setText(String.valueOf(c));
                }else{
                    c=a/b;
                    txtDisplay.setText(String.valueOf(c));
                }
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String backspace=null;
            if(txtDisplay.getText().length()>0){
                StringBuilder strB= new StringBuilder(txtDisplay.getText());
                strB.deleteCharAt(txtDisplay.getText().length()-1);
                backspace=String.valueOf(strB);
                txtDisplay.setText(backspace);
            }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
