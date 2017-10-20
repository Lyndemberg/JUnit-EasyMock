package Source;
public class VerificaCPF {
    
    public static boolean verificar(String cpf){
        if(cpf == null) return false;
        if(cpf.length()<14 || cpf.length()>14) return false;
        String alfabeto = "abcdefghijklmnopqrstuwxyz";
        for(int i=0; i<cpf.length(); i++){
            for(int k=0; k<alfabeto.length(); k++){
                if(cpf.charAt(i) == alfabeto.charAt(k) || cpf.charAt(i) == alfabeto.toUpperCase().charAt(k)){
                    return false;
                }
            }
        }
        String novePrimeiros = cpf.substring(0, 3)+cpf.substring(4, 7)+cpf.substring(8,11);
        int primeiro = Integer.parseInt(String.valueOf(cpf.charAt(12)));
        int segundo = Integer.parseInt(String.valueOf(cpf.charAt(13)));
        int primeiroCorreto = getPrimeiro(novePrimeiros);
        int segundoCorreto = getSegundo(novePrimeiros, primeiroCorreto);
        return (primeiro == primeiroCorreto) && (segundo == segundoCorreto);       
    }
    
    private static int getPrimeiro(String nove){
        int soma = 0;
        int pos = 0;
        for(int i=10; i>1; i--){
            int mult = Integer.valueOf(String.valueOf(nove.charAt(pos)))*i;
            soma = soma + mult;
            pos++;
        }
        int resto = soma % 11;
        int primeiro;
        if(resto < 2){
            primeiro = 0;
        }else{
            primeiro = 11 - resto;
        }
        
        return primeiro;
    }
    
    private static int getSegundo(String nove, int primeiroVerificado){
        int soma = 0;
        int pos = 0;
        for(int i=11; i>1; i--){
            if(i==2){
                soma = soma + (primeiroVerificado * i);
            }else{
                int mult = Integer.valueOf(String.valueOf(nove.charAt(pos)))*i;
                soma = soma + mult;
            }
            pos++;
        }
        int resto = soma % 11;
        int segundo;
        if(resto < 2){
            segundo = 0;
        }else{
            segundo = 11 - resto;
        }
        
        return segundo;
    }
    
}
