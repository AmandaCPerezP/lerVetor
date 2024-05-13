// Escreva um programa em Java que leia um vetor de números inteiros e encontre o maior e o menor valor do vetor.
import java.util.Scanner;
public class Vetor 
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        do
        {
            System.out.println("Digite o tamanho do vetor:");
            try 
            {
                int tamanho = ler.nextInt();
                int vetor[] = ler.nextInt();
                vetor = new [tamanho];
                System.out.println("Digite os valores do vetor:");    
            } 
            catch (Exception e) 
            {
                
            }
        }
    }
}
