import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class WarGUI extends JFrame {

   private War war;
   
   private int turn;
   private String player1name, player2name, lastThing;
   
   private JLabel p1name, p2name, p1Card, p2Card, lastAction, tllabel, tclabel, trlabel, turnCount, p1cardcount, p2cardcount;
   private JPanel leftpanel, centerpanel, rightpanel, toppanel, bottompanel, midpanel, tlpanel, tcpanel, trpanel, mlpanel, mrpanel, mctpanel, mcbpanel;
   private JButton drawButton;
   
   
   public WarGUI(String p1, String p2){
      player1name = p1;
      player2name = p2;
      
      turn = 0;
      
      lastThing = "Welcome to War";
      
      war = new War();
      
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
      turnCount = new JLabel("Cards in Deck: ");
      turnCount.setFont(new Font("Courier New", Font.BOLD, 25));
      mlpanel.add(turnCount);
      
      mrpanel = new JPanel();
      turnCount = new JLabel("Cards in Deck: ");
      turnCount.setFont(new Font("Courier New", Font.BOLD, 25));
      mrpanel.add(turnCount);
      
      leftpanel.add(mlpanel, BorderLayout.SOUTH);
      rightpanel.add(mrpanel, BorderLayout.SOUTH);
      
      
      mctpanel = new JPanel();
      //mctpanel.setLayout(new BorderLayout());
      lastAction = new JLabel(lastThing);
      lastAction.setFont(new Font("Courier New", Font.BOLD, 35));
      mctpanel.add(lastAction);
      centerpanel.add(mctpanel);
      
      
      drawButton = new JButton ("DO WAR! (This Draws a Card)");
      drawButton.setFont(new Font("Courier New", Font.BOLD, 35));
   // drawButton.addActionListener(new DrawAction());    
      centerpanel.add(drawButton);
      
      
      mcbpanel = new JPanel();
      //mcbpanel.setLayout(new BorderLayout());
      turnCount = new JLabel("Turn Count: " + turn);
      turnCount.setFont(new Font("Courier New", Font.BOLD, 20));
      mcbpanel.add(turnCount);
      centerpanel.add(mcbpanel);
      
      
      midpanel.add(leftpanel);
      midpanel.add(centerpanel);
      midpanel.add(rightpanel);
      
      
      bottompanel.add(new JLabel("War - The Game by Shayan Alexander Amir-Kabirian"));
      
      
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

 //  private class DrawAction implements ActionListener {
      
 //  }


}

