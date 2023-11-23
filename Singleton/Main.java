public class Main {
    public static void main(String[] args) {
        ConexaoBancoDados con = ConexaoBancoDados.getInstance();
        con.setUrlBanco("localhost:3000/");
        System.out.println(">>>"+con.getUrlBanco());

        ConexaoBancoDados con2 = ConexaoBancoDados.getInstance();
        System.out.println(">>>"+con2.getUrlBanco());
    }
}
