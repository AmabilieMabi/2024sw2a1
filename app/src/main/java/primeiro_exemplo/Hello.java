package primeiro_exemplo;

import primeiro_exemplo.modelos.Pessoa;

public class Hello {
    public static void main(String[] args) {
        int cont = 10;
        String nome = "Marco";
        System.out.println("Olá Mundo!!!");

        System.out.println(cont + " : " + nome);

        Pessoa p1 = new Pessoa();

        p1.nome = "Jurema";
        p1.idade = 10;

        System.out.println(p1.nome + ":" + p1.idade);

        Pessoa p2 =p1;
        p2.nome = "Maria Joaquina";

         System.out.println(p2.nome);
         System.out.println(p1.nome);

         Pessoa p3 = new Pessoa();
         p3.nome = "Cleiton";
         p3.idade = 75;

         System.out.println(p1.verifcarMaioridade());
         System.out.println(p3.verifcarMaioridade());
}
}