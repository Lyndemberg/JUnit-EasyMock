package Testes;

import Source.CifraDeCesar;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCifraDeCesar {
    
    @Test
    public void test_1(){
        assertEquals("UDIDHO JXLPDUDHV VDNXUDL", CifraDeCesar.criptografar("Rafael Guimaraes Sakurai",3));
    }
    @Test
    public void test_2(){
        assertEquals("RAFAEL GUIMARAES SAKURAI", CifraDeCesar.descriptografar("UDIDHO JXLPDUDHV VDNXUDL",3));
    }
    @Test
    public void test_3(){
        assertEquals("Inválido", CifraDeCesar.criptografar("",3));
    }
    @Test
    public void test_4(){
        assertEquals("Inválido", CifraDeCesar.descriptografar("",3));
    }
    
}
