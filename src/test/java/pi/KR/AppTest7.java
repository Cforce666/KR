package pi.KR;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/* �����, ����������� ���������� �� �������������� ����, ��������� ����� assertEquals(),
 * ����������� � �������� ���������� ����� (�����) � �����, ������������ ������� calculation(). */
public class AppTest7 {
	
	CalcMain api = new CalcMain();
    @Test
    public void testApp() {
        assertEquals(806, api.calculation(25, 30));
    }
    
}

