package consumer;

import java.util.function.Consumer;

import loopsOlderWay.Usuario;

/* 
 * O Consumer é uma classe que contém apenas esse método accept().
 * O Mostrador vai consumir o objeto que recebe.
 * Consumir aqui significa realizar uma tarefa que faça sentido pra você,
 * nesse caso é mostrar o nome do usuário
 */
public class Mostrador implements Consumer<Usuario> {
    public void accept(Usuario u) {
        System.out.println(u.getNome());
    }
}
