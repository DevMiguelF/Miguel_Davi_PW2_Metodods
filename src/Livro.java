public class Livro {
    String nome;
    String resumo;
    double preco;
    int pagina;
    String autor;

    void exibirDados(){
        System.out.println(nome +"\n"+ resumo +"\n"+ autor +"\n"+ pagina +"\n"+ preco);
        System.out.println("----------------------------------------");
    }
    void dezconto(double desconto){
        preco = preco - (preco * desconto);
    }
}
