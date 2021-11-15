

package projetofaculdade;


public class ProjetoFaculdade {

    public static void main(String[] args) {
        Ponto pontoA = new Ponto(15, 11);
        Ponto pontoB = new Ponto(12,13);
        if(pontoA.PontosIguais(pontoB)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Não Iguais");
        }
        pontoA.PontosIguais(pontoB);
        System.out.println(pontoA.Distancia(pontoB));
        
    }
    
}




