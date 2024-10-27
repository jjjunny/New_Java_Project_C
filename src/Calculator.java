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
    JButton[] numberButtons; // 숫자 버튼 배열
    JButton AC, C, per, devide, multiply, minus, plus, plmi, dot, equal; // 연산 및 기능 버튼들

    // 생성자
    Calculator() {
        setTitle("Calculator"); // 프레임 제목 설정

        setLayout(new BorderLayout(0,0)); // BorderLayout 설정
        showNorth(); // 상단 패널 (디스플레이) 표시
        showCenter(); // 중앙 패널 (버튼) 표시

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 동작 설정
        setSize(230,400); // 프레임 크기 설정
        setVisible(true); // 프레임을 화면에 표시
    }

    // 상단 패널 (디스플레이) 구성
    void showNorth() {
        JPanel panel = new JPanel();

        area = new JTextArea(3,20); // 3행 20열의 텍스트 영역 생성
        area.setEditable(false); // 텍스트 영역을 편집 불가능하게 설정
        area.setForeground(Color.BLACK); // 텍스트 색상을 검정색으로 설정

        panel.add(area);

        add(panel, BorderLayout.NORTH); // 패널을 프레임의 북쪽에 추가
    }

    // 중앙 패널 (버튼) 구성
    void showCenter() {
        JPanel panel = new JPanel(new GridLayout(5, 4)); // 5행 4열의 그리드 레이아웃 설정

        // 숫자 버튼 생성 및 리스너 추가 @see ChatGPT
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        // 연산 및 기능 버튼 생성
        AC = new JButton("AC");
        C = new JButton("C");
        per = new JButton("%");
        devide = new JButton("/");
        multiply = new JButton("*");
        minus = new JButton("-");
        plus = new JButton("+");
        plmi = new JButton("+/-");
        dot = new JButton(".");
        equal = new JButton("=");

        // 연산 및 기능 버튼에 리스너 추가 @see ChatGPT
        JButton[] operationButtons = {AC, C, per, devide, multiply, minus, plus, plmi, dot, equal};
        for (JButton button : operationButtons) {
            button.addActionListener(this);
        }

        // 버튼들을 패널에 추가
        panel.add(AC);
        panel.add(C);
        panel.add(per);
        panel.add(devide);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(multiply);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(minus);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(plus);
        panel.add(plmi);
        panel.add(numberButtons[0]);
        panel.add(dot);
        panel.add(equal);

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