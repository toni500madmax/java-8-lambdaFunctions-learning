
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import consumer.Mostrador;
import loopsOlderWay.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario user1 = new Usuario("Lottie Waters", 150);
        Usuario user2 = new Usuario("Bernard Dixon", 120);
        Usuario user3 = new Usuario("Mitchell Craig", 110);
        Usuario user4 = new Usuario("Lela Owens", 190);

        /*
         * Arrays.asList() é uma maneira fácil e rápida de criar uma lista,
         * dessa forma não é preciso instânciar um ArrayList e depois adicionar um a um.
         */
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4);

        System.out.println("\n-------------------1º loop--------------------------");
        /*
         * Maneira encurtada de usar loop for
         */
        for (Usuario u : usuarios) {
            System.out.println(u.getNome());
        }

        System.out.println("-------------------2º loop--------------------------");
        /*
         * Maneira nova de usar o loop for.
         * forEach() - para cada elemento da lista, faça algo.
         */
        Mostrador mostrador = new Mostrador();
        usuarios.forEach(mostrador);

        System.out.println("-------------------3º loop--------------------------");
        /*
         * Para tarefas mais fáceis pode ser feito diretamente com classes anônimas
         */
        Consumer<Usuario> mostrador2 = new Consumer<Usuario>() {
            public void accept(Usuario u) {
                System.out.println(u.getNome());
            }
        };
        usuarios.forEach(mostrador2);

        System.out.println("-------------------4º loop--------------------------");
        /*
         * É possivel também reduzir esse código suprimindo a criação de um objeto novo.
         */
        usuarios.forEach(new Consumer<Usuario>() {
            public void accept(Usuario u) {
                System.out.println(u.getNome());
            }
        });
    }
}
