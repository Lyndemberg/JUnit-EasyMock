
package Source;

import java.util.ArrayList;

public class CifraDeCesar {
    public static String criptografar(String frase, int n){
        if(frase.isEmpty()) return "Inválido";
        String fraseMaiscula = frase.toUpperCase();
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String novaFrase = "";
        for(int i=0; i<fraseMaiscula.length(); i++){
            
            char letraAtual = fraseMaiscula.charAt(i);
            if(letraAtual == ' '){
                novaFrase = novaFrase+" ";
            }else if(alfabeto.indexOf(letraAtual)+n > 25){
                int resto = alfabeto.length() - alfabeto.indexOf(letraAtual);
                int aux = n-resto;
                novaFrase = novaFrase + alfabeto.charAt(aux);
            }else{
                novaFrase = novaFrase + alfabeto.charAt(alfabeto.indexOf(letraAtual)+n);
            }
            
        }
        
        return novaFrase;
    }
    public static String descriptografar(String frase, int n){
        if(frase.isEmpty()) return "Inválido";
        String fraseMaiscula = frase.toUpperCase();
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZABC";
        String novaFrase = "";
        for(int i=0; i<fraseMaiscula.length(); i++){
            char letraAtual = fraseMaiscula.charAt(i);
            
            if(letraAtual == ' '){
                novaFrase = novaFrase+" ";
            }else   if(alfabeto.indexOf(letraAtual)-n < 0){
                        if(alfabeto.indexOf(letraAtual) > n){
                            novaFrase += alfabeto.charAt(((n-alfabeto.indexOf(letraAtual))*-1));
                        }else{
                            int resto = n-alfabeto.indexOf(letraAtual);
                            int aux = 26-resto;
                            novaFrase += alfabeto.charAt(aux);
                        }
                    }else{
                        novaFrase += alfabeto.charAt(alfabeto.indexOf(letraAtual)-n);
                    } 
        
        }
        
        return novaFrase;
    }
    
}
