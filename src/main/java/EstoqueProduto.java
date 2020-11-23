import java.util.HashMap;

public class EstoqueProduto {

    // key = codigo ; value = saldo;
    private HashMap<Integer,Integer> produtos = new HashMap<Integer, Integer>();

    private int codProd = 0;
    private int estoqueMinino = 5;
    public int saldoEmEstoque = 0;


    public EstoqueProduto(int codProduto){
        this.codProd = codProduto;
        this.produtos.put(1,10);
        this.produtos.put(2,3);
        this.produtos.put(3,5);

        this.saldoEmEstoque = this.produtos.get(codProduto);

    }

    //consulta para verificar se precisa repor o estoque
    public boolean consultaReposicao(){

        boolean reporEstoque = false;

        if(this.produtos.get(this.codProd) < this.estoqueMinino){
            System.out.print("Repor o estoque do produto "+this.codProd);
            reporEstoque = true;

        }else{
            System.out.print("Estoque sufuciente");
            reporEstoque = false;
        }

        return reporEstoque;
    }

    //retorna a quantidade em estoque de determinado produto
    public int getSaldoEstoque(){
        this.saldoEmEstoque = this.produtos.get(this.codProd);
        return this.saldoEmEstoque;
    }

    public int setSaldoEstoque(int quantidade){

        int saldoAtual = getSaldoEstoque();

        this.produtos.put(this.codProd, saldoAtual + quantidade);

        saldoAtual = getSaldoEstoque();

        System.out.println("Novo Saldo:"+saldoAtual);

        return  saldoAtual;
    }

    public int removeSaldo(int quantidade){

        int saldoAtual = getSaldoEstoque();

        if (quantidade > 0){
            if(quantidade > saldoAtual){
                System.out.println("Quantidade a ser removida maior que o saldo atual!\n O estoque nao sera alterado");
            }else{
                this.produtos.put(this.codProd, saldoAtual - quantidade);
            }
        }else{
            System.out.println("Quantidade a ser removida deve ser maior que o 0!\n O estoque nao sera alterado");
        }

        saldoAtual = getSaldoEstoque();

        return saldoAtual;
    }

}
