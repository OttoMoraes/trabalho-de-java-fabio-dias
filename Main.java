
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        
        ArrayList<String> carrinho = new ArrayList<>();

        carrinho.add("Notebook");
        carrinho.add("Teclado");
        carrinho.add("Monitor");
        carrinho.add("Mouse");
        carrinho.add("Headset");

        System.out.println("Carrinho: " + carrinho);

        System.out.println(
            "Último produto: " +
            carrinho.get(carrinho.size() - 1)
        );

        
        carrinho.remove("Mouse");

        System.out.println(
            "Carrinho depois de remover o Mouse: " + carrinho
        );

        S
        System.out.println("Total de produtos: " + carrinho.size());
    }
}
