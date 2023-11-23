public class ConexaoBancoDados{

    private String urlBanco = null;
    private static ConexaoBancoDados con = null;

    private ConexaoBancoDados(){
    }

    public void setUrlBanco( String urlBanco ){
        this.urlBanco = urlBanco;
    }

    public String getUrlBanco(){
        return this.urlBanco;
    }

    public synchronized static ConexaoBancoDados getInstance(){
        if( con == null ){
            con = new ConexaoBancoDados();
        }
        return con;
    }
}