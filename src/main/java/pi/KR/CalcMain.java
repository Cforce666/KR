/* 
 * �������� ������� � �����������.
 * 
 *                                                ��������� ������
 * ��������� ������ � Java ����� �������� � ���� ���� ������������� �����, ���� ����������� �������������,
 * ���� ������������� ������������� ��� ������� ������, ������ � ������������ ������ (��� ������� ������ �������).
 * 
 *                                                ��������� ������
 * ��� ��� ������ � ���������. � ��������� ������ �� ������ ������������ ��������, ��������� �� ����������, � ����� ������������
 * (�������� ����� public, protected, private, abstract, static, final, synchronized, native, strictfp � ������������� ���������).
 * 
 *                                                ������� ������ ()
 * � ��������� ������������ ��� ������, �������� ������ ����������� ������������ ��� ������ ��������������, �.�. ������ ������������
 * � ��������� � ������ ������������ ��� ������ (��������������� ����� �����) ��� ��� �� ���������� (������������� ��� �������),
 * ��� � ��� ��������� � ���. ��������, ��������� ������ ���������������� ������ ������� ������:
 * 
 * public void method(int a) {}
 * 
 * ��� method � ��� ����������������� ������, public � void � ������������ ������, {} � ���� ������, (int a) � �����������,
 * ���������� ������������� ���������� ���� int � �������� ��������� (���������) ������.
 * 
 *                                                �������� ������ {}
 * ����������� ����� �������, ��� ������� �������� ������� ��������� (������ � �����) ������ ���� ���������� ��������� ��������.
 * ������� �������, ��� �������, ������������ ���������� class � ��� ������� �������� ����� �������� ������������� �����,
 * ���� ����������� � ������������� �������������, ������������ � ������. ������� (������ � �����) �������������, �������
 * � ������ ������������� ��� �� ������� ���� ���������� ��������� ��������. ����� ����, ��������� �������� ����� ���� ����������
 * ���� ��� ��������� ���������� � ��������� ����������� ����.
 * ����������� ��� � ���� ��������� ����� ��������� ������ � ���� ������ (������������, ��� ������� ������ ������)
 * ��� ����� ����������� (������������� ��� �������) ������������� � ������� �� ���������� �� ����� ����� ������
 * (� ������ ����� ����������� (�������������) ������������� - � ������ �������� ������).
 * 
 *                                                   �����/dot .
 * �����������, � �������������� �������� ������������ ��� ��������� ��������� �� ������ �� ������,
 * � �������� ���������� import � package � ��� ������� � ���������� ������/�������/������,
 * � ��������� ������� � ������� � ��� ������� � ����������/������� � �.�.
 * 
 *                                                ����� � ������� ;
 * ��������� ; (����� � �������) ������������ ��� ����������� ����� ���������.
 * ���������� ������������ ������� ����� � ������� � ���� ��� ����� ����������/���������. */




/* �������� package �������� �����������, � ����� ������ ������ ������������ ������������ � ������ ����� (CalcMain.java) ������.
 * ������ ������ ����� ���������� ����������� ����, � ������� �������� ����� �������.
 * ���� �������� package �� ������, ������ �������� � ���������� ������������ ����, ������������ �� ���������.
 * ���� ����������� �����, ������������� ������������� ������, �������� � package pi.KR;, �� � �������� ��� ����� ������
 * ������ ��������� � �������� /pi.KR */
package pi.KR;

/* �������� import ��������� ���������� � �������, ������������ � ������, ������� ������ ����� ����������� import � ;
 * �� ������ ������ ��� �������� ������������� � �� �������� ������������ � ����������� ����� ������ ��� ��������
 * ����������� Java-���������.
 * �.�. ��� ����������� ������ �������� � �����-���� ����������� ������ �, ��������� ������ ������� ������ ������ ���� ���������
 * ���������� ������ ��� ������� �� �������, ������������� ������ ��� ��������� � ������ (��� ������������� ��������� import),
 * � ������� ��������� �����, �������, ����� ������������ ����� ������� ������, � ������� ������ ����� �������� ��������� � ������,
 * � ����� � � ������, ��������:
 * 
 * javax.swing.JTextField firstTextField = new javax.swing.JTextField("������ ��������� ����");
 * javax.swing.JTextField secondTextField = new javax.swing.JTextField("������ ��������� ����");
 * javax.swing.JTextField thirdTextField = new javax.swing.JTextField("������ ��������� ����");
 * 
 * � ������ ������������� ��������� ������� �������� ���� ����������������� �������� ������ JTextField ����� ����� ��������� ���:
 * 
 * import javax.swing.JTextField;
 * JTextField firstTextField = new JTextField("������ ��������� ����");
 * JTextField secondTextField = new JTextField("������ ��������� ����");
 * JTextField thirdTextField = new JTextField("������ ��������� ����"); */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/* ����� CalcMain �������� ������� �������, ������������ � ������ ����� (CalcMain.java).
 * �� ����������� �� ������ JFrame, ������� ��� ������������� ����������� ������ JFrame �����,
 * ������������� � ���������� ������� ������ JFrame �� ���������. */
class CalcMain extends JFrame {
	
