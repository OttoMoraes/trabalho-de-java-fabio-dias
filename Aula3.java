
import java.util.HashMap;
import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {

        // Passo 1: Criar a tabela de preços
        HashMap<String, Double> tabelaPrecos = new HashMap<>();

        // Passo 2: Cadastrar os produtos
        tabelaPrecos.put("78910", 4.50);  // Chocolate
        tabelaPrecos.put("78920", 8.90);  // Café
        tabelaPrecos.put("78930", 12.00); // Azeite

        // Passo 3: Capturar o código digitado
        Scanner scanner = new Scanner(System.in);

        System.out.print(
            "Exiba o produto no leitor (Digite o código de barras): "
        );

        String codigo = scanner.nextLine();

        // Passo 4: Verificar se o produto existe
        if (tabelaPrecos.containsKey(codigo)) {

            double preco = tabelaPrecos.get(codigo);

            System.out.printf(
                "Produto localizado! Preço: R$ %.2f%n",
                preco
            );

        } else {
            System.out.println(
                "Código de barras não identificado. Procure um funcionário."
            );
        }

        scanner.close();
    }
}
