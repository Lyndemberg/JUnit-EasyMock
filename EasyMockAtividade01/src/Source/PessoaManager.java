package Source;

import java.util.List;

public class PessoaManager {
    private IPessoaDAO ipessoaDAO;

    public PessoaManager(IPessoaDAO ipessoaDAO) {
        this.ipessoaDAO = ipessoaDAO;
    }
    public boolean validaDados(Pessoa p){
        if(p.getCpf().length()<11) return false;
        if(p.getCpf().isEmpty()) return false;
        if(p.getEmail().isEmpty()) return false;
        if(p.getEndereco().isEmpty()) return false;
        if(p.getNome().isEmpty()) return false;
        if(p.getTelefone().isEmpty()) return false;
        if(p.getIdade() == 0) return false;
        return true;
    }
    
    public boolean inserir(Pessoa p){
        if(validaDados(p)){
            return ipessoaDAO.inserir(p);
        }
        return false;
    }
    public boolean atualizar(Pessoa p){
        if(validaDados(p)){
            return ipessoaDAO.atualizar(p);
        }
        return false;
    }
    public boolean deletar(Pessoa p){
        return ipessoaDAO.deletar(p);
    }
    public List<Pessoa> listar(){
        return ipessoaDAO.listar();
    }
}
