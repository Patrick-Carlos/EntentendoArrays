package NivelBasico;

public class Array {

    public static void main(String[] args) {
        //Um array do tipo String quando tem um espaço sem nada indexado
        // retorna null
        String[] personagens = new String[7];  // Isso é um objeto de memória
        personagens[0] = "Goku";
        personagens[1] = "Vegeta";
        personagens[2] = "Gohan";
        personagens[3] = "Piccolo";
        personagens[4] = "Krillin";
        System.out.println(personagens[6]);

        //Se for do tipo int ele retorna 0
        int[] idade = new int[2];
        System.out.println(idade[0]);

        //Se for do tipo double ele retorna 0.0
        double[] altura = new double[2];
        System.out.println(altura[0]);

        //Se for do tipo boolean retorna false
        boolean[] verdadeiroOuFalso = new boolean[2];
        System.out.println(verdadeiroOuFalso[0]);

        //Se for do tipo float retorna 0.0
        float[] peso = new float[2];
        System.out.println(peso[0]);

        //Se for do tipo char retorna um espaço em branco
        char[] masculinoOuFeminino = new char[2];
        System.out.println(masculinoOuFeminino[0]);

        // Redeclarar variavel
        String nomeNinja = "Naruto";
        nomeNinja = "Boruto";
        System.out.println(nomeNinja);

        // Redeclarar ARRAY
        personagens = new String[7]; // sobrescreveu  o primeiro array e perdemos os dados anteriores. (IRRECUPERAVEL)
        personagens[0] = "Naruto";
        personagens[1] = "Sasuke";
        personagens[2] = "Sakura";
        personagens[3] = "Kakashi";
        personagens[4] = "Hinata";
        personagens[5] = "Sakura";
        personagens[6] = "Sasuke";
        System.out.println(personagens[2]);

        // Mostrar a lista completa do Array
        // Utilizamos um for para mostrar todo o array

        for (int i = 0; i < 7 ; i++) { //Printa todos os nomes até chegar na posição 7
            System.out.println(personagens[i]);
        }



    }
}
