import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SpaceInvaders extends JFrame implements Commons {

    private static final long serialVersionUID = -4905230094675077405L;

    private JButton start, help;

    /*
     * Intro Messages
     */
    private static final String TOP_MESSAGE = "Space Invaders <br> Java Version";
    private static final String INITIAL_MESSAGE = "Help us, Captain Awesome!!"
            + "<br>The aliens are trying to invade our planet."
            + "<br><br><br>Your mission:"
            + "<br><br>Destroy all the alien invaders before they manage to reach Earth."
            + "<br>And preferably, don’t die during the battle!"
            + "<br><br><br>GOOD LUCK!!!";

    /*
     * Help Messages
     */
    private static final String HELP_TOP_MESSAGE = "Help";
    private static final String HELP_MESSAGE = "Controls:"
            + "<br><br>Move Left: <br>Left Arrow key"
            + "<br><br>Move Right: <br>Right Arrow key"
            + "<br><br>Shoot: <br>Spacebar";

    JFrame frame = new JFrame("Space Invaders");
    JFrame frame2 = new JFrame("Space Invaders");
    JFrame frame3 = new JFrame("Help");

    /*
     * Constructor
     */
    public SpaceInvaders() {
        String topmessage = "<html><br><br>" + TOP_MESSAGE + "</html>";
        String message = "<html>" + INITIAL_MESSAGE + "</html>";

        start = new JButton("Start Mission");
        start.addActionListener(new ButtonListener());
        start.setBounds(800, 800, 200, 100);

        help = new JButton("Help");
        help.addActionListener(new HelpButton());

        JLabel text = new JLabel(message, SwingConstants.CENTER);
        JLabel toptext = new JLabel(topmessage, SwingConstants.CENTER);

        Font font = new Font("Helvetica", Font.BOLD, 12);
        text.setFont(font);

        Font font2 = new Font("Helvetica", Font.BOLD, 20);
        toptext.setFont(font2);

        frame2.setTitle("Space Invaders");
        frame2.add(text);
        frame2.add(toptext, BorderLayout.PAGE_START);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(help);
        bottomPanel.add(start);

        frame2.add(bottomPanel, BorderLayout.PAGE_END);
        frame2.setSize(500, 500);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
        frame2.setResizable(false);
    }

    public void closeIntro() {
        frame2.dispose();
        frame3.dispose();
    }

    public void closeHelp() {
        frame3.dispose();
    }

    /*
     * Main
     */
    public static void main(String[] args) {
        new SpaceInvaders();
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // NOTE: Use BOARD_HEIGTH (with the original typo) since that's what Commons defines
            frame.setSize(BOARD_WIDTH, BOARD_HEIGTH);
            frame.getContentPane().add(new Board());
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            closeIntro();
        }
    }

    private class CloseHelp implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            closeHelp();
        }
    }

    private class HelpButton implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton close = new JButton("Close");
            close.addActionListener(new CloseHelp());

            String topmessage = "<html><br>" + HELP_TOP_MESSAGE + "</html>";
            String message = "<html>" + HELP_MESSAGE + "</html>";
            JLabel text = new JLabel(message, SwingConstants.CENTER);
            JLabel toptext = new JLabel(topmessage, SwingConstants.CENTER);

            Font font = new Font("Helvetica", Font.BOLD, 12);
            text.setFont(font);

            Font font2 = new Font("Helvetica", Font.BOLD, 20);
            toptext.setFont(font2);

            frame3.add(text);
            frame3.add(toptext, BorderLayout.PAGE_START);
            frame3.add(close, BorderLayout.PAGE_END);

            // Don’t exit the whole app when closing the Help window
            frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame3.setSize(250, 290);
            frame3.setResizable(false);
            frame3.setLocationRelativeTo(null);
            frame3.setVisible(true);
        }
    }
}
