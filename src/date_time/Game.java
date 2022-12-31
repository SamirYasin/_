package date_time;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel {
    int x = 0;
    int y = 0;

    private void move() {
        x = x + 1;
        y = y + 1;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 30, 30);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Sample Game");
        Game game = new Game();
        frame.add(game);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            game.move();
            game.repaint();
            Thread.sleep(10);
        }
    }
}
