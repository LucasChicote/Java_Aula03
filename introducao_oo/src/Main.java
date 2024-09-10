public class Main {
    public static void main(String[] args) {

        var produto1 = new Produto("Coca-cola", 5.0, "Refrigerante de Cola", 10);
        var Produto2 = new Produto("Guaraná", 4.0, "Refrigerante de guraná", 5);

        produto1.AdicionarEstoque(6);
        System.out.println(produto1);
        System.out.println(Produto2);
    }
}
