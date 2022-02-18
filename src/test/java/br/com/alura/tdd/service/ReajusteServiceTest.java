package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar(){

        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Pedro", LocalDate.now(), new BigDecimal(1000.00));

        service.concederReajuste (funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal(1030.00), funcionario.getSalario());
    }
    return valor.setScale(2, BigDecimal.ROUND_UP);
}