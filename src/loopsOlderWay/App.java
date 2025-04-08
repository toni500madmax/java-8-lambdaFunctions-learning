package loopsOlderWay;

import java.util.Arrays;
import java.util.List;

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

        for (Usuario u : usuarios) {
            System.out.println(u.getNome());
        }
    }
}
