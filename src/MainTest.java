import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    @DisplayName("Exercício 1 - Soma dos algarismos")
    void exercicio1() {
        assertAll(() -> assertEquals(14, Main.exercicio1(158)),
                () -> assertEquals(6, Main.exercicio1(231)),
                () -> assertEquals(-1, Main.exercicio1(0)),
                () -> assertEquals(19, Main.exercicio1(1891)));
    }

    @Test
    @DisplayName("Exercício 2 - String em Array de caracteres")
    void exercicio2() {
        assertAll(() -> assertArrayEquals(new String[]{"a","m","o","r"}, Main.exercicio2("amor")),
                () -> assertArrayEquals(new String[]{"c","a","r","r","o","ç","a"}, Main.exercicio2("carroça")));
    }

    @Test
    @DisplayName("Exercício 3 - Número único")
    void exercicio3() {
        assertAll(() -> assertEquals(10, Main.exercicio3(new int[]{1, 1, 2, 3, 4, 5, 5, 4, 3, 2, 10})),
                () -> assertEquals(10, Main.exercicio3(new int[]{101, 10, 20, 30, 40, 50, 50, 40, 30, 20, 101})),
                () -> assertEquals(-1, Main.exercicio3(new int[]{1, 1, 2, 2, 2, 3, 3})),
                () -> assertEquals(2022, Main.exercicio3(new int[]{2021, 21, 20, 2022, 2021, 21, 20})));
    }

    @Test
    @DisplayName("Exercício 4 - Valores decimais repetidos")
    void exercicio4() {
        assertAll(() -> assertEquals(false, Main.exercicio4(new double[]{2.5, 3.2, 4.5, 5, 6})),
                () -> assertEquals(true, Main.exercicio4(new double[]{2.5, 2.5, 4.5, 6, 6})),
                () -> assertEquals(true, Main.exercicio4(new double[]{2,2,3.1,4,4.1,4.1})));
    }

    @Test
    @DisplayName("Exercício 5 - Primeiro caractere único")
    void exercicio5() {
        assertAll(() -> assertEquals(-1, Main.exercicio5("kaka")),
                () -> assertEquals(9, Main.exercicio5("palalelepipedo")),
                () -> assertEquals(2, Main.exercicio5("saudades")),
                () -> assertEquals(4, Main.exercicio5("fofocalizando")),
                () -> assertEquals(4, Main.exercicio5("papagaio")),
                () -> assertEquals(10, Main.exercicio5("ateiaateiab")));
   }

   @Test
   @DisplayName("Exercício 6 - Pesquisa de substrings")
   void exercicio6() {
        assertArrayEquals(new String[]{"as", "amor"}, Main.exercicio6(new String[]{"as", "mas", "amor", "amoreco"}));
        assertArrayEquals(new String[]{"ca"}, Main.exercicio6(new String[]{"carro","ca", "paz", "pá"}));
        assertArrayEquals(new String[]{"10/10", "10", "11", "11/11", "2010"}, Main.exercicio6(new String[]{"2010/10/10", "2011/11/11", "10/10", "10", "11", "11/11", "2010"}));
        assertArrayEquals(new String[]{"casa", "rodas", "duas"}, Main.exercicio6(new String[]{"minha casas", "casa", "duas rodas", "rodas", "duas"}));
        assertArrayEquals(new String[]{}, Main.exercicio6(new String[]{"terror", "horror", "louvor"}));
        assertArrayEquals(new String[]{"pai", "mae", "ira"}, Main.exercicio6(new String[]{"pai", "mae", "irmao", "ira", "irado", "pai nosso", "santa mae"}));
        assertArrayEquals(new String[]{"gs", "pet", "ts"}, Main.exercicio6(new String[]{"gs", "pets", "cats", "dogs", "pet", "ts"}));
   }

   @Test
   @DisplayName("Exercício 7 - Inverte string e retorna array")
   void exercicio7(){
       assertArrayEquals(new String[]{"r", "o", "m", "a"}, Main.exercicio7("amor"));
       assertArrayEquals(new String[]{"o", "v", "o"}, Main.exercicio7("ovo"));
       assertArrayEquals(new String[]{"a", "ç", "o", "r", "r", "a", "c"}, Main.exercicio7("carroça"));
   }

}



