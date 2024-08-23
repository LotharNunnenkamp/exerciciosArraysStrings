import java.util.Arrays;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {

        System.out.println(exercicio1(158));

        System.out.println(exercicio2("amor"));

        System.out.println(exercicio3(new int[]{1,1,2,3,2,5,5,5,4,4,10,10}));

        System.out.println(exercicio4(new double[]{2.5, 3.2, 4.5, 5, 6}));

        System.out.println(exercicio5("kaka"));

        System.out.println(Arrays.toString(exercicio6(new String[]{"as", "mas", "amor", "amoreco"})));

        System.out.println(Arrays.toString(exercicio7("carro")));
    }

    static int exercicio1(int input) {

        if (input <= 0) {
            return -1;
        }
        String inputString = Integer.toString(input);
        int soma = 0;
        char c;
        for (int i = 0; i < inputString.length(); i++) {
            c = inputString.charAt(i);
            int cInt = Integer.parseInt(String.valueOf(c));
            soma += cInt;
        }
        return soma;
    }

    static String[] exercicio2(String palavra) {

        String[] resultado = palavra.split("");

        return resultado;
    }

    static int exercicio3(int[] input){

        int resposta = 0;
        for (int numero : input) {
            int contagem = 0;
            for (int numeroComparacao : input) {
                if (numero == numeroComparacao) {
                    contagem++;
                }
            }
            if (contagem == 1) {
                resposta = numero;
                break;
            }
        }
        if (resposta == 0) {
            return -1;
        }
        return resposta;
        
    }

    static boolean exercicio4(double[] input){

        boolean existeValorRepetido = false;
        for(double i : input) {
            int numeroValoresRepetidos = 0;

            for(double j : input) {
                if (i==j) {
                    numeroValoresRepetidos++;
                }
            }
            if (numeroValoresRepetidos > 1) {
                existeValorRepetido = true;
            }
        }
        return existeValorRepetido;
    }

    static int exercicio5(String input) {

        String arrayInput[] = input.split("");
        int indice = -1;
        int indiceAntesDoNumero = -1;
        for (int i = 0; i < arrayInput.length ; i++) {
            indice = input.indexOf(arrayInput[i], i+1);
            if (indice == -1) {
                indiceAntesDoNumero = input.indexOf(arrayInput[i]);
                if (indiceAntesDoNumero == i){
                    return input.indexOf(arrayInput[i]);
                }
            }
        }
        return -1;
    }

    static String[] exercicio6(String[] input) {

        String substringsPresentes = " ";

        for (int i = 0; i < input.length; i++) {
            String primeiraString = input[i];
            for (int j = 0; j < input.length; j++){
                if (i != j) {
                    if (input[j].contains(primeiraString) && !substringsPresentes.contains(" "+primeiraString+" ")){
                        substringsPresentes += primeiraString + " ";
                    }
                }
            }
        }
        if (substringsPresentes.equals(" ")) {
            return new String[]{};
        }

        String substringsPresentesFormatadas = substringsPresentes.substring(1);
        String[] resultado = substringsPresentesFormatadas.split(" ");
        return resultado;
    }

    static String[] exercicio7(String input){

        int tamanhoString = input.length();
        String[] resultado = new String[tamanhoString];
        String[] arrayInput = input.split("");
        int j = 0;
        for (int i = arrayInput.length-1; i>-1 ; i--) {
            resultado[j] = arrayInput[i];
            j++;
        }
        return resultado;
    }
}
