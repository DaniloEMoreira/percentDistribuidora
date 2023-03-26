
/**
 *
 * @author Danilo
 */
public class Percentagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float sP = (float) 67836.43;
        float rJ = (float) 36678.66;
        float mG = (float) 29229.88;
        float eS = (float) 27165.48;
        float outros = (float) 19849.53;
        
        float total = sP + rJ + mG + eS + outros;
        
        float perCentSP = perCent(sP,total);
        float perCentRJ = perCent(rJ,total);
        float perCentMG = perCent(mG,total);
        float perCentES = perCent(eS,total);
        float perCentOutros = perCent(outros,total);
        float perCentOutros2 = perCent(total,total);
        
        String resposta = String.format("Calculo de percentual de arecadação da distribuidora"
                + "\ntotal R$: %.2f que representa %.2f%% "
                + "\nSP:     %.2f%% com R$%.2f"
                + "\nRJ:     %.2f%% com R$%.2f"
                + "\nMG:     %.2f%% com R$%.2f"
                + "\nES:     %.2f%% com R$%.2f"
                + "\nOutros: %.2f%% com R$%.2f" , total, perCentOutros2,perCentSP, sP,perCentRJ, rJ,perCentMG,mG,perCentES,eS,perCentOutros,outros);
        
        System.out.println(resposta);
        
    }
    
    /**
     * 
     * @param valor o valor que deseja saber a pocentagem
     * @param total o valor que sera calculado como 100%
     * @return um int referente a porcetagem do valor passado por parametro
     */
    public static float perCent(double valor, double total){
        
        float percent = (float) ((valor * 100)/total);
                 
        return percent;
    }
    
}