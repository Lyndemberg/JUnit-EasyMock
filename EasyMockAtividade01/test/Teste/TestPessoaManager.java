package Teste;

import Source.IPessoaDAO;
import Source.Pessoa;
import Source.PessoaManager;
import org.easymock.EasyMock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class TestPessoaManager {
    private IPessoaDAO pessoaDAO = null;
    
    @Before
    public void setUp(){
        pessoaDAO = EasyMock.createMock(IPessoaDAO.class);
    }

    @Test
    public void test_1(){
        Pessoa p = new Pessoa("11584758413", "Chico", 20, "chico@gmail.com", "99999999", "Rua X das Brenha");
        EasyMock.expect(pessoaDAO.inserir(p)).andReturn(true);
        EasyMock.replay(pessoaDAO);
        PessoaManager manager = new PessoaManager(pessoaDAO);
        assertTrue(manager.inserir(p));
        EasyMock.verify(pessoaDAO);
    }
    @Test
    public void test_2(){
        Pessoa p = new Pessoa("3", "Chico", 20, "chico@gmail.com", "99999999", "Rua X das Brenha");
        EasyMock.expect(pessoaDAO.inserir(p)).andReturn(false);
        EasyMock.replay(pessoaDAO);
        PessoaManager manager = new PessoaManager(pessoaDAO);
        assertFalse(manager.inserir(p));
        EasyMock.verify(pessoaDAO);
    }
}