	/* private static final long serialVersionUID = 1L; � ����������� ������������ ��� �������� ������ ��������������� ������.
	 * 
	 * ������������ � ������� �������������� ������� � ����� ������ ��� ���������� ��� �������� � ������, ���� ������ ��� ����.
	 * ��� �������� ������������� ��� ����, ����� ��������� ��������� ������� ��� ������������ ����������� ��� �������������.
	 * �������� ������� ���������� ���������������.
	 * 
	 * ����� ���������� ������������ ��������� � ������ ������������� ������� ����� ������, ���������� serialVersionUID,
	 * ������� ������������ �� ����� �������������� ��� �������� ����, ��� ����������� � ���������� ���������������� �������
	 * ��������� ������ ��� ����� �������, ������� ���������� � ��������� ������������.
	 * ���� ���������� �������� ����� ��� �������, ������� ����� serialVersionUID �������� �� ������ ���������������� ������
	 * �����������, �� �������������� �������� � InvalidClassException.
	 * ������������� ����� ����� �������� ���� ����������� serialVersionUID ����� ����, ������� ���� � ������ serialVersionUID
	 * ������� ������ ���� �����������, �������� � ���� long.
	 * ���� ������������� ����� ���� �� ��������� serialVersionUID, ����� ����� ���������� ������������ �������� ��������
	 * serialVersionUID �� ��������� ��� ����� ������ �� ������ ��������� �������� ������, ��� ������� �
	 * ������������ ������������ �������� Java (TM).
	 * ������ ������������ �������������, ����� ��� ������������� ������ ���� ��������� �������� serialVersionUID,
	 * ��� ��� ���������� serialVersionUID �� ��������� ����� ������������� � ������� ������, ������� ����� �����������
	 * � ����������� �� ���������� �����������, �, �������������, ����� �������� � ����������� InvalidClassExceptions
	 * �� ����� ��������������.
	 * �������, ����� ������������� ������������� �������� serialVersionUID � ��������� ����������� Java-�����������,
	 * ������������� ����� ������ �������� ����� �������� serialVersionUID.
	 * ����� ������������ �������������, ����� ����� ���������� serialVersionUID ������������ ����������� private,
	 * ��� ��� ��������, ��������� ����� ���������� ����������� ������ � ���������� ����������� ����� ������.
	 * serialVersionUID �� ������������ � �������� �������������� ������. */
	private static final long serialVersionUID = 1L;
	
    /* ��������� ��� ������������ ��������:
     * x - ������ �� ������ �� ������ ���� ��� ������� ������
     * y - ������ �� ������ �� �������� ���� ��� ������� ������
     * xo - ������ ������� ��� ������� ������
     * xo - ������ ������� ��� ������� ������
     * xI - ������ �� ������ �� ������ ���� ��� ������� �����������
     * yI - ������ �� ������ �� �������� ���� ��� ������� �����������
     * xoI - ������ ������� ��� ������� �����������
     * xoI - ������ ������� ��� ������� �����������
     * ������ ����������:
     * S1c - ������� ������ ������ (�����������, ���� � ���������� ������������ ������ 1 ������) (������������� ��)
     * S2c - ������� ���������� ���� double (������� ��, �������� ��)
     * wfRec - ������� ������� ���� (������������� ��)
     * wfRound - ������� ������� ���� (������� ��)
     * wfOval - ������� ������� ���� (�������� ��)
     * selectedType - ����������� ��� ����������� ���������� ���� �� � ������� � ��������� ������
     * (0 - ������������� ��, 1 - ������� ��, 2 - �������� ��) */
    final int x = 229; final int y = 15; final int xo = 99; final int yo = 29;
    final int xI = 87; final int yI = 205; final int xoI = 100; final int yoI = 29;
    int S1c; double S2c; int wfRec; double wfRound; double wfOval; int selectedType = 0;
    
    /* ������������� ���� ��������.
     * 
     * ������� ������� ���� �������� ��������� �������:
     * ��������� ����: labelType, labelHeight, labelWeight, labelRadius, labelMaterial,
     * labelSealing, labelAnswer1, labelAnswer2 labelAnswer3, labelAnswer4;
     * ���� �����: fieldHeight, fieldWeight, fieldRadius;
     * ���������� ������: comboBox1, comboBox2, comboBox3
     * ������: buttonType, buttonCalculate;
     * 
     * ������ ������� ���� �������� ��������� �������:
     * ��������� ����: imageLabelHeight, imageLabelHeightError, imageLabelWeight, imageLabelWeightError,
     * imageLabelRadius, imageLabelRadiusError, imageLabelGlass1, imageLabelGlassError1 imageLabelGlass2,
     * imageLabelGlassError2, imageLabelSealing, imageLabelSealingError, imageLabelWfRec, imageLabelWfErrorRec,
     * imageLabelWfRound, imageLabelWfErrorRound, imageLabelWfOval, imageLabelWfErrorOval;
     * 
     * ������ ���������:
     * error - ������ �� ������ "Error", ����������� ��� �������� ����� �� ������ Error � ����� ����� �������;
     * tooLongError - ����������� ��� �������� �� ������������ � �������� � ������ calculation();
     * newFieldHeight - ������ �� ��������� ������, ���������� ����� �������� � ����������;
     * newFieldWeight - ������ �� ��������� ������, ���������� ����� �������� � ����������;
     * newFieldRadius - ������ �� ��������� �������, ���������� ����� �������� � ����������;
     * newFieldGlass1 - ������ �� ��������� ������� ������� ������, ���������� ����� �������� � ����������;
     * newFieldGlass2 - ������ �� ��������� ������� ������� ������, ���������� ����� �������� � ����������;
     * newFieldSealing - ������ �� ��������� ������� ����������, ���������� ����� �������� � ����������;
     * newFieldWfRec - ������ �� ��������� ������� ������� ����, ���������� ����� �������� � ���������� (������������� ��);
     * newFieldWfRound - ������ �� ��������� ������� ������� ����, ���������� ����� �������� � ���������� (������� ��);
     * newFieldWfOval - ������ �� ��������� ������� ������� ����, ���������� ����� �������� � ���������� (�������� ��); */
    JLabel labelType = new JLabel("�������� ������� �����������");
    JLabel labelHeight = new JLabel("������ (��)");
    JLabel labelWeight = new JLabel("������ (��)");
    JLabel labelRadius = new JLabel("������ (��)");
    JLabel labelMaterial = new JLabel("��������");
    JLabel labelSealing = new JLabel("����������");
    JLabel labelAnswer1 = new JLabel("");
    JLabel labelAnswer2 = new JLabel("");
    JLabel labelAnswer3 = new JLabel("");
    JLabel labelAnswer4 = new JLabel("");
    String error = "Error"; boolean tooLongError;
    JLabel imageLabelHeight = new JLabel(); JLabel imageLabelHeightError = new JLabel(error); String newFieldHeight;
    JLabel imageLabelWeight = new JLabel(); JLabel imageLabelWeightError = new JLabel(error); String newFieldWeight;
    JLabel imageLabelRadius = new JLabel(); JLabel imageLabelRadiusError = new JLabel(error); String newFieldRadius;
    JLabel imageLabelGlass1 = new JLabel(); JLabel imageLabelGlassError1 = new JLabel(error); String newFieldGlass1;
    JLabel imageLabelGlass2 = new JLabel(); JLabel imageLabelGlassError2 = new JLabel(error); String newFieldGlass2;
    JLabel imageLabelSealing = new JLabel(); JLabel imageLabelSealingError = new JLabel(error); String newFieldSealing;
    JLabel imageLabelWfRec = new JLabel(); JLabel imageLabelWfErrorRec = new JLabel(error); String newFieldWfRec;
    JLabel imageLabelWfRound = new JLabel(); JLabel imageLabelWfErrorRound = new JLabel(error); String newFieldWfRound;
    JLabel imageLabelWfOval = new JLabel(); JLabel imageLabelWfErrorOval = new JLabel(error); String newFieldWfOval;
    JTextField fieldHeight = new JTextField(10);
    JTextField fieldWeight = new JTextField(10);
    JTextField fieldRadius = new JTextField(10);
    JButton buttonCalculate = new JButton("����������");
    JButton buttonType = new JButton("�������");
    String[] comboTypes = {"�������������", "�������", "��������", "�������", "�����������"};
    String[] comboMaterial = {"������", "��������", "���"};
    String[] comboSealing = {"���������"};
    JComboBox<String> comboBox1 = new JComboBox<String>(comboTypes);
    JComboBox<String> comboBox2 = new JComboBox<String>(comboMaterial);
    JComboBox<String> comboBox3 = new JComboBox<String>(comboSealing);
    DecimalFormat format = new DecimalFormat("##.00");
	
