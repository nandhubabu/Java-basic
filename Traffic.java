import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Traffic extends JPanel implements ActionListener{
 JRadioButton red,yellow,green;
 Color stop,wait,go;

 Traffic(){
  setBounds(0,0,400,400);
  red=new JRadioButton("red");
  red.setBounds(0,0,100,50);
  red.addActionListener(this);

  yellow=new JRadioButton("yellow");
  yellow.setBounds(0,50,100,50);
  yellow.addActionListener(this);

  green=new JRadioButton("green");
  green.setBounds(0,100,100,50);
  green.addActionListener(this);

  red.setSelected(true);
  stop=Color.red;
  wait=Color.yellow;
  go=Color.green;
  ButtonGroup g=new ButtonGroup();
  g.add(red);
  g.add(yellow);
  g.add(green);

  add(red);
  add(yellow);
  add(green);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource()==red)
  {
   stop=Color.red;
   wait=Color.black;
   go=Color.black;
  }
  if(e.getSource()==yellow)
  {
   stop=Color.black;
   wait=Color.yellow;
   go=Color.black;
  }
  if(e.getSource()==green)
  {
   stop=Color.black;
   wait=Color.black;
   go=Color.green;
  }
  repaint();
 }

 public void paintComponent(Graphics g){
  super.paintComponent(g);

  g.setColor(Color.yellow);
  g.drawRect(35,20,80,205);
  g.fillRect(35,20,80,205);

  g.setColor(Color.black);
  g.drawRect(40,30,70,195);
  g.fillRect(40,30,70,195);

  g.setColor(Color.black);
  g.drawOval(50,50,50,50);
  g.setColor(stop);
  g.fillOval(50,50,50,50);

  g.setColor(Color.black);
  g.drawOval(50,50,50,50);
  g.setColor(wait);
  g.fillOval(50,100,50,50);

  g.setColor(Color.black);
  g.drawOval(50,50,50,50);
  g.setColor(go);
  g.fillOval(50,150,50,50);
 }

 public static void main(String[] args){
  JFrame f=new JFrame("Traffic Light");
  f.setLayout(null);
  f.setVisible(true);
  f.setSize(400,400);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Traffic t=new Traffic();
  f.add(t);
 }
}