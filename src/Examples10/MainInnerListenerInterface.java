package Examples10;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class MainInnerListenerInterface {
    public static void main(String []args){
        new JFrame("Diff button"){

            {
                getContentPane().setLayout(new FlowLayout());
                //without Inner class
                JButton b1=new JButton("Click1");
                class MyActionListener implements ActionListener{
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("!1");
                    }
                }
                b1.addActionListener(new MyActionListener());
                add(b1);

                //using Inner Class
                JButton b2=new JButton("Click2");
                b2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("!2");
                }
                });
                add(b2);

                //using small code more
                add(new JButton("Click3"){
                    {
                        addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                System.out.println("!3");
                            }
                        });
                    }
                });

                //using small code more using Lambda Expression
                add(new JButton("Click4"){
                    {
                        addActionListener(e-> System.out.println("!4"));
                    }
                });
                pack();
                setVisible(true);


            }
        };

    }
}
