package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static fr.lernejo.Sample.Operation.ADD;
import static fr.lernejo.Sample.Operation.MULT;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void fact_neg_should_produce_an_exception() {
        Sample sample = new Sample();
        int neg = -2;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> sample.fact(neg));
    }
    @Test
    void fact_number() {
        Sample sample = new Sample();
        int numb = 3;
        int res = sample.fact(numb);
        Assertions.assertThat(res).isEqualTo(6);
    }

    @Test
    void op_addiction() {
        Sample sample = new Sample();
        int res = sample.op(ADD, 1, 1);
        Assertions.assertThat(res).isEqualTo(2);

    }
    @Test
    void op_addiction_1() {
        Sample sample = new Sample();
        int res = sample.op(ADD, -1, -3);
        Assertions.assertThat(res).isEqualTo(-4);
    }

    @Test
    void op_mul() {
        Sample sample = new Sample();
        int res = sample.op(MULT, -1, -3);
        Assertions.assertThat(res).isEqualTo(3);
    }

    @Test
    void op_mul_1() {
        Sample sample = new Sample();
        int res = sample.op(MULT, 4, 3);
        Assertions.assertThat(res).isEqualTo(12);
    }


}


