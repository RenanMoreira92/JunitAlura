package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class BonusServiceTest<valor> {

    @Test
    public void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoALto(){
        BonusService service = new BonusService();

        assertThrows(IllegalArgumentException.class,
        () -> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal(25000))));

    }
    @Test
    public void bonusDeveriaSerDezPorCentoDoSalario(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal(2500)));

        assertEquals( new BigDecimal(250.00), bonus);
    }
    @Test
    public void bonusDeveriaserDezPorCentoParaSalarioDeExatamenteDezMilReais(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal(10000)));

        assertEquals( new BigDecimal(1000.00), bonus);
    }

}


