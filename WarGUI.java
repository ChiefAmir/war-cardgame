import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class WarGUI extends JFrame {

   private War war;
   
   private int turn;
   private String player1name, player2name, lastThing;
   
   private CardIcon player1card, player2card;
   
   private JLabel p1name, p2name, p1Card, p2Card, lastAction, tllabel, tclabel, trlabel, turnCounter, p1cardcount, p2cardcount;
   private JPanel leftpanel, centerpanel, rightpanel, toppanel, bottompanel, midpanel, tlpanel, tcpanel, trpanel, mlpanel, mrpanel, mctpanel, mcbpanel;
   private JButton drawButton;
   
   
   public WarGUI(String p1, String p2){
      war = new War();
      
      
      player1name = p1;
      player2name = p2;
      
      player1card = new CardIcon(1,14);
      player2card = new CardIcon(1,14);
      
      turn = 0;
      
      lastThing = "Welcome to War";
      
      
      toppanel = new JPanel();
      midpanel = new JPanel();
      bottompanel = new JPanel();
      
      setLayout(new BorderLayout());
      setTitle("War - The Game");
      
      
      
      tllabel = new JLabel(player1name);
      tclabel = new JLabel("vs");
      trlabel = new JLabel(player2name);
      
      tllabel.setFont(new Font("Courier New", Font.BOLD, 20));
      tclabel.setFont(new Font("Courier New", Font.BOLD, 20));
      trlabel.setFont(new Font("Courier New", Font.BOLD, 20));
      
      tlpanel = new JPanel();
      tcpanel = new JPanel();
      trpanel = new JPanel();
      toppanel.setLayout(new GridLayout(1,3));
      tlpanel.add(tllabel);
      tcpanel.add(tclabel);
      trpanel.add(trlabel);
      
      
      
       
      toppanel.add(tlpanel);
      toppanel.add(tcpanel);
      toppanel.add(trpanel);
      
      
      midpanel.setLayout(new GridLayout(1,3));
      leftpanel = new JPanel();
      leftpanel.setLayout(new BorderLayout());
      leftpanel.setBackground(Color.WHITE);
      
      centerpanel = new JPanel();
      centerpanel.setLayout(new GridLayout(3,1));
      centerpanel.setBackground(Color.WHITE);
      
      rightpanel = new JPanel();
      rightpanel.setLayout(new BorderLayout());
      rightpanel.setBackground(Color.WHITE);
      
      
      p1Card = new JLabel(new ImageIcon("cards/back.png"));
      p2Card = new JLabel(new ImageIcon("cards/back.png"));
      
      leftpanel.add(p1Card, BorderLayout.CENTER);
      rightpanel.add(p2Card, BorderLayout.CENTER);
      
      mlpanel = new JPanel();
      p1cardcount = new JLabel("Cards in Deck: " + war.pile1Size());
      p1cardcount.setFont(new Font("Courier New", Font.BOLD, 25));
      mlpanel.add(p1cardcount);
      mlpanel.setBackground(Color.WHITE);
      
      mrpanel = new JPanel();
      p2cardcount = new JLabel("Cards in Deck: " + war.pile2Size());
      p2cardcount.setFont(new Font("Courier New", Font.BOLD, 25));
      mrpanel.add(p2cardcount);
      mrpanel.setBackground(Color.WHITE);
      
      
      
      leftpanel.add(mlpanel, BorderLayout.SOUTH);
      rightpanel.add(mrpanel, BorderLayout.SOUTH);
      
      
      mctpanel = new JPanel();
      //mctpanel.setLayout(new BorderLayout());
      lastAction = new JLabel(lastThing);
      lastAction.setFont(new Font("Courier New", Font.BOLD, 35));
      mctpanel.add(lastAction);
      mctpanel.setBackground(Color.WHITE);
      centerpanel.add(mctpanel);
      
      
      drawButton = new JButton ("DO WAR! (This Draws a Card)");
      drawButton.setFont(new Font("Courier New", Font.BOLD, 35));
      drawButton.addActionListener(new DrawAction());    
      centerpanel.add(drawButton);
      
      
      mcbpanel = new JPanel();
      //mcbpanel.setLayout(new BorderLayout());
      turnCounter = new JLabel("Turn Count: " + turn);
      turnCounter.setFont(new Font("Courier New", Font.BOLD, 20));
      mcbpanel.add(turnCounter);
      mcbpanel.setBackground(Color.WHITE);
      centerpanel.add(mcbpanel);
      
      midpanel.setBackground(Color.WHITE);
      
      midpanel.add(leftpanel);
      midpanel.add(centerpanel);
      midpanel.add(rightpanel);
      
      
      bottompanel.add(new JLabel("War - by Shayan Alexander Amir-Kabirian"));
      
      
      add(toppanel, BorderLayout.NORTH);
      add(midpanel, BorderLayout.CENTER);   
      add(bottompanel, BorderLayout.SOUTH);
   
      
   }
   
   
   public WarGUI(){
      this("Computer", "Human");
   }
   
   
   public static void main(String [] args){
      WarGUI gui = new WarGUI();
      gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      gui.pack();
      gui.setVisible(true);

   }

   private class DrawAction implements ActionListener {
   
      public void actionPerformed(ActionEvent event){
         war.draw();
         p1Card.setIcon(war.getCard1Icon());
         p2Card.setIcon(war.getCard2Icon());
         
         turn++;
         
         war.emptyBuffer();
         
         p1cardcount.setText("Cards in Deck: " + war.pile1Size());
         p2cardcount.setText("Cards in Deck: " + war.pile2Size());
         turnCounter.setText("Turn Count: " + turn);
      }
   }


}

