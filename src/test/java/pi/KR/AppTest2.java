package pi.KR;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/* �����, ����������� ���������� �� �������������� ����, ��������� ����� assertEquals(),
 * ����������� � �������� ���������� ����� (�����) � �����, ������������ ������� calculation(). */
public class AppTest2 {
	
	CalcMain api = new CalcMain();
    @Test
    public void testApp() {
        assertEquals(176, api.calculation(10, 15));
    }
    
}
