import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Quincunx
 */
public class ChristmasTree {
    public static double scale = 1.2;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChristmasTree();
            }
        });
    }

    public ChristmasTree() {
        try {
            URL url = new URL("http://imgs.xkcd.com/comics/tree.png");
            BufferedImage img = ImageIO.read(url);

            JFrame frame = new JFrame();
            frame.setUndecorated(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

            BufferedImage result = 
                    new BufferedImage((int)(img.getWidth() * scale), 
                            (int) (img.getHeight() * scale), 
                            BufferedImage.TYPE_INT_RGB);
            Graphics2D g = (Graphics2D) result.getGraphics();
            g.drawRenderedImage(img, AffineTransform.getScaleInstance(scale, scale));

            JImage image = new JImage(result);
            image.setToolTipText("Not only is that terrible in general, but you "
                    + "just KNOW Billy's going to open the root present first, "
                    + "and then everyone will have to wait while the heap is "
                    + "rebuilt.");
            frame.add(image);
           
            frame.setVisible(true);
           frame.pack();
            

        } catch (IOException ex) {

        }
    }

    class JImage extends JPanel implements MouseListener {

        BufferedImage img;

        public JImage(){
            this(null);
        }
        public JImage(BufferedImage image){
            img = image;
            setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
            addMouseListener(this);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, WIDTH, WIDTH, this);
        }

        public void setImage(BufferedImage image) {
            img = image;
            repaint();
        }

        @Override
        public void mouseClicked(MouseEvent me) {
            System.exit(0);
        }

        @Override
        public void mousePressed(MouseEvent me) {

        }

        @Override
        public void mouseReleased(MouseEvent me) {

        }

        @Override
        public void mouseEntered(MouseEvent me) {

        }

        @Override
        public void mouseExited(MouseEvent me) {

        }
    }
}