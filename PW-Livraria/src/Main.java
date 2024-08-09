public class Main {
    public static void main(String[] args)
    {
        // Para criar/instânciar um objeto é da mesma maneira que declara variáveis
        // TipoDaVariavel nomeDaVariavel = conteúdo;
     Editora editora01 = new Editora();
        editora01.nome = "Isão Titia";
        editora01.site = "www.isaotitia.com.br";
       editora01.email = "isao.titia1910@gmail.com";

        Livro meuLivro = new Livro();
        meuLivro.titulo = "Harry Potter";
        System.out.println(meuLivro.titulo);

        meuLivro.autor = "Machado de Doideira";
        System.out.println(meuLivro.autor);

        meuLivro.editora = editora01;
        System.out.println(meuLivro.editora);

        meuLivro.tipoCapa = "Seca";
        System.out.println(meuLivro.tipoCapa);

        meuLivro.resumo = "Livro sobre varinha. Quadribol e os krai";
        System.out.println(meuLivro.resumo);

        meuLivro.paginas = 365;
        System.out.println(meuLivro.paginas);

        meuLivro.valor = 35.99;
        System.out.println(meuLivro.valor + "\n");




        Editora editora02 = new Editora();
        editora02.nome = "Gustavorinthians";
        editora02.site = "www.gustavorinthians.com.br";
        editora02.email = "gustavorinthians1910@gmail.com";

        Livro meuLivro02 = new Livro();
        meuLivro02.titulo = "Gogh Marley e as Aventuras com seu Cão Tesla";
        System.out.println(meuLivro02.titulo);

        meuLivro02.autor = "Frederico Nesquik";
        System.out.println(meuLivro02.autor);

        meuLivro02.editora = editora02;
        System.out.println(meuLivro02.editora.nome);

        meuLivro02.tipoCapa = "Dura";
        System.out.println(meuLivro02.tipoCapa);

        meuLivro02.resumo = "Um cara doidão e seu cachorro robô assassino";
        System.out.println(meuLivro02.resumo);

        meuLivro02.paginas = 640;
        System.out.println(meuLivro02.paginas);

        meuLivro02.valor = 49.99;
        System.out.println(meuLivro02.valor);






    }
}