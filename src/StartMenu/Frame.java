package src.StartMenu;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * Frame a singleton and the main controller of the application.
 * It manages what panel is displayed.
 */
public class Frame extends JFrame {
    private static Frame singleton;
    StartPanel startPanel;
    ProgramListPanel programListPanel;

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                try {
                    new Frame();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        };
        SwingUtilities.invokeLater(r);
    }

    /**
     * Sets up the settings for the entire window.
     */
    private Frame() throws FileNotFoundException {
        singleton = this;
        setFocusable(true);
        setBackground(new Color(38, 38, 38));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1500, 800);
        setIconImage(new javax.swing.ImageIcon("CSEClubLogoNoTextBorder.png").getImage());
        setLocationRelativeTo(null);
        setTitle("CSE");
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        startPanel = new StartPanel(this);
        add(startPanel);
    }

    public static Frame getInstance() {
        return singleton;
    }

    public void showGameList() {
        endProgram(startPanel);
    }

    public void startProgram(JPanel programPanel) {
        remove(programListPanel);
        getContentPane().add(programPanel);
        setVisible(true);
        programPanel.requestFocusInWindow();
        paintAll(getGraphics());
    }

    public void endProgram(JPanel programPanel) {
        remove(programPanel);
        programListPanel = new ProgramListPanel(this);
        startProgram(programListPanel);
    }

}
