public class LivroTeste {
    public static void main(String[] args) {
        Livro mylivro = new Livro();
        mylivro.nome = "Percy Peripecias";
        mylivro.resumo = "o cara é periférico";
        mylivro.autor = "Favelado Invertidos";
        mylivro.preco = 300.40;
        mylivro.pagina = 10;
        mylivro.exibirDados();

        Livro myLivroPoney = new Livro();
        myLivroPoney.nome = "Sequestre as girls";
        myLivroPoney.resumo = "-Bota aí ó kamasultra";
        myLivroPoney.autor = "Whauter Invite";
        myLivroPoney.preco = 56.99;
        myLivroPoney.pagina = 257;
        myLivroPoney.exibirDados();
    }

}
