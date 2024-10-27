import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
/**
 * 2024.10.17에 최초 생성(Kim Hyeongjun)
 * 2024.10.17에 최초 생성이지만 2024.10.27에 브랜치를 잘못 건드려서 2024.10.27에 새로 생성
 * 처음에 책에 있는 코드를 보면서 응용하여 만듬
 * 이후에 책 이외에 참고한다면 @see로 출처 표기하겠음
 */

public class Calculator extends JFrame {

    JTextArea area;
    JButton AC, C, per, devide, seven, eight, nine, multiply, four, five, six, minus, one, two, three, plus, plmi, zero, dot, equal;

    Calculator() {
        setTitle("Calculator");

        setLayout(new BorderLayout(0,0)); //BorderLayout을 10,10으로 지정
        showNorth();
        showCenter();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(230,400); //프레임의 사이즈를 230, 400으로 조정
        setVisible(true);
    }

    void showNorth() {
        JPanel panel = new JPanel();


        area = new JTextArea(3,21); //TextArea를 3열 23행으로 지정
        area.setEditable(false);
        area.setForeground(Color.BLACK); //TextArea의 글자색을 검정색으로 변경

        panel.add(area);

        add(panel, BorderLayout.NORTH);
    }

    void showCenter() {

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.setLayout(new GridLayout(5, 4)); //GridLayout을 5열 4행으로 지정

        AC = new JButton("AC");     //버튼들의 글자를 지정
        C = new JButton("C");
        per = new JButton("%");
        devide = new JButton("/");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        multiply = new JButton("*");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        minus = new JButton("-");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        plus = new JButton("+");
        plmi = new JButton("+/-");
        zero = new JButton("0");
        dot = new JButton(".");
        equal = new JButton("=");
        panel.add(AC);
        panel.add(C);
        panel.add(per);
        panel.add(devide);
        panel.add(seven);
        panel.add(eight);
        panel.add(nine);
        panel.add(multiply);
        panel.add(four);
        panel.add(five);
        panel.add(six);
        panel.add(minus);
        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(plus);
        panel.add(plmi);
        panel.add(zero);
        panel.add(dot);
        panel.add(equal);

        add(panel, BorderLayout.CENTER);

    }


    public static void main(String[] args) {
        new Calculator();
    }
}