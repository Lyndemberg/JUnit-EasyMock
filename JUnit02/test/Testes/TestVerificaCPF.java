
package Testes;

import Source.VerificaCPF;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestVerificaCPF {
    @Test
    public void test_1(){
       assertTrue(VerificaCPF.verificar("333.124.987-40"));
    }
    
    @Test
    public void test_2(){
       assertFalse(VerificaCPF.verificar("333.124.987-45"));
    }
    
    @Test
    public void test_3(){
       assertFalse(VerificaCPF.verificar("333.124.987"));
    }
    
    @Test
    public void test_4(){
       assertFalse(VerificaCPF.verificar("333.124.987.456-20"));
    }
    
    @Test
    public void test_5(){
       assertTrue(VerificaCPF.verificar("117.846.484-93"));
    }
    @Test
    public void test_6(){
       assertFalse(VerificaCPF.verificar(null));
    }
    @Test
    public void test_7(){
       assertFalse(VerificaCPF.verificar("11784648493"));
    }
    @Test
    public void test_8(){
       assertFalse(VerificaCPF.verificar("117.abc.484-93"));
    }
    @Test
    public void test_9(){
       assertFalse(VerificaCPF.verificar("rolinhabranca"));
    }
}
