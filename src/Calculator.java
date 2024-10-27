import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 2024.10.17에 최초 생성(Kim Hyeongjun)
 * 2024.10.17에 최초 생성이지만 2024.10.27에 브랜치를 잘못 건드려서 2024.10.27에 새로 생성
 * 처음에 책에 있는 코드를 보면서 응용하여 만듬
 * 이후에 책 이외에 참고한다면 @see로 출처 표기하겠음
 */


public class Calculator extends JFrame implements ActionListener {

    JTextArea area; // 계산기 화면을 표시할 텍스트 영역
    // 계산기 버튼들을 선언
    JButton AC, C, per, devide, seven, eight, nine, multiply, four, five, six, minus,
            one, two, three, plus, plmi, zero, dot, equal;


    // 생성자
    Calculator() {
        setTitle("Calculator");

        setLayout(new BorderLayout(0, 0)); //BorderLayout을 0, 0으로 지정
        showNorth(); // 상단 패널 표시
        showCenter(); // 중앙 패널 표시

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 동작 설정
        setSize(230, 400); //프레임의 사이즈를 230, 400으로 조정
        setVisible(true); // 프레임을 화면에 표시
    }

    // 상단 패널 (계산기 화면) 구성
    void showNorth() {
        JPanel panel = new JPanel();


        area = new JTextArea(3, 23); // 3행 23열의 텍스트 영역 생성
        area.setEditable(false); // 텍스트 영역을 편집 불가능하게 설정
        area.setForeground(Color.BLACK); // 텍스트 색상을 검정색으로 설정

        panel.add(area);

        add(panel, BorderLayout.NORTH); // 패널을 프레임의 북쪽에 추가
    }

    // 중앙 패널 (계산기 버튼) 구성
    void showCenter() {

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.setLayout(new GridLayout(5, 4)); // 5행 4열의 그리드 레이아웃 설정

        // 버튼 생성 및 텍스트 설정
        AC = new JButton("AC");
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
        // 패널에 버튼 추가
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

        // 모든 버튼을 배열에 저장 @see ChatGPT
        JButton[] buttons = {AC, C, per, devide, seven, eight, nine, multiply, four, five, six, minus,
                one, two, three, plus, plmi, zero, dot, equal};

        // 각 버튼에 ActionListener 추가 및 패널에 버튼 추가 @see ChatGPT
        for (JButton button : buttons) {
            button.addActionListener(this);
            panel.add(button);
        }


        add(panel, BorderLayout.CENTER); // 패널을 프레임의 중앙에 추가
    }

    @Override
    // 클릭된 버튼의 텍스트 가져오기 @see ChatGPT
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
    }

    // 메인 메소드
    public static void main(String[] args) {
        new Calculator(); // Calculator 객체 생성
    }
}