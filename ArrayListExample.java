import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int elemento;
        while(true){
            System.out.print("Insira número interiro para ser incluído ou -1 para encerrar");
            elemento = entrada.nextInt();
            if(elemento == -1){
                break;
            }
            lista.add(elemento);
        }
        System.out.println("\nA lista que você criou contêm os seguintes elementos:");
        for(int i: lista) System.out.println(i);
        System.out.println("\nInforme o ídice do elemento que você deseja retirar");
        entrada.reset();
        elemento = entrada.nextInt();
        lista.remove(elemento);
        System.out.println("Agora sua lista ficou assim:");
        for(int i : lista) System.out.println(i);

    }
} //Creating a user matrix that also excludes elements