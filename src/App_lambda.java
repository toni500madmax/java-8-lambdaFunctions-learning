import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import loopsOlderWay.Usuario;

public class App_lambda {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Lottie Waters", 150);
        Usuario user2 = new Usuario("Bernard Dixon", 120);
        Usuario user3 = new Usuario("Mitchell Craig", 110);
        Usuario user4 = new Usuario("Lela Owens", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4);

        System.out.println("\n-------------------1º loop--------------------------");
        /*
         * Implementando Consumer com lambda, inferindo tipo
         */
        Consumer<Usuario> mostradorLambda = (Usuario u) -> {
            System.out.println(u.getNome());
        };
        usuarios.forEach(mostradorLambda);

        System.out.println("-------------------2º loop--------------------------");
        /*
         * Implementando sem inferir tipo
         */
        Consumer<Usuario> mostradorLambda2 = u -> {
            System.out.println(u.getNome());
        };
        usuarios.forEach(mostradorLambda2);

        System.out.println("-------------------3º loop--------------------------");
        /*
         * Implementando sem inferir tipo e retirando as chaves
         */
        Consumer<Usuario> mostradorLambda3 = (u) -> System.out.println(u.getNome());
        usuarios.forEach(mostradorLambda3);

        System.out.println("-------------------4º loop--------------------------");
        /*
         * Implementando sem inferir tipo e retirando as chaves
         */
        usuarios.forEach(u -> System.out.println(u.getNome()));
    }
}
