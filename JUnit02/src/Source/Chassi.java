package Source;
public class Chassi {
    public static String getAno(String chassi){
        if(chassi.length()<17) return "Inválido";
        if(!chassi.toUpperCase().equals(chassi)) return "Inválido";
        String ano = "";
        
        char letra = chassi.charAt(9);
        if(letra == 'A') ano="2010";
        if(letra == 'B') ano="2011";
        if(letra == 'C') ano="2012";
        if(ano != "") return ano;
        return "Inválido";
    }
}
