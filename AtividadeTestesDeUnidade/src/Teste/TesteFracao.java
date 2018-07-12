package Teste;

import Model.Fracao;
import org.junit.Assert;
import org.junit.Test;

public class TesteFracao {

    @Test
    public void Testar_se_uma_fracao_multiplica_corretamente(){
        Fracao fracao =  new Fracao(5,2);
        Fracao fracao2 =  new Fracao(2,2);
        Assert.assertEquals("10/4",fracao.multiplicacao(fracao2));
    }

    @Test
    public void Testar_se_uma_fracao_soma_corretamente(){
        Fracao fracaoSoma =  new Fracao(5,2);
        Fracao fracao2Soma =  new Fracao(2,2);
        Assert.assertEquals("7/2.0",fracaoSoma.soma(fracao2Soma));
    }

    @Test
    public void  Testar_se_uma_fracao_faz_a_diferenca(){
        Fracao fracao =  new Fracao(5,2);
        Fracao fracao2 =  new Fracao(2,2);
        Assert.assertEquals("3/2.0",fracao.diferenca(fracao2));
    }

    @Test
    public void Testar_se_uma_fracao_faz_divisao(){
        Fracao fracao =  new Fracao(10,5);
        Fracao fracao2 =  new Fracao(3,14);
        Assert.assertEquals("140/15",fracao.divisao(fracao2));
    }

    @Test
    public void Testar_se_mmc_eh_valido(){
        Fracao fracao =  new Fracao(10,5);
        Assert.assertEquals("15.0", String.valueOf(fracao.mmc(3,5)));
    }
}
