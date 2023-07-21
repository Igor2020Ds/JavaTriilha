// UTILIZE UMA VARIÁVEL PARA ARMAZENAR RESULTADO E IMPRIMIR NO FINAL
  
package Aula15;
public class desafio{
    public static void main(String[]args){

        float salario=4501;
        float desconto=0F;
       
        if(salario<=1300){
            System.out.println("Desconto de 0%");
            
           
        }

        else if(salario >=1300.01F && salario <= 4500){
            desconto = 0.10F;
            System.out.println("Desconto de 10%");
            
     
    }

        else{
             desconto = 0.15F;   
             System.out.println("Desconto de 15%");
            }
            desconto = salario*desconto;
            System.out.println("Salário de : " + salario +" Desconto aplicado : "+ desconto);


    }



}