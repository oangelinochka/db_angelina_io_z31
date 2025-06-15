import org.junit.Test;
import static org.junit.Assert.*;

public class MainAngelinaSmykTest {
    @Test
    public void testMainRuns() {
        // Перевірка, чи не виникає помилок при виконанні
        try {
            MainAngelinaSmyk.main(new String[]{});
        } catch (Exception e) {
            fail("Метод main() викликає помилку: " + e.getMessage());
        }
    }
}
