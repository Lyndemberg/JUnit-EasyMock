package Testes;

import Source.Chassi;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestChassi {
    @Test
    public void test_1(){
        assertEquals("2010", Chassi.getAno("9BP17164GA0000001"));
    }
    @Test
    public void test_2(){
        assertEquals("2011", Chassi.getAno("9BP17164GB0000001"));
    }
    @Test
    public void test_3(){
        assertEquals("2012", Chassi.getAno("9BP17164GC0000001"));
    }
    @Test
    public void test_4(){
        assertEquals("Inválido", Chassi.getAno("9bp17164gc0000001"));
    }
    @Test
    public void test_5(){
        assertEquals("Inválido", Chassi.getAno("9BP17164GC"));
    }
    
}
