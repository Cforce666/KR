package pi.KR;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/* �����, ����������� ���������� �� �������������� ����, ��������� ����� assertEquals(),
 * ����������� � �������� ���������� ����� (�����) � �����, ������������ ������� calculation(). */
public class AppTest6 {
	
	CalcMain api = new CalcMain();
    @Test
    public void testApp() {
        assertEquals(451, api.calculation(10, 40));
    }
    
}
