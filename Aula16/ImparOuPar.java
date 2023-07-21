// dado um determinado número inteiro, imprima se ele é impar ou par;

package Aula16;

public class ImparOuPar {
    public static void main(String [] args){
        int numero=11;


        if(numero %2==0){
            System.out.println(numero + " Par");
        }
        else{
            System.out.println(numero + " Ímpar");
        }
    }
}

