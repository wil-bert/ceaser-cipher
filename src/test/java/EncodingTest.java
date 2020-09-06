import  org.junit.Test;
import static org.junit.Assert.*;


public class EncodingTest {
    private Encoding testEncoding = new Encoding("IAN WILBERT", 2);

    @Test
    public void checkIfItCreatesInstance()
    {
        assertNotNull(testEncoding);
    }

    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("IAN WILBERT", testEncoding.getInputText() );
    }

    @Test
    public void checkKeyIsSaved()
    {
        assertEquals(2,testEncoding.getKey());
    }

    @Test
    public void isNotEmpty()
    {
        assertTrue(testEncoding.isValidInputText());
    }

    @Test
    public void isValidInputText()
    {
        assertTrue(testEncoding.isValidInputText());
    }

    @Test
    public void isValidKey()
    {
        assertTrue(testEncoding.isValidKey());
    }

    @Test
    public void validEncoding()
    {
        assertEquals("MGRDEA EFRGA" , testEncoding.encode());
    }

}