	/* �����������. ����� super() ������������� ��������� �������� ����. */
	public CalcMain() {
		super("������ ������� �����������");
		createGUI();
    }
	
	/* ����� ������� ���� � ����������� �� ��� ����������� ������� */
	public void createGUI() {
		/* ����� setDefaultCloseOperation() ������������� �������, ��� ������� ���� ����� �������.
		 * �������� EXIT_ON_CLOSE ��������� �� ��, ��� ���� ����� ������� ��� ������� ������ '�������' (Close Box) */
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		/* ����� setSize() ������������� ������ ����, �������� ��������� ������ � ������ � ��������. */
        setSize(663,700);
        /* ������� ��������� ������� ���� � � ������ ������ */
        setLocationRelativeTo(null);
        /* ��������� ��������� ���� */
        setVisible(true);
        /* ���������� ��������� �������� ���� */
        setResizable(false);
        /* ��������� ��������� ���������� */
        setLayout(new BorderLayout());
        /* ���������� ����������� */
        setContentPane(new JLabel(new ImageIcon("src\\main\\java\\pi\\KR\\RectWin.png")));
        
        /* ��������� �������� � �������� ��� ����:
         * ����� setBounds() ������������� ���������� �������, add() - ��������� ������ � ����,
         * setActionCommand() - ������������� ������� ��� ������������� ������ */
        labelType.setBounds(x-199, y, xo+99, yo+1);
        comboBox1.setBounds(x-199, y+33, xo+99, yo);
        buttonType.setBounds(x-199, y+63, xo+99, yo+1);
        buttonType.setActionCommand("�������");
        labelHeight.setBounds(x+13, y, xo+1, yo+1);
        labelWeight.setBounds(x+113, y, xo+1, yo+1);
        fieldHeight.setBounds(x, y+33, xo+1, yo+1);
        fieldWeight.setBounds(x+100, y+33, xo+1, yo+1);
        labelRadius.setBounds(x+67, y, xo+1, yo+1);
        fieldRadius.setBounds(x, y+33, xo+101, yo+1);
        labelMaterial.setBounds(x+220, y, xo+1, yo+1);
        labelSealing.setBounds(x+313, y, xo+1, yo+1);
        comboBox2.setBounds(x+200, y+33, xo, yo);
        comboBox3.setBounds(x+300, y+33, xo, yo);
        buttonCalculate.setBounds(x, y+63, xo+300, yo+1);
        buttonCalculate.setActionCommand("����������");
        labelAnswer1.setBounds(x-199, y+93, xo+301, yo+1);
        labelAnswer2.setBounds(x-160, y+113, xo+301, yo+1);
        labelAnswer3.setBounds(x-160, y+133, xo+301, yo+1);
        labelAnswer4.setBounds(x-160, y+153, xo+301, yo+1);
        
        add(labelType);
        add(labelHeight);
        add(labelWeight);
        add(labelMaterial);
        add(labelSealing);
        add(labelAnswer1);
        add(labelAnswer2);
        add(labelAnswer3);
        add(labelAnswer4);
        add(fieldHeight);
        add(fieldWeight);
        add(comboBox1);
        add(comboBox2);
        add(comboBox3);
        add(buttonType);
        add(buttonCalculate);
        
        /* ���������� ������� ������ ActionListener � ��������� ��������� �� ������ ����� ���� ������ */
        ActionListener actionListener = new Actions();
        buttonCalculate.addActionListener(actionListener);
        buttonType.addActionListener(actionListener);
	}
	
