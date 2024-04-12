import java.awt.*; // 그래픽 처리를 위한 클래스들의 경로명
import java.awt.event.*; // AWT 이벤트 사용을 위한 경로명
import javax.swing.*; // 스윙 컴포넌트 클래스들의 경로명
import javax.swing.event.*;

public class Main extends  JFrame {
    public Main(){
        setTitle("영어 단어 퍼즐");
        setSize(1500, 1500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container main = getContentPane();
        main.setBackground(Color.LIGHT_GRAY);
        JLabel tt = new JLabel("English word puzzle game!");
        JButton start = new JButton("START");
        JButton gamerule = new JButton("TUTORIAL");
        JButton exit = new JButton("EXIT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setLayout(null);


        start.setLocation(500, 500);
        start.setSize(100, 100);
        gamerule.setLocation(650, 500);
        gamerule.setSize(100, 100);
        exit.setLocation(800, 500);
        exit.setSize(100, 100);
        tt.setLocation(100, 200);
        tt.setSize(1500, 100);

        Font font = new Font("바탕체", Font.BOLD, 100);
        tt.setFont(font);

        main.add(start);
        main.add(gamerule);
        main.add(exit);
        main.add(tt);


        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("START"))
                    b.setText("start");

            }
        });
        gamerule.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("TUTORIAL"))
                    b.setText("gamerule");

            }
        });
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("EXIT"))
                    System.exit(0);
            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        Main frame = new Main();
    }
}
