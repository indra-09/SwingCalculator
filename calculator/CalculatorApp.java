import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApp implements ActionListener{

    double num1=0,num2=0,result=0;
    int calculation;
 
    JFrame frame=new JFrame("My Calculator");
    JLabel label=new JLabel();
    JTextField textfield=new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton Buttonzero =new JButton("0");
    JButton Buttonone =new JButton("1");
    JButton Buttontwo =new JButton("2");
    JButton Buttonthree =new JButton("3");
    JButton Buttonfour =new JButton("4");
    JButton Buttonfive =new JButton("5");
    JButton Buttonsix =new JButton("6");
    JButton Buttonseven =new JButton("7");
    JButton Buttoneight =new JButton("8");
    JButton Buttonnine =new JButton("9");
    JButton Buttondot =new JButton(".");
    JButton Buttonclear =new JButton("C");
    JButton Buttondelete =new JButton("DEL");
    JButton Buttonequal =new JButton("=");
    JButton Buttonmultiply =new JButton("*");
    JButton Buttondivide =new JButton("/");
    JButton Buttonadd =new JButton("+");
    JButton Buttonsubtract =new JButton("-");
    JButton Buttonsquare =new JButton("x\u00B2");
    JButton Buttonsqrt =new JButton("\u221A");

    
    
    
    
    CalculatorApp(){
        prepareGUI(); 
        addButtons();
        addActionEvent();
    }

    public void prepareGUI(){
        frame.setSize(300,500);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addButtons(){
        label.setBounds(250,0,50,50);
        label.setForeground(Color.white);
        frame.add(label);

        textfield.setBounds(10,40,270,40);
        textfield.setFont(new Font("Arial",Font.BOLD,20));
        textfield.setEditable(false);
        textfield.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textfield);

        onRadioButton.setBounds(10,95,60,40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10,120,60,40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);
        

        ButtonGroup buttongroup= new ButtonGroup();
        buttongroup.add(onRadioButton);
        buttongroup.add(offRadioButton);


        Buttonseven.setBounds(10,230,60,40);
        Buttonseven.setFont(new Font("Arial",Font.BOLD,20));
        Buttonseven.setFocusable(false);
        frame.add(Buttonseven);

        Buttoneight.setBounds(80,230,60,40);
        Buttoneight.setFont(new Font("Arial",Font.BOLD,20));
        Buttoneight.setFocusable(false);
        frame.add(Buttoneight);

        Buttonnine.setBounds(150,230,60,40);
        Buttonnine.setFont(new Font("Arial",Font.BOLD,20));
        Buttonnine.setFocusable(false);
        frame.add(Buttonnine);

        Buttonfour.setBounds(10,290,60,40);
        Buttonfour.setFont(new Font("Arial",Font.BOLD,20));
        Buttonfour.setFocusable(false);
        frame.add(Buttonfour);

        Buttonfive.setBounds(80,290,60,40);
        Buttonfive.setFont(new Font("Arial",Font.BOLD,20));
        Buttonfive.setFocusable(false);
        frame.add(Buttonfive);

        Buttonsix.setBounds(150,290,60,40);
        Buttonsix.setFont(new Font("Arial",Font.BOLD,20));
        Buttonsix.setFocusable(false);
        frame.add(Buttonsix);

        Buttonone.setBounds(10,350,60,40);
        Buttonone.setFont(new Font("Arial",Font.BOLD,20));
        Buttonone.setFocusable(false);
        frame.add(Buttonone);

        Buttontwo.setBounds(80,350,60,40);
        Buttontwo.setFont(new Font("Arial",Font.BOLD,20));
        Buttontwo.setFocusable(false);
        frame.add(Buttontwo);

        Buttonthree.setBounds(150,350,60,40);
        Buttonthree.setFont(new Font("Arial",Font.BOLD,20));
        Buttonthree.setFocusable(false);
        frame.add(Buttonthree);

        Buttondot.setBounds(150,410,60,40);
        Buttondot.setFont(new Font("Arial",Font.BOLD,20));
        Buttondot.setFocusable(false);
        frame.add(Buttondot);

        Buttonzero.setBounds(10,410,130,40);
        Buttonzero.setFont(new Font("Arial",Font.BOLD,20));
        Buttonzero.setFocusable(false);
        frame.add(Buttonzero);

        Buttonequal.setBounds(220,350,60,100);
        Buttonequal.setFont(new Font("Arial",Font.BOLD,20));
        Buttonequal.setBackground(new Color(239,188,2));
        Buttonequal.setFocusable(false);
        frame.add(Buttonequal);

        Buttondivide.setBounds(220,110,60,40);
        Buttondivide.setFont(new Font("Arial",Font.BOLD,20));
        Buttondivide.setBackground(new Color(239,188,2));
        Buttondivide.setFocusable(false);
        frame.add(Buttondivide);

        Buttonsqrt.setBounds(10,170,60,40);
        Buttonsqrt.setFont(new Font("Arial",Font.BOLD,18));
        Buttonsqrt.setFocusable(false);
        frame.add(Buttonsqrt);

        Buttonmultiply.setBounds(220,230,60,40);
        Buttonmultiply.setFont(new Font("Arial",Font.BOLD,20));
        Buttonmultiply.setBackground(new Color(239,188,2));
        Buttonmultiply.setFocusable(false);
        frame.add(Buttonmultiply);

        Buttonadd.setBounds(220,290,60,40);
        Buttonadd.setFont(new Font("Arial",Font.BOLD,20));
        Buttonadd.setBackground(new Color(239,188,2));
        Buttonadd.setFocusable(false);
        frame.add(Buttonadd);

        Buttonsubtract.setBounds(220,170,60,40);
        Buttonsubtract.setFont(new Font("Arial",Font.BOLD,20));
        Buttonsubtract.setBackground(new Color(239,188,2));
        Buttonsubtract.setFocusable(false);
        frame.add(Buttonsubtract);

        Buttonsquare.setBounds(80,170,60,40);
        Buttonsquare.setFont(new Font("Arial",Font.BOLD,20));
        Buttonsquare.setFocusable(false);
        frame.add(Buttonsquare);

        Buttondelete.setBounds(150,110,60,40);
        Buttondelete.setFont(new Font("Arial",Font.BOLD,20));
        Buttondelete.setBackground(Color.red);
        Buttondelete.setForeground(Color.white);
        Buttondelete.setFocusable(false);
        frame.add(Buttondelete);

        Buttonclear.setBounds(80,110,60,40);
        Buttonclear.setFont(new Font("Arial",Font.BOLD,20));
        Buttonclear.setBackground(Color.red);
        Buttonclear.setForeground(Color.white);
        Buttonclear.setFocusable(false);
        frame.add(Buttonclear);


    }

    public void addActionEvent(){
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        Buttonclear.addActionListener(this);
        Buttondelete.addActionListener(this);
        Buttondivide.addActionListener(this);
        Buttonsqrt.addActionListener(this);
        Buttonsquare.addActionListener(this);
        Buttonsubtract.addActionListener(this);
        Buttonseven.addActionListener(this);
        Buttoneight.addActionListener(this);
        Buttonnine.addActionListener(this);
        Buttonone.addActionListener(this);
        Buttontwo.addActionListener(this);
        Buttonthree.addActionListener(this);
        Buttonfour.addActionListener(this);
        Buttonfive.addActionListener(this);
        Buttonsix.addActionListener(this);
        Buttonmultiply.addActionListener(this);
        Buttonzero.addActionListener(this);
        Buttonequal.addActionListener(this);
        Buttondot.addActionListener(this);

    }


    public static void main(String args[]){
        CalculatorApp calc= new CalculatorApp();

    }

  //  @override
    public void actionPerformed(ActionEvent e){

        Object source= e.getSource();

        if(source==onRadioButton){
            enable();
        }
        else if(source==offRadioButton){

            disable();
        }
        else if(source==Buttonclear){
            label.setText("");
            textfield.setText("");
        }
        else if(source==Buttondelete){
            int l=textfield.getText().length();
            int number = l-1;
            if(l>0){
                StringBuilder back=new StringBuilder(textfield.getText());
                back.deleteCharAt(number);
                textfield.setText(back.toString());
            }
            if(textfield.getText().endsWith(""))
            label.setText("");
        }
        else if(source==Buttonzero){
            if(textfield.getText().equals("0"))
            return;
            else{
                textfield.setText(textfield.getText()+"0");
            }
        }
        else if(source==Buttonone){
            textfield.setText(textfield.getText()+"1");
        }
        else if(source==Buttontwo){
            textfield.setText(textfield.getText()+"2");
        }
        else if(source==Buttonthree){
            textfield.setText(textfield.getText()+"3");
        }
        else if(source==Buttonfour){
            textfield.setText(textfield.getText()+"4");
        }
        else if(source==Buttonfive){
            textfield.setText(textfield.getText()+"5");
        }
        else if(source==Buttonsix){
            textfield.setText(textfield.getText()+"6");
        }
        else if(source==Buttonseven){
            textfield.setText(textfield.getText()+"7");
        }
        else if(source==Buttoneight){
            textfield.setText(textfield.getText()+"8");
        }
        else if(source==Buttonnine){
            textfield.setText(textfield.getText()+"9");
        }
        else if(source==Buttondot){
            if(textfield.getText().contains("."))
            return;
            else{
                textfield.setText(textfield.getText() + ".");
            }
        }
        else if(source==Buttonadd){
            String str=textfield.getText();
            num1=Double.parseDouble(textfield.getText());
            calculation=1;
            textfield.setText("");
            label.setText(str +"+");
        }
        else if(source==Buttonsubtract){
            String str=textfield.getText();
            num1=Double.parseDouble(textfield.getText());
            calculation=2;
            textfield.setText("");
            label.setText(str +"-");
        }
        else if(source==Buttonmultiply){
            String str=textfield.getText();
            num1=Double.parseDouble(textfield.getText());
            calculation=3;
            textfield.setText("");
            label.setText(str +"*");
        }
        else if(source==Buttondivide){
            String str=textfield.getText();
            num1=Double.parseDouble(textfield.getText());
            calculation=4;
            textfield.setText("");
            label.setText(str +"/");
        }
        else if(source==Buttonsquare){
            num1=Double.parseDouble(textfield.getText());
            double sqr=Math.pow(num1,2);
            String str=Double.toString(sqr);
            if(str.endsWith(".0"))
            textfield.setText(str.replace(".0",""));
            else
            textfield.setText(str);
        }
        else if(source==Buttonsqrt){
            num1=Double.parseDouble(textfield.getText());
            double sqrt=Math.sqrt(num1);
            textfield.setText(Double.toString(sqrt));
        }
        else if(source==Buttonequal){
            num2=Double.parseDouble(textfield.getText());
            switch(calculation){
                case 1:
                result = num1+num2;
                break;

                case 2:
                result = num1-num2;
                break;

                case 3:
                result=num1*num2;
                break;

                case 4:
                result = num1/num2;
                break;

            }
            if(Double.toString(result).endsWith(".0")){
                textfield.setText(Double.toString(result).replace(".0",""));
            }
            else{
                textfield.setText(Double.toString(result));
            }
            label.setText("");
            num1=result;
        }
    }

    public void enable(){
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        label.setEnabled(true);
        Buttonclear.setEnabled(true);
        Buttondelete.setEnabled(true);
        Buttondivide.setEnabled(true);
        Buttonsquare.setEnabled(true);
        Buttonsubtract.setEnabled(true);
        Buttonseven.setEnabled(true);
        Buttoneight.setEnabled(true);
        Buttonnine.setEnabled(true);
        Buttonmultiply.setEnabled(true);
        Buttonfour.setEnabled(true);
        Buttonfive.setEnabled(true);
        Buttonsix.setEnabled(true);
        Buttonadd.setEnabled(true);
        Buttonone.setEnabled(true);
        Buttontwo.setEnabled(true);
        Buttonthree.setEnabled(true);
        Buttonequal.setEnabled(true);
        Buttonzero.setEnabled(true);
        Buttondot.setEnabled(true);

    }

    public void disable(){
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        label.setEnabled(false);
        label.setText("");
        textfield.setText("");
        Buttonclear.setEnabled(false);
        Buttondelete.setEnabled(false);
        Buttondivide.setEnabled(false);
        Buttonsquare.setEnabled(false);
        Buttonsubtract.setEnabled(false);
        Buttonseven.setEnabled(false);
        Buttoneight.setEnabled(false);
        Buttonnine.setEnabled(false);
        Buttonmultiply.setEnabled(false);
        Buttonfour.setEnabled(false);
        Buttonfive.setEnabled(false);
        Buttonsix.setEnabled(false);
        Buttonadd.setEnabled(false);
        Buttonone.setEnabled(false);
        Buttontwo.setEnabled(false);
        Buttonthree.setEnabled(false);
        Buttonequal.setEnabled(false);
        Buttonzero.setEnabled(false);
        Buttondot.setEnabled(false);       
    }
}