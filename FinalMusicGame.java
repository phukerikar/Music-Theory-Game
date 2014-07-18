/* File: FinalMusicGame.java
 * Created: 2012/12/18
 * Last Changed:2013/01/20
 * Author: Pallavi Hukerikar
 * ICS3U Final Summative
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.BoxLayout;



 public class FinalMusicGame {
   
  /* method creates swing components (frame, labels, and panels)
   * generates random numbers for passNum array, array passed to other methods
   * uses the generatedDefinitions[] and returnAnswers[] arrays to set definitions/answers
   * pre: none
   * post: output complete gui test
   */
   public static void main(String [] args) {

    //create frame, set title, set size, close on click, set visible
    JFrame frame = new JFrame();
    frame.setTitle("Musical Terminology Test");
    frame.setSize(500, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    final JPanel cardPanel = new JPanel(); // MAIN CARD PANEL 
    
    //implement card layout
    CardLayout cl = new CardLayout();
    cardPanel.setLayout(cl);
    
    
   
    //Random numbers to pass to other methods - will be used to select definitions and correct answers
    Random rand = new Random();
    int num1, num2, num3, num4, num5; 
    num1 = rand.nextInt(35);
    num2 = rand.nextInt(35);
    num3 = rand.nextInt(35);
    num4 = rand.nextInt(35);
    num5 = rand.nextInt(35);
    
    int [] passNum = {num1, num2, num3, num4, num5}; //put the numbers into array so you can pass them
    
    //Create labels to show definitions; one for each panel
    JLabel dLab1 = new JLabel("");
    JLabel dLab2 = new JLabel("");
    JLabel dLab3 = new JLabel("");
    JLabel dLab4 = new JLabel("");
    JLabel dLab5 = new JLabel("");
    
    //Create labels to show if answer was correct/incorrect; one for each panel
    final JLabel aLab1 = new JLabel();
    final JLabel aLab2 = new JLabel();
    final JLabel aLab3 = new JLabel();
    final JLabel aLab4 = new JLabel();
    final JLabel aLab5 = new JLabel();
    
    //Create 20 radio buttons; 4 for each panel; 5 panels
    JRadioButton b1 = new JRadioButton();
    JRadioButton b2 = new JRadioButton();
    JRadioButton b3 = new JRadioButton();
    JRadioButton b4 = new JRadioButton();
    
    JRadioButton b5 = new JRadioButton();
    JRadioButton b6 = new JRadioButton();
    JRadioButton b7 = new JRadioButton();
    JRadioButton b8 = new JRadioButton();
    
    JRadioButton b9 = new JRadioButton();
    JRadioButton b10 = new JRadioButton();
    JRadioButton b11= new JRadioButton();
    JRadioButton b12= new JRadioButton();
    
    JRadioButton b13 = new JRadioButton();
    JRadioButton b14 = new JRadioButton();
    JRadioButton b15 = new JRadioButton();
    JRadioButton b16 = new JRadioButton();
    
    JRadioButton b17 = new JRadioButton();
    JRadioButton b18 = new JRadioButton();
    JRadioButton b19 = new JRadioButton();
    JRadioButton b20 = new JRadioButton();
    
    
   //Add buttons to button groups so that only 1 can be clicked; four per group
    ButtonGroup group = new ButtonGroup();
    group.add(b1);
    group.add(b2);
    group.add(b3);
    group.add(b4);
    
    ButtonGroup group2 = new ButtonGroup();
    group2.add(b5);
    group2.add(b6);
    group2.add(b7);
    group2.add(b8);
    
    ButtonGroup group3 = new ButtonGroup();
    group3.add(b9);
    group3.add(b10);
    group3.add(b11);
    group3.add(b12);
    
    ButtonGroup group4 = new ButtonGroup();
    group4.add(b13);
    group4.add(b14);
    group4.add(b15);
    group4.add(b16);
    
    ButtonGroup group5 = new ButtonGroup();
    group5.add(b17);
    group5.add(b18);
    group5.add(b19);
    group5.add(b20);
    
    
    //Create radioButtonPanel1 ... radioButtonPanel2 which will hold the buttons
    //Set the layout as BoxLayout and center align them
    JPanel radioButtonPanel1 = new JPanel();
   radioButtonPanel1.setLayout(new BoxLayout(radioButtonPanel1, BoxLayout.PAGE_AXIS));
   radioButtonPanel1.setAlignmentX(Component.CENTER_ALIGNMENT);
   radioButtonPanel1.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 20));
   
   JPanel radioButtonPanel2 = new JPanel();
   radioButtonPanel2.setLayout(new BoxLayout(radioButtonPanel2, BoxLayout.PAGE_AXIS));
   radioButtonPanel2.setAlignmentX(Component.CENTER_ALIGNMENT);
   radioButtonPanel2.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 20));
   
   JPanel radioButtonPanel3 = new JPanel();
   radioButtonPanel3.setLayout(new BoxLayout(radioButtonPanel3, BoxLayout.PAGE_AXIS));
   radioButtonPanel3.setAlignmentX(Component.CENTER_ALIGNMENT);
   radioButtonPanel3.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 20));
   
   JPanel radioButtonPanel4 = new JPanel();
   radioButtonPanel4.setLayout(new BoxLayout(radioButtonPanel4, BoxLayout.PAGE_AXIS));
   radioButtonPanel4.setAlignmentX(Component.CENTER_ALIGNMENT);
   radioButtonPanel4.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 20));
   
   JPanel radioButtonPanel5 = new JPanel();
   radioButtonPanel5.setLayout(new BoxLayout(radioButtonPanel5, BoxLayout.PAGE_AXIS));
   radioButtonPanel5.setAlignmentX(Component.CENTER_ALIGNMENT);
   radioButtonPanel5.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 20));
    
   //Add 4 buttons to each button panel
   radioButtonPanel1.add(b1); 
   radioButtonPanel1.add(b2);
   radioButtonPanel1.add(b3);
   radioButtonPanel1.add(b4);
   
   radioButtonPanel2.add(b5);
   radioButtonPanel2.add(b6);
   radioButtonPanel2.add(b7);
   radioButtonPanel2.add(b8);
   
   radioButtonPanel3.add(b9);
   radioButtonPanel3.add(b10);
   radioButtonPanel3.add(b11);
   radioButtonPanel3.add(b12);
   
   radioButtonPanel4.add(b13);
   radioButtonPanel4.add(b14);
   radioButtonPanel4.add(b15);
   radioButtonPanel4.add(b16);
   
   radioButtonPanel5.add(b17);
   radioButtonPanel5.add(b18);
   radioButtonPanel5.add(b19);
   radioButtonPanel5.add(b20);
    
    //Create new question and quit buttons; make them invisible for now
    final JButton button = new JButton("New Question");
    button.setVisible(false);
    final JButton quitbutton = new JButton("Quit");
    quitbutton.setVisible(false);
        
   //create button panel holding new question and quit buttons; add buttons to panel
    JPanel buttonPanel = new JPanel();
     buttonPanel.add(button);
     buttonPanel.add(quitbutton);
   
    //Get returned definitions and answers from corresponding methods
    String[] generatedDefinitions = definitionGenerator(passNum);
    final String [] returnAnswers = answersGenerator(passNum);
    
    
    //PANEL 1
     
    JPanel p1 = new JPanel(); //create panel 1
    
    //format panel
    p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
    p1.setAlignmentX(Component.CENTER_ALIGNMENT);
    p1.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 20));
    
    //output definition through definition label
    dLab1.setText("Definition: " + generatedDefinitions[0]); //set definition
    p1.add(dLab1); //add definition label to panel
    
    //label each button with answers
    b1.setText(returnAnswers[0]);
    b2.setText(returnAnswers[1]);
    b3.setText(returnAnswers[2]);
    b4.setText(returnAnswers[3]); 
    p1.add(radioButtonPanel1); //add corresponding button panel to panel 1
    
    //add answer label to panel
    p1.add(aLab1);
    
    //add panel 1 to card panel
    cardPanel.add(p1, "1");
    
    //action listener to see if user answer was correct
  ActionListener ActionListener = new ActionListener() {
  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand() == returnAnswers[2]) { //if correct output correct and show new question/quit buttons
      aLab1.setText("Correct!");
      button.setVisible(true);
      quitbutton.setVisible(true);
      
    } else { //if incorrect output incorrect and correct answer as well as new question/quit buttons
      aLab1.setText("Incorrect! The correct answer is " + returnAnswers[2] + ".");
      button.setVisible(true);
      quitbutton.setVisible(true);   
    }
  }
  };
  
  
    
    //PANEL 2
  
    JPanel p2 = new JPanel(); //create panel 2
    
    //format panel
    p2.setLayout(new BoxLayout(p2, BoxLayout.PAGE_AXIS));
    p2.setAlignmentX(Component.CENTER_ALIGNMENT);
    p2.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 20));
    
    //output definition
    dLab2.setText("Definition: " + generatedDefinitions[1]); //set definition
    p2.add(dLab2); //add definition label to panel
    
    //label each button with answers
    b5.setText(returnAnswers[4]);
    b6.setText(returnAnswers[6]);
    b7.setText(returnAnswers[5]);
    b8.setText(returnAnswers[7]);  
    p2.add(radioButtonPanel2); //add corresponding button panel to panel 2
    
    //add answer label to panel
    p2.add(aLab2);
    
    //add panel 2 to card panel
    cardPanel.add(p2, "2");
    
    //action listener to see if user answer was correct
  ActionListener ActionListener2 = new ActionListener() {
  public void actionPerformed(ActionEvent e) {
    
    if (e.getActionCommand() == returnAnswers[6]) { //if correct output correct and show new question/quit buttons
      aLab2.setText("Correct!");
      button.setVisible(true);
      quitbutton.setVisible(true);
      
    } else { //if incorrect output incorrect and correct answer as well as new question/quit buttons
      aLab2.setText("Incorrect! The correct answer is " + returnAnswers[6] + ".");
      button.setVisible(true);
      quitbutton.setVisible(true);   
    }
  }
  };
    
  
  
    //PANEL 3
  
    JPanel p3 = new JPanel(); //create panel 3
    
    //format panel
    p3.setLayout(new BoxLayout(p3, BoxLayout.PAGE_AXIS));
    p3.setAlignmentX(Component.CENTER_ALIGNMENT);
    p3.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 20));
    
    //output definition
    dLab3.setText("Definition: " + generatedDefinitions[2]); //set definition
    p3.add(dLab3); //add definition label to panel
    
    //label each button with answers
    b9.setText(returnAnswers[10]);
    b10.setText(returnAnswers[9]);
    b11.setText(returnAnswers[8]);
    b12.setText(returnAnswers[11]); 
    p3.add(radioButtonPanel3); //add corresponding button panel to panel 3
    
    //add answer label to panel
    p3.add(aLab3); 
    
    //add panel 3 to card panel
    cardPanel.add(p3, "3");
    
    //action listener to see if user answer was correct
  ActionListener ActionListener3 = new ActionListener() {
  public void actionPerformed(ActionEvent e) {
    
    if (e.getActionCommand() == returnAnswers[10]) { //if correct output correct and show new question/quit buttons
      aLab3.setText("Correct!");
      button.setVisible(true);
      quitbutton.setVisible(true);
      
    } else { //if incorrect output incorrect and correct answer as well as new question/quit buttons
      aLab3.setText("Incorrect! The correct answer is " + returnAnswers[10] + ".");
      button.setVisible(true);
      quitbutton.setVisible(true);   
    }
  }
  };
  
  
  
    //PANEL 4
  
    JPanel p4 = new JPanel(); //create panel 4
    
    //format panel
    p4.setLayout(new BoxLayout(p4, BoxLayout.PAGE_AXIS));
    p4.setAlignmentX(Component.CENTER_ALIGNMENT);
    p4.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 20));
    
    //output definition
    dLab4.setText("Definition: " + generatedDefinitions[3]); //set definition
    p4.add(dLab4); //add definition label to panel
    
    //label each button with answers
    b13.setText(returnAnswers[12]);
    b14.setText(returnAnswers[13]);
    b15.setText(returnAnswers[14]);
    b16.setText(returnAnswers[15]); 
    p4.add(radioButtonPanel4); //add corresponding button panel to panel 4
    
    //add answer label to panel
    p4.add(aLab4);
    
    //add panel 4 to card panel
    cardPanel.add(p4, "4");
    
    //action listener to see if user answer was correct
  ActionListener ActionListener4 = new ActionListener() { 
  public void actionPerformed(ActionEvent e) {
    
    if (e.getActionCommand() == returnAnswers[14]) { //if correct output correct and show new question/quit buttons
      aLab4.setText("Correct!");
      button.setVisible(true);
      quitbutton.setVisible(true);
      
    } else { //if incorrect output incorrect and correct answer as well as new question/quit buttons
      aLab4.setText("Incorrect! The correct answer is " + returnAnswers[14] + ".");
      button.setVisible(true);
      quitbutton.setVisible(true);   
    }
  }
  };
  
  
  
    //PANEL 5
  
    JPanel p5 = new JPanel(); //create panel 5
    
    //format panel
    p5.setLayout(new BoxLayout(p5, BoxLayout.PAGE_AXIS));
    p5.setAlignmentX(Component.CENTER_ALIGNMENT);
    p5.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 20));
    
    //output definition
    dLab5.setText("Definition: " + generatedDefinitions[4]); //set definition
    p5.add(dLab5); //add definition label to panel
    
    //label each button with answers
    b17.setText(returnAnswers[16]);
    b18.setText(returnAnswers[17]);
    b19.setText(returnAnswers[19]);
    b20.setText(returnAnswers[18]); 
    p5.add(radioButtonPanel5); //add corresponding button panel to panel 5
    
    //add answer label to panel
    p5.add(aLab5);
    
    //add panel 5 to card panel
    cardPanel.add(p5, "5");            
       
    //action listener to see if user answer was correct
  ActionListener ActionListener5 = new ActionListener() {
  public void actionPerformed(ActionEvent e) {
    
    if (e.getActionCommand() == returnAnswers[18]) { //if correct output correct and show new question/quit buttons
      aLab5.setText("Correct!");
      button.setVisible(false);
      quitbutton.setVisible(true);
      
    } else { //if incorrect output incorrect and correct answer as well as new question/quit buttons
      aLab5.setText("Incorrect! The correct answer is " + returnAnswers[18] + ".");
      button.setVisible(false);
      quitbutton.setVisible(true);   
    }
  }
  };
  
    //add action listeners to buttons
   b1.addActionListener(ActionListener);
   b2.addActionListener(ActionListener);
   b3.addActionListener(ActionListener);
   b4.addActionListener(ActionListener);
   
   b5.addActionListener(ActionListener2);
   b6.addActionListener(ActionListener2);
   b7.addActionListener(ActionListener2);
   b8.addActionListener(ActionListener2);
   
   b9.addActionListener(ActionListener3);
   b10.addActionListener(ActionListener3);
   b11.addActionListener(ActionListener3);
   b12.addActionListener(ActionListener3);
   
   b13.addActionListener(ActionListener4); 
   b14.addActionListener(ActionListener4);
   b15.addActionListener(ActionListener4);
   b16.addActionListener(ActionListener4);
   
   b17.addActionListener(ActionListener5);
   b18.addActionListener(ActionListener5);
   b19.addActionListener(ActionListener5);
   b20.addActionListener(ActionListener5);     
      
   
                
      //ActionListener for New Question Button        
      ActionListener Click = new ActionListener() {
      public void actionPerformed(ActionEvent click) {
        if (click.getActionCommand() == "New Question") { 
      CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
      cardLayout.next(cardPanel); //show next panel in card panel
   
          
        } } };
      
      
      button.addActionListener(Click); //add actionlistener to New Question button
               
      
      //ActionListener for Quit Button
     ActionListener QuitClick = new ActionListener() {
       public void actionPerformed(ActionEvent quitclick) {
         if (quitclick.getActionCommand() == "Quit") {
           System.exit(0); //exit window
         }
       }
     };
         
  
     quitbutton.addActionListener(QuitClick); //add action listener to Quit button
      
      
      
     //add panels to frame 
    frame.getContentPane().add(cardPanel, BorderLayout.NORTH);
    frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
                

                
        }
   
   
   
  /* method uses random numbers passed from main method in passNum array
   * random numbers used to pick definitions from array
   * those definitions become part of the generatedDefinitions array
   * generatedDefinitions array returned to main
   * pre: passNum array
   * post: generatedDefinitions array (returned to main)
   */
  public static String[] definitionGenerator(int[] passNum) {
   
  //array of definitions
  final String [] definitions = new String[36]; //declare and initialize array with 36 elements

  definitions[0]="This note is held for a sixteenth of a beat.";
  definitions[1]="This note is held for an eighth of a beat";
  definitions[2]="This note is held for one full beat.";
  definitions[3]="This note is held for two beats.";
  definitions[4]="This note is held for four beats.";
  definitions[5]="This note is held for one and a half beats.";
  definitions[6]="This note is held for three beats.";
  definitions[7]="This indicates the note should be held for as long as the conductor says.";
  definitions[8]="This means pause for an eighth of a beat";
  definitions[9]="This means pause for one beat.";
  definitions[10]="This means pause for two beats.";
  definitions[11]="This means pause for four beats.";
  definitions[12]="Known as the G clef.";
  definitions[13]="Known as the F clef.";
  definitions[14]="Four beats in a bar and a quarter note gets a beat.";
  definitions[15]="Three beats in a bar and a quarter note gets a beat.";
  definitions[16]="Two beats in a bar and a quarter note gets a beat.";
  definitions[17]="Six beats in a bar and an eighth note gets a beat.";
  definitions[18]="Common time.";
  definitions[19]="Short and detached.";
  definitions[20]="Hold for full length; possibly slightly longer.";
  definitions[21]="Loudly and forcefully";
  definitions[22]="Smooth and connected.";
  definitions[23]="Tempo meaning quick and lively.";
  definitions[24]="Tempo referred to as 'a walking pace'";
  definitions[25]="Very fast tempo.";
  definitions[26]="Moderate tempo.";
  definitions[27]="Gradually slow down.";
  definitions[28]="Very softly/quietly.";
  definitions[29]="Softly/Quietly.";
  definitions[30]="Moderately loud.";
  definitions[31]="Loudly.";
  definitions[32]="Very loudly.";
  definitions[33]="Gradually become louder.";
  definitions[34]="Gradually become softer.";
  definitions[35]="Attack loudly, then immediately become soft.";

  
  //String array holding definitions
  //Using values in passNum array to select definitions from definitions array and putting them in an array
  String [] generatedDefinitions= {definitions[passNum[0]], definitions[passNum[1]], definitions[passNum[2]], 
    definitions[passNum[3]], definitions[passNum[4]]};
                                   
  //array of definitions returned to main
  return generatedDefinitions;
  
}
   
   
  
  /* method generates 15 random numbers
   * uses those random numbers and answers array to pick random answers
   * uses values in passNum array to select the 5 correct answers corresponding to their definitions
   * puts all the answers in an array called returnAnswers
   * returnAnswers returned to main
   * pre: passNum array
   * post: returnAnswers array (returned to main)
   */
  
