import org.junit.Test;
import static org.junit.Assert.*;

public class BinSearchTest {

    BinSearch binSerach= new BinSearch();
    String s = "abcefg";

    @Test
    public void search(){
        boolean result = binSerach.search(s , 'd');
        boolean result1 = binSerach.search(s , 'e');
        assertEquals(false, result);
        assertEquals(true, result1);
    }
}