    /* ����� ������� ������� ����������� */
	public int calculation(int h, int w) {
		S1c = -1; wfRec = -1; int forTest = 0;
		labelAnswer2.setText(""); labelAnswer3.setText(""); labelAnswer4.setText("");
		if (tooLongError == true) labelAnswer1.setText("(�������� ������ ��� ���� ����� ������� �������)");
		else if ((h == 0) || (w == 0)) labelAnswer1.setText("(���� ��� ��� ���� ��������� �����������)");
		else {
			/* S - ������� �� ��� ����������, So - ����� ������� ��, Sr - ������� ������� ����
			 * Su - ������� ����������, Soc - ������� ���������� S1c - ������� 1 ������ � ��������������� ��
			 * h - ������, w - ������, r - ������ ������� ����, u - ������ �������� ���������� �� */
			int S; int So; int Sr; int Su; int Soc; int u = 1; int r = comboBox2Check();
			S = h*w;
			So = (h+u)*(w+u);
			Sr = h*3*r+(w-3*r)*2;
			if (Sr > 0) wfRec = Sr;
			Su = So-S;
			Soc = So-Su-Sr;
			if (Soc > 0) S1c = Soc/2;
			forTest = So;
			if (So < 0) labelAnswer1.setText("�����: "+error+" (����� ������� ������� �����������)");
			else labelAnswer1.setText("�����: "+So+" �� (����� ������� ������� �����������)");
			if (Sr < 0) labelAnswer2.setText(error+" (������� ������� ����)");
			else labelAnswer2.setText(Sr+" �� (������� ������� ����)");
			if (Su < 0) labelAnswer3.setText(error+" (������� ����������)");
			else labelAnswer3.setText(Su+" �� (������� ����������)");
			if (Soc < 0) labelAnswer4.setText(error+" (������� ����������)");
			else labelAnswer4.setText(Soc+" �� (������� ����������)");
		}
		return forTest;
	}
	
	public void calculation(int rad) {
		S2c = -1; wfRound = -1;
		labelAnswer2.setText(""); labelAnswer3.setText(""); labelAnswer4.setText("");
		if (tooLongError == true) labelAnswer1.setText("(�������� � ���� '������' ������� �������)");
		else if ((rad == 0)) labelAnswer1.setText("(���� '������' ��������� �����������)");
		else {
			double newrad = rad; double S; double So; double Sr; double Su; double Soc; double u = 1; int r = comboBox2Check();
			S = Math.PI*Math.pow(newrad, 2);
			So = Math.PI*Math.pow(newrad+u, 2);
			Sr = S-Math.PI*Math.pow((newrad-r), 2);
			if (Sr > 0) wfRound = Sr;
			Su = So-S;
			Soc = So-Su-Sr;
			if (Soc > 0) S2c = Soc;
			if (So < 0) labelAnswer1.setText("�����: "+error+" (����� ������� ������� �����������)");
			else labelAnswer1.setText("�����: "+format.format(So)+" �� (����� ������� ������� �����������)");
			if (Sr < 0) labelAnswer2.setText(error+" (������� ������� ����)");
			else labelAnswer2.setText(format.format(Sr)+" �� (������� ������� ����)");
			if (Su < 0) labelAnswer3.setText(error+" (������� ����������)");
			else labelAnswer3.setText(format.format(Su)+" �� (������� ����������)");
			if (Soc < 0) labelAnswer4.setText(error+" (������� ����������)");
			else labelAnswer4.setText(format.format(Soc)+" �� (������� ����������)");
		}
	}
	
	public void calculation(int h, int w, int oval) {
		S2c = -1; wfOval = -1;
		labelAnswer2.setText(""); labelAnswer3.setText(""); labelAnswer4.setText("");
		if (tooLongError == true) labelAnswer1.setText("(�������� ������ ��� ���� ����� ������� �������)");
		else if ((h == 0) || (w == 0)) labelAnswer1.setText("(���� ��� ��� ���� ��������� �����������)");
		else {
			double S; double So; double Sr; double Su; double Soc; double u = 1; int r = comboBox2Check();
			S = Math.PI*h*w;
			So = Math.PI*(h+u)*(w+u);
			Soc = Math.PI*(h-r)*(w-r);
			if (Soc > 0) S2c = Soc;
			Su = So-S;
			Sr = S-Soc;
			if (Sr > 0) wfOval = Sr;
			if (So < 0) labelAnswer1.setText("�����: "+error+" (����� ������� ������� �����������)");
			else labelAnswer1.setText("�����: "+format.format(So)+" �� (����� ������� ������� �����������)");
			if (Sr < 0) labelAnswer2.setText(error+" (������� ������� ����)");
			else labelAnswer2.setText(format.format(Sr)+" �� (������� ������� ����)");
			if (Su < 0) labelAnswer3.setText(error+" (������� ����������)");
			else labelAnswer3.setText(format.format(Su)+" �� (������� ����������)");
			if (Soc < 0) labelAnswer4.setText(error+" (������� ����������)");
			else labelAnswer4.setText(format.format(Soc)+" �� (������� ����������)");
		}
	}
	
	/* ����� �������� ���� �� ���� ����� � ������������. */
	public int fieldCheck(String word) {
		int zero = 0;
		/* ������� ��������� ����� ��������� ����� �����, ���� ��� ����� ����, ����� ���������� ����. */
		if (word.length() == 0) return zero;
		else {
			/* ��������� ��������� ����� ����� �� ��������� ������� ��� ������������ ��������. */
			char[] aword = word.toCharArray();
			String notZero = "0";
			/* � ����� ����������� ������� ������������ ������� �����, ��� ���������� ��������� ������ � ����� ������. */
			for (int i = 0; i < aword.length; i++) {
				if ((aword[i] == '0') || (aword[i] == '1') || (aword[i] == '2') || (aword[i] == '3') || (aword[i] == '4')
				   || (aword[i] == '5') || (aword[i] == '6') || (aword[i] == '7') || (aword[i] == '8') || (aword[i] == '9'))
					notZero += aword[i];
			}
			/* ������ ����������� ��������� ���� � ������ ��������� ��-�� ������ ������������ ���������� zero ��� �������
			 * ��������� �� �������� �� notZero. � ������ ������������� ������ ���������� zero ������������� 5-������� �����. */
			try {
				zero = Integer.valueOf(notZero);
			} catch(NumberFormatException e) {
				zero = 99999;
			}
			if (zero > 9999) tooLongError = true;
		}
		return zero;
	}
	
