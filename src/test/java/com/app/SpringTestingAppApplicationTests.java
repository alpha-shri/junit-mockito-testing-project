package com.app;

import org.junit.jupiter.api.Disabled;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringTestingAppApplicationTests {

	private Calculator calculator = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void testSum() {

		// Actual result
		int expectedResult = 22;

		// Actual result
		int actualResult = calculator.sum(10, 12);

		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	// @Disabled // skip any test-case
	void testProduct() {

		int expected = 15;

		int actual = calculator.product(5, 3);

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	void testCompare() {

		boolean actual = calculator.compare(3, 5);

		assertThat(actual).isTrue();
	}

}
