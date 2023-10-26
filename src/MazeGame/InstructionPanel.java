package src.MazeGame;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class InstructionPanel extends JPanel {
    JTextArea instructionInput;
    MazePanel mazePanel;
    InstructionPanelInput instructionPanelInput;
    public InstructionPanel(MazePanel mazePanel, Frame frame) {
        this.mazePanel = mazePanel;
        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(boxLayout);
        instructionInput = new JTextArea("");
        instructionInput.setMaximumSize(new Dimension(400,700));
        instructionInput.setMinimumSize(new Dimension(400,700));
        instructionInput.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 24));
        instructionInput.setForeground(Color.BLACK);
        instructionInput.setDisabledTextColor(Color.black);
        instructionInput.setEnabled(false);
        setBorder(new EmptyBorder(0,20,0,0));
        instructionInput.setBackground(Color.lightGray);
        instructionInput.isCursorSet();
        add(instructionInput);
        instructionPanelInput = new InstructionPanelInput(this);
        frame.addKeyListener(instructionPanelInput);
        setFocusable(true);
    }
}