	/* ����� �������� �������� �� ����������� ������ '��������' (comboBox1). � ������, ���� ��� ������ 1-� ������� ������,
	 * ��� ������ � ������ calculate ������������ ��������, ��������������� ������ ���������� ���� ������� ����������� (10 ��),
	 * ���� 2-� ������� � �������� ����������� ���� (5 ��), 3-� ������� � �������� ����������� ���� (6 ��). */
	public int comboBox2Check() {
		int windowFrameWidth = 0;
		/* ����� getSelectedIndex() ���������� �������� �������, ���������������� ���������� �������� ����������� ������. */
		switch (comboBox2.getSelectedIndex()) {
		case 0: windowFrameWidth = 10; break;
		case 1:	windowFrameWidth = 5; break;
		case 2:	windowFrameWidth = 6; break;
		}
		return windowFrameWidth;
	}
	
	/* ����� ���������� ������ ����������� � ������������ �������� � ����������� �� �������� ���������:
	 * 0 � ������������ ��� ������� ������ '����������' (buttonCalculate), ���� ������ ������������� ��� ��,
	 * 1 � ������������ ��� ������� ������ '�������' (buttonType), ���� ������ ������������� ��� ��,
	 * 2 � ������������ ��� ������� ������ '����������' (buttonCalculate), ���� ������ ������� ��� ��,
	 * 3 � ������������ ��� ������� ������ '�������' (buttonType), ���� ������ ������� ��� ��,
	 * 4 � ������������ ��� ������� ������ '����������' (buttonCalculate), ���� ������ �������� ��� ��,
	 * 0 � ������������ ��� ������� ������ '�������' (buttonType), ���� ������ �������� ��� ��. */
	public void changeImage(int choose) {
		switch (choose) {
		case 0:
			selectedType = 0;
			labelAnswer1.setText(""); labelAnswer2.setText(""); labelAnswer3.setText(""); labelAnswer4.setText("");
			setContentPane(new JLabel(new ImageIcon("src\\main\\java\\pi\\KR\\RectWin.png")));
	        add(labelType);
	        add(comboBox1);
	        add(buttonType);
			add(labelHeight);
			add(labelWeight);
			add(fieldHeight);
			add(fieldWeight);
			add(labelMaterial);
			add(labelSealing);
			add(comboBox2);
			add(comboBox3);
	        add(buttonCalculate);
	        add(labelAnswer1);
	        add(labelAnswer2);
	        add(labelAnswer3);
	        add(labelAnswer4);
	        break;
		case 1:
			setContentPane(new JLabel(new ImageIcon("src\\main\\java\\pi\\KR\\RectWinProc.png")));
	        add(labelType);
	        add(comboBox1);
	        add(buttonType);
			add(labelHeight);
			add(labelWeight);
			add(fieldHeight);
			add(fieldWeight);
			add(labelMaterial);
			add(labelSealing);
			add(comboBox2);
			add(comboBox3);
	        add(buttonCalculate);
	        add(labelAnswer1);
	        add(labelAnswer2);
	        add(labelAnswer3);
	        add(labelAnswer4);
	        newFieldHeight = String.valueOf(fieldCheck(fieldHeight.getText()));
	        fieldHeight.setText(newFieldHeight);
	        switch (newFieldHeight.length()) {
	        case 1:
	        	imageLabelHeight.setText(newFieldHeight);
	        	imageLabelHeight.setBounds(xI+13, yI+223, xoI, yoI);
	        	add(imageLabelHeight);
	        	break;
	        case 2:
	        	imageLabelHeight.setText(newFieldHeight);
	        	imageLabelHeight.setBounds(xI+9, yI+223, xoI, yoI);
	        	add(imageLabelHeight);
	        	break;
	        case 3:
	        	imageLabelHeight.setText(newFieldHeight);
	        	imageLabelHeight.setBounds(xI+5, yI+223, xoI, yoI);
	        	add(imageLabelHeight);
	        	break;
	        case 4:
	        	imageLabelHeight.setText(newFieldHeight);
	        	imageLabelHeight.setBounds(xI+1, yI+223, xoI, yoI);
	        	add(imageLabelHeight);
	        	break;
	        default:
	        	imageLabelHeightError.setBounds(xI, yI+223, xoI, yoI);
	        	add(imageLabelHeightError);
	        }
	        newFieldWeight = String.valueOf(fieldCheck(fieldWeight.getText()));
	        fieldWeight.setText(newFieldWeight);
	        switch (newFieldWeight.length()) {
	        case 1:
	        	imageLabelWeight.setText(newFieldWeight);
	        	imageLabelWeight.setBounds(xI+245, yI, xoI, yoI);
	        	add(imageLabelWeight);
	        	break;
	        case 2:
	        	imageLabelWeight.setText(newFieldWeight);
	        	imageLabelWeight.setBounds(xI+241, yI, xoI, yoI);
	        	add(imageLabelWeight);
	        	break;
	        case 3:
	        	imageLabelWeight.setText(newFieldWeight);
	        	imageLabelWeight.setBounds(xI+237, yI, xoI, yoI);
	        	add(imageLabelWeight);
	        	break;
	        case 4:
	        	imageLabelWeight.setText(newFieldWeight);
	        	imageLabelWeight.setBounds(xI+233, yI, xoI, yoI);
	        	add(imageLabelWeight);
	        	break;
	        default:
	        	imageLabelWeightError.setBounds(xI+233, yI, xoI, yoI);
	        	add(imageLabelWeightError);
	        }
	        if (S1c < 0) {
	        	imageLabelGlassError1.setBounds(xI+140, yI+223, xoI, yoI);
	        	add(imageLabelGlassError1);
	        	imageLabelGlassError2.setBounds(xI+332, yI+223, xoI, yoI);
	        	add(imageLabelGlassError2);
	        } else {
		        newFieldGlass1 = String.valueOf(S1c);
		        switch (newFieldGlass1.length()) {
		        case 1:
		        	imageLabelGlass1.setText(newFieldGlass1);
		        	imageLabelGlass1.setBounds(xI+150, yI+223, xoI, yoI);
		        	add(imageLabelGlass1);
		        	break;
		        case 2:
		        	imageLabelGlass1.setText(newFieldGlass1);
		        	imageLabelGlass1.setBounds(xI+146, yI+223, xoI, yoI);
		        	add(imageLabelGlass1);
		        	break;
		        case 3:
		        	imageLabelGlass1.setText(newFieldGlass1);
		        	imageLabelGlass1.setBounds(xI+144, yI+223, xoI, yoI);
		        	add(imageLabelGlass1);
		        	break;
		        case 4:
		        	imageLabelGlass1.setText(newFieldGlass1);
		        	imageLabelGlass1.setBounds(xI+140, yI+223, xoI, yoI);
		        	add(imageLabelGlass1);
		        	break;
		        case 5:
		        	imageLabelGlass1.setText(newFieldGlass1);
		        	imageLabelGlass1.setBounds(xI+136, yI+223, xoI, yoI);
		        	add(imageLabelGlass1);
		        	break;
		        case 6:
		        	imageLabelGlass1.setText(newFieldGlass1);
		        	imageLabelGlass1.setBounds(xI+132, yI+223, xoI, yoI);
		        	add(imageLabelGlass1);
		        	break;
		        case 7:
		        	imageLabelGlass1.setText(newFieldGlass1);
		        	imageLabelGlass1.setBounds(xI+128, yI+223, xoI, yoI);
		        	add(imageLabelGlass1);
		        	break;
		        case 8:
		        	imageLabelGlass1.setText(newFieldGlass1);
		        	imageLabelGlass1.setBounds(xI+124, yI+223, xoI, yoI);
		        	add(imageLabelGlass1);
		        	break;
		        default:
		        	imageLabelGlassError1.setBounds(xI+140, yI+223, xoI, yoI);
		        	add(imageLabelGlassError1);
		        }
		        newFieldGlass2 = String.valueOf(S1c);
		        switch (newFieldGlass2.length()) {
		        case 1:
		        	imageLabelGlass2.setText(newFieldGlass2);
		        	imageLabelGlass2.setBounds(xI+344, yI+223, xoI, yoI);
		        	add(imageLabelGlass2);
		        	break;
		        case 2:
		        	imageLabelGlass2.setText(newFieldGlass2);
		        	imageLabelGlass2.setBounds(xI+340, yI+223, xoI, yoI);
		        	add(imageLabelGlass2);
		        	break;
		        case 3:
		        	imageLabelGlass2.setText(newFieldGlass2);
		        	imageLabelGlass2.setBounds(xI+336, yI+223, xoI, yoI);
		        	add(imageLabelGlass2);
		        	break;
		        case 4:
		        	imageLabelGlass2.setText(newFieldGlass2);
		        	imageLabelGlass2.setBounds(xI+332, yI+223, xoI, yoI);
		        	add(imageLabelGlass2);
		        	break;
		        case 5:
		        	imageLabelGlass2.setText(newFieldGlass2);
		        	imageLabelGlass2.setBounds(xI+328, yI+223, xoI, yoI);
		        	add(imageLabelGlass2);
		        	break;
		        case 6:
		        	imageLabelGlass2.setText(newFieldGlass2);
		        	imageLabelGlass2.setBounds(xI+324, yI+223, xoI, yoI);
		        	add(imageLabelGlass2);
		        	break;
		        case 7:
		        	imageLabelGlass2.setText(newFieldGlass2);
		        	imageLabelGlass2.setBounds(xI+320, yI+223, xoI, yoI);
		        	add(imageLabelGlass2);
		        	break;
		        case 8:
		        	imageLabelGlass2.setText(newFieldGlass2);
		        	imageLabelGlass2.setBounds(xI+316, yI+223, xoI, yoI);
		        	add(imageLabelGlass2);
		        	break;
		        default:
		        	imageLabelGlassError2.setBounds(xI+332, yI+223, xoI, yoI);
		        	add(imageLabelGlassError2);
		        }
	        }
	        newFieldWfRec = String.valueOf(wfRec);
	        if (wfRec < 0) {
	        	imageLabelWfErrorRec.setBounds(xI+58, yI+223, xoI, yoI);
		    	add(imageLabelWfErrorRec);
	        } else {
	        	imageLabelWfRec.setText(newFieldWfRec);
		    	imageLabelWfRec.setBounds(xI+58, yI+223, xoI, yoI);
		    	add(imageLabelWfRec);
	        }
	        newFieldSealing = String.valueOf(1);
	        imageLabelSealingError.setText(newFieldSealing);
	        imageLabelSealingError.setBounds(xI+31, yI, xoI, yoI);
		    add(imageLabelSealingError);
	        break;
		case 2:
			selectedType = 1;
			labelAnswer1.setText(""); labelAnswer2.setText(""); labelAnswer3.setText(""); labelAnswer4.setText("");
			setContentPane(new JLabel(new ImageIcon("src\\main\\java\\pi\\KR\\RoundWin.png")));
			add(labelType);
			add(comboBox1);
			add(buttonType);
			add(labelRadius);
			add(fieldRadius);
			add(labelMaterial);
			add(labelSealing);
			add(comboBox2);
			add(comboBox3);
			add(buttonCalculate);
			add(labelAnswer1);
			add(labelAnswer2);
			add(labelAnswer3);
			add(labelAnswer4);
			break;
		case 3:
			setContentPane(new JLabel(new ImageIcon("src\\main\\java\\pi\\KR\\RoundWinProc.png")));
			add(labelType);
			add(comboBox1);
			add(buttonType);
			add(labelRadius);
			add(fieldRadius);
			add(labelMaterial);
			add(labelSealing);
			add(comboBox2);
			add(comboBox3);
			add(buttonCalculate);
			add(labelAnswer1);
			add(labelAnswer2);
			add(labelAnswer3);
			add(labelAnswer4);
			newFieldRadius = String.valueOf(fieldCheck(fieldRadius.getText()));
	        fieldRadius.setText(newFieldRadius);
	        if (newFieldRadius.length() > 4) {
	        	imageLabelRadiusError.setBounds(xI+250, yI+109, xoI, yoI);
	        	add(imageLabelRadiusError);
	        } else {
	        	imageLabelRadius.setText(newFieldRadius);
	        	imageLabelRadius.setBounds(xI+250, yI+109, xoI, yoI);
	        	add(imageLabelRadius);
	        }
	        if (wfRound < 0) {
	        	imageLabelWfErrorRound.setBounds(xI+230, yI+23, xoI, yoI);
	        	add(imageLabelWfErrorRound);
	        } else {
		        newFieldWfRound = String.valueOf(format.format(wfRound));
		        switch (newFieldWfRound.length()) {
		        case 5:
		        	imageLabelWfRound.setText(newFieldWfRound);
			    	imageLabelWfRound.setBounds(xI+230, yI+23, xoI, yoI);
			    	add(imageLabelWfRound);
		        	break;
		        case 6:
		        	imageLabelWfRound.setText(newFieldWfRound);
			    	imageLabelWfRound.setBounds(xI+226, yI+23, xoI, yoI);
			    	add(imageLabelWfRound);
		        	break;
		        case 7:
		        	imageLabelWfRound.setText(newFieldWfRound);
			    	imageLabelWfRound.setBounds(xI+222, yI+23, xoI, yoI);
			    	add(imageLabelWfRound);
		        	break;
		        case 8:
		        	imageLabelWfRound.setText(newFieldWfRound);
			    	imageLabelWfRound.setBounds(xI+218, yI+23, xoI, yoI);
			    	add(imageLabelWfRound);
		        	break;
		        case 9:
		        	imageLabelWfRound.setText(newFieldWfRound);
			    	imageLabelWfRound.setBounds(xI+215, yI+23, xoI, yoI);
			    	add(imageLabelWfRound);
		        	break;
		        default:
		        	imageLabelWfErrorRound.setBounds(xI+230, yI+23, xoI, yoI);
		        	add(imageLabelWfErrorRound);
		        }
	        }
	        newFieldGlass1 = String.valueOf(format.format(S2c));
	        if (S2c < 0) {
	        	imageLabelGlassError1.setBounds(xI+251, yI+214, xoI, yoI);
	        	add(imageLabelGlassError1);
	        } else {
		        imageLabelGlass1.setText(newFieldGlass1);
		        imageLabelGlass1.setBounds(xI+250, yI+214, xoI, yoI);
		        add(imageLabelGlass1);
		        }
	        newFieldSealing = String.valueOf(1);
	        imageLabelSealingError.setText(newFieldSealing);
	        imageLabelSealingError.setBounds(xI+70, yI+48, xoI, yoI);
		    add(imageLabelSealingError);
			break;
		case 4:
			selectedType = 2;
			labelAnswer1.setText(""); labelAnswer2.setText(""); labelAnswer3.setText(""); labelAnswer4.setText("");
			setContentPane(new JLabel(new ImageIcon("src\\main\\java\\pi\\KR\\OvalWin.png")));
	        add(labelType);
	        add(comboBox1);
	        add(buttonType);
			add(labelHeight);
			add(labelWeight);
			add(fieldHeight);
			add(fieldWeight);
			add(labelMaterial);
			add(labelSealing);
			add(comboBox2);
			add(comboBox3);
	        add(buttonCalculate);
	        add(labelAnswer1);
	        add(labelAnswer2);
	        add(labelAnswer3);
	        add(labelAnswer4);
	        break;
		case 5:
			setContentPane(new JLabel(new ImageIcon("src\\main\\java\\pi\\KR\\OvalWinProc.png")));
	        add(labelType);
	        add(comboBox1);
	        add(buttonType);
			add(labelHeight);
			add(labelWeight);
			add(fieldHeight);
			add(fieldWeight);
			add(labelMaterial);
			add(labelSealing);
			add(comboBox2);
			add(comboBox3);
	        add(buttonCalculate);
	        add(labelAnswer1);
	        add(labelAnswer2);
	        add(labelAnswer3);
	        add(labelAnswer4);
	        newFieldHeight = String.valueOf(fieldCheck(fieldHeight.getText()));
	        fieldHeight.setText(newFieldHeight);
	        switch (newFieldHeight.length()) {
	        case 1:
	        	imageLabelHeight.setText(newFieldHeight);
	        	imageLabelHeight.setBounds(xI+67, yI+212, xoI, yoI);
	        	add(imageLabelHeight);
	        	break;
	        case 2:
	        	imageLabelHeight.setText(newFieldHeight);
	        	imageLabelHeight.setBounds(xI+62, yI+212, xoI, yoI);
	        	add(imageLabelHeight);
	        	break;
	        case 3:
	        	imageLabelHeight.setText(newFieldHeight);
	        	imageLabelHeight.setBounds(xI+56, yI+212, xoI, yoI);
	        	add(imageLabelHeight);
	        	break;
	        case 4:
	        	imageLabelHeight.setText(newFieldHeight);
	        	imageLabelHeight.setBounds(xI+49, yI+212, xoI, yoI);
	        	add(imageLabelHeight);
	        	break;
	        default:
	        	imageLabelHeightError.setBounds(xI+48, yI+212, xoI, yoI);
	        	add(imageLabelHeightError);
	        }
	        newFieldWeight = String.valueOf(fieldCheck(fieldWeight.getText()));
	        fieldWeight.setText(newFieldWeight);
	        switch (newFieldWeight.length()) {
	        case 1:
	        	imageLabelWeight.setText(newFieldWeight);
	        	imageLabelWeight.setBounds(xI+237, yI-4, xoI, yoI);
	        	add(imageLabelWeight);
	        	break;
	        case 2:
	        	imageLabelWeight.setText(newFieldWeight);
	        	imageLabelWeight.setBounds(xI+233, yI-4, xoI, yoI);
	        	add(imageLabelWeight);
	        	break;
	        case 3:
	        	imageLabelWeight.setText(newFieldWeight);
	        	imageLabelWeight.setBounds(xI+229, yI-4, xoI, yoI);
	        	add(imageLabelWeight);
	        	break;
	        case 4:
	        	imageLabelWeight.setText(newFieldWeight);
	        	imageLabelWeight.setBounds(xI+225, yI-4, xoI, yoI);
	        	add(imageLabelWeight);
	        	break;
	        default:
	        	imageLabelWeightError.setBounds(xI+225, yI-4, xoI, yoI);
	        	add(imageLabelWeightError);
	        }
	        newFieldWfOval = String.valueOf(format.format(wfOval));
	        if (wfOval < 0) {
	        	imageLabelWfErrorOval.setBounds(xI+102, yI+212, xoI, yoI);
		    	add(imageLabelWfErrorOval);
	        } else {
	        	imageLabelWfOval.setText(newFieldWfOval);
		    	imageLabelWfOval.setBounds(xI+102, yI+212, xoI, yoI);
		    	add(imageLabelWfOval);
	        }
	        newFieldGlass1 = String.valueOf(format.format(S2c));
	        if (S2c < 0) {
	        	imageLabelGlassError1.setBounds(xI+226, yI+212, xoI, yoI);
	        	add(imageLabelGlassError1);
	        } else {
		        switch (newFieldGlass1.length()) {
		        case 6:
		        	imageLabelGlass1.setText(newFieldGlass1);
		        	imageLabelGlass1.setBounds(xI+226, yI+212, xoI, yoI);
		        	add(imageLabelGlass1);
		        	break;
		        case 7:
		        	imageLabelGlass1.setText(newFieldGlass1);
		        	imageLabelGlass1.setBounds(xI+222, yI+212, xoI, yoI);
		        	add(imageLabelGlass1);
		        	break;
		        case 8:
		        	imageLabelGlass1.setText(newFieldGlass1);
		        	imageLabelGlass1.setBounds(xI+218, yI+212, xoI, yoI);
		        	add(imageLabelGlass1);
		        	break;
		        case 9:
		        	imageLabelGlass1.setText(newFieldGlass1);
		        	imageLabelGlass1.setBounds(xI+214, yI+212, xoI, yoI);
		        	add(imageLabelGlass1);
		        	break;
		        case 10:
		        	imageLabelGlass1.setText(newFieldGlass1);
		        	imageLabelGlass1.setBounds(xI+210, yI+212, xoI, yoI);
		        	add(imageLabelGlass1);
		        	break;
		        case 11:
		        	imageLabelGlass1.setText(newFieldGlass1);
		        	imageLabelGlass1.setBounds(xI+206, yI+212, xoI, yoI);
		        	add(imageLabelGlass1);
		        	break;
		        case 12:
		        	imageLabelGlass1.setText(newFieldGlass1);
		        	imageLabelGlass1.setBounds(xI+204, yI+212, xoI, yoI);
		        	add(imageLabelGlass1);
		        	break;
		        }
	        }
	        newFieldSealing = String.valueOf(1);
	        imageLabelSealingError.setText(newFieldSealing);
	        imageLabelSealingError.setBounds(xI+109, yI+58, xoI, yoI);
		    add(imageLabelSealingError);
	        break;
		}
		invalidate();
        validate();
        repaint();
	}
	
