package christmas.service;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SeperateServiceTest {

    private SeperateService seperateService = new SeperateService();

    @ParameterizedTest
    @DisplayName("올바른 입력 값 테스트")
    @ValueSource(strings = {"레드와인--1", "해산물파스타--3,,초코케이크-1","레드와인-1,샴페인-1"})
    void convertMenuInputToMenus(String menus) {
        Assertions.assertThatThrownBy(() -> seperateService.convertMenuInputToMenus(menus)).isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("[ERROR]");
    }
}