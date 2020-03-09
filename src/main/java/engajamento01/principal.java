package engajamento01;

import java.util.ArrayList;

public class principal {
   private static ArrayList<alunos> alunos = new ArrayList<alunos>();

    public static ArrayList<alunos> getalunos(){
        return alunos;
    }

    public static void adicionar(alunos a){
        System.out.print("Informe seu nome: ");
        alunos.add(a);
    }

    static public String imprimir(){
        String imp = " ";
            for(alunos a : alunos){
                imp += a.imprimir();
            }
            return imp;
    }
}
    