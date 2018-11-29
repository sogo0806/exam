import javax.swing.*;
import java.awt.*;

public class FrameMain2 extends JFrame{
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int screenw = screenSize.width;
    private int screenh = screenSize.height;
    private int frw =300 , frh =500 ;
    private JButton jbt = new JButton("單人遊戲");
    private JButton jbt2 = new JButton("雙人遊戲");
    private JButton exit = new JButton("離開");
    private JLabel jname = new JLabel("簡易版爆爆王");
    private JLabel jph = new JLabel();
    private ImageIcon icon = new ImageIcon("225791ed1946924.jpg");
    private Container cp ;
    private JPanel jpnn = new JPanel();
    private JPanel jpnc = new JPanel(new GridLayout(3,1,3,3));
    public FrameMain2(){
        init();
    }
    public void init(){
        this.setBounds(screenw/2-frw/2,screenh/2-frh/2,frw,frh);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(jpnn,BorderLayout.NORTH);
        cp.add(jpnc,BorderLayout.CENTER);
        jpnn.add(jname);
        jpnn.add(jph);
        jph.setIcon(icon);

        jname.setFont(new Font(null,Font.BOLD,30));

        jpnc.add(jbt);
        jpnc.add(jbt2);
        jpnc.add(exit);


    }
}
