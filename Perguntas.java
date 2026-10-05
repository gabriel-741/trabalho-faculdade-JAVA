public class Perguntas {

    public static void main(String[] args){

        Cabecalho.escrevaCabecalho();

        Questao[] questoes = new Questao[15];

        // pergunta 1 

        questoes[0] = new Questao();
        questoes[0].pergunta = "1. qual linguagem de programacao é conhecida por ultilizar a JVM";
        questoes[0].opcaoA = "A - Python";
        questoes[0].opcaoB = "B - Java";
        questoes[0].opcaoC = "C - HTML";
        questoes[0].opcaoD = "D - SQL";
        questoes[0].opcaoE = "E - CSS";
        questoes[0].correta = "B";
    
    

    // questao 2
        questoes[1] = new Questao();
        questoes[1].pergunta = "2. Qual estrutura é utilizada para armazenar vários valores em Java?";
        questoes[1].opcaoA = "A - Array";
        questoes[1].opcaoB = "B -  Scanner";
        questoes[1].opcaoC = "C - System";
        questoes[1].opcaoD = "D - String";
        questoes[1].opcaoE = "E - Boolean";
        questoes[1].correta = "A";

        // questao 3
        questoes[2] = new Questao();
        questoes[2].pergunta = "3. Qual palavra-chave é utilizada para criar um objeto em Java?";
        questoes[2].opcaoA = "A - class";
        questoes[2].opcaoB = "B -  object";
        questoes[2].opcaoC = "C - new";
        questoes[2].opcaoD = "D - create";
        questoes[2].opcaoE = "E - instance";
        questoes[2].correta = "C";

        // questao 4
        questoes[3] = new Questao();
        questoes[3].pergunta = "4. Qual método é utilizado como ponto de entrada de um programa Java?";
        questoes[3].opcaoA = "A - start()";
        questoes[3].opcaoB = "B -  run()";
        questoes[3].opcaoC = "C - execute()";
        questoes[3].opcaoD = "D - main()";
        questoes[3].opcaoE = "E - begin()";
        questoes[3].correta = "D";

        // questao 5
        questoes[4] = new Questao();
        questoes[4].pergunta = "5. Qual tipo de dado armazena valores verdadeiro ou falso?";
        questoes[4].opcaoA = "A - int";
        questoes[4].opcaoB = "B -  String";
        questoes[4].opcaoC = "C - double";
        questoes[4].opcaoD = "D - char";
        questoes[4].opcaoE = "E - boolean";
        questoes[4].correta = "E";

        // questao 6
        questoes[5] = new Questao();
        questoes[5].pergunta = "6. Qual comando é utilizado para imprimir informações no console em Java?";
        questoes[5].opcaoA = "A - Console.write()";
        questoes[5].opcaoB = "B -  System.out.println()";
        questoes[5].opcaoC = "C - Print.console()";
        questoes[5].opcaoD = "D - Java.print()";
        questoes[5].opcaoE = "E - System.printConsole()";
        questoes[5].correta = "B";

        // questao 7
        questoes[6] = new Questao();
        questoes[6].pergunta = "7. Qual banco de dados utiliza a linguagem SQL?";
        questoes[6].opcaoA = "A - MySQL";
        questoes[6].opcaoB = "B -  Photoshop";
        questoes[6].opcaoC = "C - Git";
        questoes[6].opcaoD = "D - Docker";
        questoes[6].opcaoE = "E - Linux";
        questoes[6].correta = "A";

        // questao 8
        questoes[7] = new Questao();
        questoes[7].pergunta = "8. O que significa a sigla API?";
        questoes[7].opcaoA = "A - Application Programming Interface";
        questoes[7].opcaoB = "B -  Advanced Program Internet";
        questoes[7].opcaoC = "C - Application Process Integration";
        questoes[7].opcaoD = "D - Automatic Programming Interface";
        questoes[7].opcaoE = "E - Advanced Programming Internet";
        questoes[7].correta = "A";

        // questao 9
        questoes[8] = new Questao();
        questoes[8].pergunta = "9. Qual ferramenta é utilizada para controle de versão?";
        questoes[8].opcaoA = "A - Docker";
        questoes[8].opcaoB = "B -  Git";
        questoes[8].opcaoC = "C - MySQL";
        questoes[8].opcaoD = "D - Maven";
        questoes[8].opcaoE = "E - Linux";
        questoes[8].correta = "B";

        // questao 10
        questoes[9] = new Questao();
        questoes[9].pergunta = "10. Qual destes é um sistema operacional?";
        questoes[9].opcaoA = "A - GitHub";
        questoes[9].opcaoB = "B -  Java";
        questoes[9].opcaoC = "C - Linux";
        questoes[9].opcaoD = "D - MySQL";
        questoes[9].opcaoE = "E - Python";
        questoes[9].correta = "C";

        // questao 11
        questoes[10] = new Questao();
        questoes[10].pergunta = "11. Qual símbolo representa uma divisão em Java?";
        questoes[10].opcaoA = "A - +";
        questoes[10].opcaoB = "B -  -";
        questoes[10].opcaoC = "C - *";
        questoes[10].opcaoD = "D - /";
        questoes[10].opcaoE = "E - %";
        questoes[10].correta = "D";

        // questao 12
        questoes[11] = new Questao();
        questoes[11].pergunta = "12. Qual palavra-chave define uma classe em Java?";
        questoes[11].opcaoA = "A - object";
        questoes[11].opcaoB = "B -  class";
        questoes[11].opcaoC = "C - define";
        questoes[11].opcaoD = "D - structure";
        questoes[11].opcaoE = "E - type";
        questoes[11].correta = "B";

        // questao 13
        questoes[12] = new Questao();
        questoes[12].pergunta = "13. Qual destas opções representa um tipo inteiro em Java?";
        questoes[12].opcaoA = "A - String";
        questoes[12].opcaoB = "B -  boolean";
        questoes[12].opcaoC = "C - int";
        questoes[12].opcaoD = "D - double";
        questoes[12].opcaoE = "E - char";
        questoes[12].correta = "C";

        // questao 14
        questoes[13] = new Questao();
        questoes[13].pergunta = "14. Qual tecnologia é utilizada para criar containers?";
        questoes[13].opcaoA = "A - Docker";
        questoes[13].opcaoB = "B -  Git";
        questoes[13].opcaoC = "C - Java";
        questoes[13].opcaoD = "D - MySQL";
        questoes[13].opcaoE = "E - HTML";
        questoes[13].correta = "A";

        // questao 15
        questoes[14] = new Questao();
        questoes[14].pergunta = "15. Qual extensão normalmente identifica um arquivo Java?";
        questoes[14].opcaoA = "A - .py";
        questoes[14].opcaoB = "B -  .html";
        questoes[14].opcaoC = "C - .js";
        questoes[14].opcaoD = "D - .java";
        questoes[14].opcaoE = "E - .sql";
        questoes[14].correta = "D";


        int acertos = 0;

        System.out.println("Iniciando QUIZ");
        System.out.println();

        for (Questao questao : questoes) {

            questao.escrevaQuestao();

            String resposta = questao.leiaResposta();

            if (questao.isCorreta(resposta)){
                acertos++;

            }
        } 

        System.out.println("");

        System.out.println("RESULTADO");
        System.out.println("");

        System.out.println("Você acertou " + acertos + " de 15 questões.");
        System.out.println("Nota: " + (acertos * 10.0 / 15));

        System.out.println("");


        }
    }

