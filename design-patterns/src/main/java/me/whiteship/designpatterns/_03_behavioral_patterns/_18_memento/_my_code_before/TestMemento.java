package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._my_code_before;

// Memento Design Pattern Tutorial

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestMemento extends JFrame{
    public static void main(String[] args) {
        new TestMemento();
    }

    private JButton saveBut, undoBut, redoBut;
    private JTextArea theArticle = new JTextArea(40,60);

    CareTaker CareTaker = new CareTaker();
    Originator originator = new Originator();
    int saveFiles = 0, currentArticle = 0;

    public TestMemento(){
        this.setSize(750,780);
        this.setTitle("Memento Design Pattern");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Article"));
        panel1.add(theArticle);

        ButtonListener saveListener = new ButtonListener();
        ButtonListener undoListener = new ButtonListener();
        ButtonListener redoListener = new ButtonListener();

        saveBut = new JButton("Save");
        saveBut.addActionListener(saveListener);

        undoBut = new JButton("Undo");
        undoBut.addActionListener(undoListener);

        redoBut = new JButton("Redo");
        redoBut.addActionListener(redoListener);

        panel1.add(saveBut);
        panel1.add(undoBut);
        panel1.add(redoBut);

        // Add panel to the frame that shows on screen

        this.add(panel1);

        this.setVisible(true);

    }

    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == saveBut){

                // Get text in JTextArea
                String textInTextArea = theArticle.getText();
                originator.set(textInTextArea);

                // Add new article to the ArrayList
                CareTaker.addMemento( originator.storeInMemento() );

                // saveFiles monitors how many articles are saved
                // currentArticle monitors the current article displayed

                saveFiles++;
                currentArticle++;

                System.out.println("Save Files " + saveFiles);

                // Make undo clickable

                undoBut.setEnabled(true);

            } else

            if(e.getSource() == undoBut){

                if(currentArticle >= 1){

                    // Decrement to the current article displayed

                    currentArticle--;

                    // Get the older article saved and display it in JTextArea

                    String textBoxString = originator.restoreFromMemento( CareTaker.getMemento(currentArticle) );

                    theArticle.setText(textBoxString);

                    // Make Redo clickable

                    redoBut.setEnabled(true);

                } else {

                    // Don't allow user to click Undo

                    undoBut.setEnabled(false);

                }

            } else

            if(e.getSource() == redoBut){

                if((saveFiles - 1) > currentArticle){

                    // Increment to the current article displayed

                    currentArticle++;

                    // Get the newer article saved and display it in JTextArea

                    String textBoxString = originator.restoreFromMemento( CareTaker.getMemento(currentArticle) );

                    theArticle.setText(textBoxString);

                    // Make undo clickable

                    undoBut.setEnabled(true);

                } else {

                    // Don't allow user to click Redo

                    redoBut.setEnabled(false);

                }

            }

        }

    }

}