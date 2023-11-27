package christmas.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BadgeTest {

    private Badge badge = new Badge();


    @ParameterizedTest
    @DisplayName("badgeTest")
    @MethodSource("badgePriceAndResult")
    void badgeFind(int totalPrice, String result) {

        Assertions.assertThat(badge.badgeFind(totalPrice)).
            isEqualTo(result);

    }

    static Stream<Arguments> badgePriceAndResult() {
        return Stream.of(
            Arguments.arguments(20000, "산타"),
            Arguments.arguments(10000, "트리"),
            Arguments.arguments(5000, "별"),
            Arguments.arguments(3000, "없음")
        );
    }
}