	/* ���������� ���������� ������ ��� ���������. */
	public class Actions implements ActionListener {
		
		/* ����� ��������� ������� ���� ������, �.�. ���������. */
		public void actionPerformed(ActionEvent e){
			/* ����� getActionCommand() ���������� �������(������), ������������� �� ������ */
			switch (e.getActionCommand()) {
			case "����������":
				tooLongError = false;
				switch (selectedType) {
				case 0:
					calculation(fieldCheck(fieldHeight.getText()),fieldCheck(fieldWeight.getText()));
					changeImage(1);
					break;
				case 1:
					calculation(fieldCheck(fieldRadius.getText()));
					changeImage(3);
					break;
				case 2:
					calculation(fieldCheck(fieldHeight.getText()),fieldCheck(fieldWeight.getText()),0);
					changeImage(5);
					break;
				}
				break;
			case "�������":
				switch (comboBox1.getSelectedIndex()) {
				case 0: changeImage(0); break;
				case 1: changeImage(2); break;
				case 2: changeImage(4); break;
				}
				break;
			}
		}
	}
	
	/* ������� ����� ���������. � ���� ���������� ��������� ������. */
    public static void main(String args[]) {
        /* SwingUtilities.invokeLater ������������� ��� ������� ����������� ��������.
		 * ��� ��������� �������� (Runnable), � ��������� ��� �� ����� �� ��������� �������� ����� ���������. */
		SwingUtilities.invokeLater(new Runnable() {
			/* ��������� � ������������ ����� �����. */
			public void run() {
				new CalcMain();
			}
		});
    }
    
}