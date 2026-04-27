package com.jojoldu.book.springboot.web.practice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorDtoTest {

    @Test

    public void add_메서드_검증() {

        // given

        CalculatorDto dto = CalculatorDto.builder()

                .a(10)

                .b(3)

                .build();

        // when

        int result = dto.add();

        // then
        assertThat(result).isEqualTo(13);

    }

    @Test
    public void subtract_메서드_검증() {
        CalculatorDto dto = CalculatorDto.builder()
                .a(10)
                .b(3)
                .build();

        int result = dto.subtract();

        assertThat(result).isEqualTo(7);
    }

}
