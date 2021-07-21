package Calculadora;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class Calculadora2Test {

    static Calculadora2 calc;

    @BeforeAll
    public static void before() {
        System.out.println("Before ()");
        calc = new Calculadora2();
    }

    @AfterEach
    public void after() {
        System.out.println("After ()");
        calc.clear();
    }


    @Test
    void add() {


    }

    @Test
    void sub() {
    }

    @Test
    void testAdd() {
        System.out.println("add ()");
        int result = calc.add(3,2);
        int expected = 5;
        assertEquals(expected,result);
    }


    @Test
    void testAnsAdd() {
        System.out.println("AnsAdd ()");
        calc.add(3,2);
        int result = calc.getAns();
        int expected = 5;
        assertEquals(expected,result);
    }

    @Test
    void testSub() {
    }

    @Test
    void getAns() {
    }
}