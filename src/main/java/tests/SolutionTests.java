package tests;

import org.junit.jupiter.api.*;

public class SolutionTests {

    @BeforeAll
    static void preTestova(){
        System.out.println("Start of test\n");
    }


    @BeforeEach
    void setUp() {
        System.out.println("");
    }



    @Test
    public void solution(){
        int a = 9;
        int b = 12;
        a+=3;
        Assertions.assertEquals(a , b);
    }

    @Test
    public void readAndWriteFromFile(){




        System.out.println("druga funkcija");
        int a = 9;
        int b = 12;
        a+=3;
        Assertions.assertEquals(a , b);

    }


    @AfterEach
    void tearDown() {
        System.out.println("outooooo");
    }

    @AfterAll
    static void poslesvih(){
        System.out.println("End of test");
    }

}
