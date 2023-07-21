package Aula15;

public class CalculaSalarioCondicional {
    public static void main(String [] args) {
        float salario=1500;

        if (salario<=1300){
             System.out.println("Salário sem imposto");
        }
        else if(salario >1300 && salario <=4500){
            float desc10= salario*0.10f;
            System.out.println("Salario de "+ salario +" tem o imposto de 10% ");
            salario= salario - desc10;
        }
        else{
             float desc15= salario* 0.15f;
             System.out.println("Salario de "+ salario +" tem o imposto de 15% ");
            salario= salario-desc15;
           
        }

        System.out.println("salário é : " + salario);
        
    }
}
/*

// UTILIZE UMA VARIÁVEL PARA ARMAZENAR RESULTADO E IMPRIMIR NO FINAL
  public class desafio{
    public static void main(String[]args){

        int salario

        if(salario<= 1300){
            salario = salario-0;
        }
        else if
            (salario>1300 && salario <= 4500){
             salario = salario - salario*0.10   
            }
        else{
            salario= salario- salario*0.15;
        }
        
        System.out.println("O salário com desconto é " + salario)
        
    }
  }
 */