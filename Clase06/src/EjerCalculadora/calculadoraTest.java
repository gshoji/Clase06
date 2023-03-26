package EjerCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class calculadoraTest {
	@Test
	void habitan() {
		calculadora calc=new calculadora();

		Assertions.assertTrue(!calc.tieneHabitantes());

	}

	@Test
	void test() {
		calculadora calc=new calculadora();
		double result=calc.multiplicar(80,3);
		assertEquals(result,240);
	}
	@Test
	void test2() {
		calculadora calc=new calculadora();
		double result=calc.dividir(calc.sumar(150,180),3);
		assertEquals(result,110);
	}

	@Test
	void test3() {
		calculadora calc=new calculadora();
		double result=calc.multiplicar(calc.restar(90, 5), 5);
		assertEquals(result,605);
	}

	@Test
	void test4() {
		calculadora calc=new calculadora();
		double result=calc.multiplicar(calc.sumar(70, 40),25);
		assertEquals(result,2700);
	}


}
