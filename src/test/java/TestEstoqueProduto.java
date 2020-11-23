import org.junit.Assert;
import org.junit.Test;

public class TestEstoqueProduto {

    @Test
    public void consultaEstoqueTeste(){

        int estoqueEsperado = 10;
        int estoqueAtual = 0;

        EstoqueProduto estoque = new EstoqueProduto(1);
        estoqueAtual = estoque.getSaldoEstoque();

        Assert.assertEquals(estoqueEsperado,estoqueAtual);

    }

    @Test
    public void somaEstoqueTeste(){
        int estoqueEsperado = 10;
        int estoqueAtual = 0;

        EstoqueProduto estoque = new EstoqueProduto(2);
        estoqueAtual = estoque.setSaldoEstoque(7);

        Assert.assertEquals(estoqueEsperado,estoqueAtual);
    }

    @Test
    public void estoqueBaixoTeste(){

        boolean esperado = true;
        boolean reporEstoque = false;

        EstoqueProduto estoque = new EstoqueProduto(2);
        reporEstoque = estoque.consultaReposicao();

        Assert.assertEquals(esperado,reporEstoque);

    }


    @Test
    public void estoqueAltoTeste(){

        boolean esperado = false;
        boolean reporEstoque = false;

        EstoqueProduto estoque = new EstoqueProduto(1);
        reporEstoque = estoque.consultaReposicao();

        Assert.assertEquals(esperado,reporEstoque);

    }

    @Test
    public void estoqueLimiteTeste(){

        boolean esperado = false;
        boolean reporEstoque = false;

        EstoqueProduto estoque = new EstoqueProduto(3);
        reporEstoque = estoque.consultaReposicao();

        Assert.assertEquals(esperado,reporEstoque);

    }

    @Test
    public void removerSaldoEstoqueNegativoTeste(){

        int esperado = 5;
        int saldo = 0;

        EstoqueProduto estoque = new EstoqueProduto(3);
        saldo = estoque.removeSaldo(-10);

        Assert.assertEquals(esperado,saldo);

    }

    @Test
    public void removerEstoqueZeroTeste(){

        int esperado = 5;
        int saldo = 0;

        EstoqueProduto estoque = new EstoqueProduto(3);
        saldo = estoque.removeSaldo(0);

        Assert.assertEquals(esperado,saldo);

    }

}
