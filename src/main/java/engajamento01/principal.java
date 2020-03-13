package engajamento01;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {
    private static boolean run = true;
    // Nesse contexto não tem a necessidade de implementar uma classe 
    //private static ArrayList<alunos> alunos = new ArrayList<alunos>();
    private static ArrayList<String> alunos = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (run) {
            showMenu();
            String option = scan.nextLine();
            if(option.equals("1")){
                adicionar();
            }else if(option.equals("2")){
                imprimir();
                run = false;
            }else{
                System.out.println("Insira uma opção valida !!!");
            }
        }
    }

    private static void showMenu() {
        System.out.println("Menu");
        System.out.println("1 - Inserir estudantes ");
        System.out.println("2 - Listar Estudantes");
    }

    /*public static ArrayList<alunos> getalunos() {
        return alunos;
    }*/

    public static void adicionar(/*alunos a*/) {
        System.out.print("Informe seu nome: ");
        String aluno = scan.nextLine();
        if(!alunos.contains(aluno)){
            alunos.add(aluno);
        }else{
            System.out.println("Aluno ja cadastrado");
        }      
    }

    static public /*String*/void imprimir() {
        //String imp = " ";
        for (/*aluno*/ String a : alunos) {
            //imp += a.imprimir();
            System.out.println(a);
        }
        //return imp;
    }
}