public static String[] answersGenerator(int[] passNum) {
 Random rand = new Random();
 
  //array of answers
  final String [] answers = new String[36];

  answers[0]="Sixteenth Note";
  answers[1]="Eighth Note";
  answers[2]="Quarter Note";
  answers[3]="Half Note";
  answers[4]="Whole Note";
  answers[5]="Dotted Quarter";
  answers[6]="Dotted Half";
  answers[7]="Fermata";
  answers[8]="Eighth Rest";
  answers[9]="Quarter Rest";
  answers[10]="Half Rest";
  answers[11]="Whole Rest";
  answers[12]="Treble Clef";
  answers[13]="Bass Clef";
  answers[14]="4/4";
  answers[15]="3/4";
  answers[16]="2/4";
  answers[17]="6/8";
  answers[18]="C";
  answers[19]="Staccato";
  answers[20]="Tenuto";
  answers[21]="Marcato";
  answers[22]="Legato";
  answers[23]="Allegro";
  answers[24]="Andante";
  answers[25]="Presto";
  answers[26]="Moderato";
  answers[27]="Rit.";
  answers[28]="Pianissimo";
  answers[29]="Piano";
  answers[30]="Mezzo-Forte";
  answers[31]="Forte";
  answers[32]="Fortissimo";
  answers[33]="Crescendo";
  answers[34]="Decrescendo";
  answers[35]="Forte Piano";
  
  //random numbers generated to get 3 answers for each option; note fourth is correct answer
  int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
  
  //generate and assign random numbers between 1 and 35
  a1 = rand.nextInt(35) + 0;
  a2 = rand.nextInt(35) + 0;
  a3 = rand.nextInt(35) + 0;
  a4 = rand.nextInt(35) + 0;
  a5 = rand.nextInt(35) + 0;
  a6 = rand.nextInt(35) + 0;
  a7 = rand.nextInt(35) + 0;
  a8 = rand.nextInt(35) + 0;
  a9 = rand.nextInt(35) + 0;
  a10 = rand.nextInt(35) + 0;
  a11 = rand.nextInt(35) + 0;
  a12 = rand.nextInt(35) + 0;
  a13 = rand.nextInt(35) + 0;
  a14 = rand.nextInt(35) + 0;
  a15 = rand.nextInt(35) + 0;
  
  
  //String of answers; each will be assigned an answer using random numbers; 5 will be correct
  String answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10, answer11, answer12,
         answer13, answer14, answer15, answer16, answer17, answer18, answer19, answer20;
  
  answer1 = answers[a1]; //assign random answer
  answer2 = answers[a2]; //assign random answer
  answer3 = answers[passNum[0]]; //this is the correct answer; get answer using passNum value
  answer4 = answers[a3]; //assign random answer
  
  answer5 = answers[a4]; //assign random answer
  answer6 = answers[a5]; //assign random answer
  answer7 = answers[passNum[1]]; //this is the correct answer; get answer using passNum value
  answer8 = answers[a6]; //assign random answer
  
  answer9 = answers[a7]; //assign random answer
  answer10 = answers[a8]; //assign random answer
  answer11 = answers[passNum[2]]; //this is the correct answer; get answer using passNum value
  answer12 = answers[a9]; //assign random answer
  
  answer13 = answers[a10]; //assign random answer
  answer14 = answers[a11]; //assign random answer
  answer15 = answers[passNum[3]]; //this is the correct answer; get answer using passNum value
  answer16 = answers[a12]; //assign random answer
  
  answer17 = answers[a13]; //assign random answer
  answer18 = answers[a14]; //assign random answer
  answer19 = answers[passNum[4]]; //this is the correct answer; get answer using passNum value
  answer20 = answers[a15]; //assign random answer
  
  
  //create array called returnAnswers and add all the generated answers
  String [] returnAnswers = {answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10,
                            answer11, answer12, answer13, answer14, answer15, answer16, answer17, answer18, answer19, 
                             answer20};
 
  //*NOTE* CORRECT ANSWERS ARE: returnAnswers[2] / [6] / [10] / [14] / [18]
  
  //return the returnAnswers array to main
  return returnAnswers;
   
  
   
}
 }