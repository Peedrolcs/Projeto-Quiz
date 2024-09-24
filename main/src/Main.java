public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------------");

        //Nome da Faculdade
        System.out.println("Faculdade: Centro Universitario Alfredo Nacer");
        //Nome do aluno
        System.out.println("Aluno: Pedro Lucas Ramos Pereira");
        //Nome do professor
        System.out.println("Professor: Brenno Pimenta");
        //Fraze de boas vindas
        System.out.println("Seja Bem-vindo(a)!");
        //Dizendo que será respondido 15 perguntas sobre Velozes e Furiosos
        System.out.println("Aproveite o desafio! São 15 questões com alternativas de multipla escolha.");

        System.out.println("-----------------------------------------------------------------");
//
//

        Questao q1 = new Questao();
        q1.pergunta = "01 - Qual filme da franquia Velozes e Furiosos foi gravado um roubo de cofre?";
        q1.opcaoA = "A) Velozes e furiosos 5";
        q1.opcaoB = "B) Velozes e furiosos: Hobbs & Shaw";
        q1.opcaoC = "C) Velozes e furiosos ";
        q1.opcaoD = "D) Velozes e furiosos 7";
        q1.opcaoE = "E) Velozes e furiosos 8";
        q1.correta = "A";

        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();
        q1.isCorreta(resposta);

//
        Questao q2 = new Questao();
        q2.pergunta = "02 - Qual foi o ultimo filme lançado?";
        q2.opcaoA = "A) Velozes e furiosos 9";
        q2.opcaoB = "B) Velozes e furiosos: Hobbs & Shaw";
        q2.opcaoC = "C) +Velozes +furiosos ";
        q2.opcaoD = "D) Velozes e furiosos 10 (X)";
        q2.opcaoE = "E) Velozes e furiosos 7";
        q2.correta = "D";

        q2.escrevaQuestao();
        resposta = q2.leiaResposta();
        q2.isCorreta(resposta);

//
        Questao q3 = new Questao();
        q3.pergunta = "03 - Qual carro que o Brian usou na primeira corrida do filme +Velozes +Furiosos";
        q3.opcaoA = "A) Toyota Supra";
        q3.opcaoB = "B) Lancer Evo";
        q3.opcaoC = "C) Nissan Skyline GTR R34";
        q3.opcaoD = "D) Madza RX-7";
        q3.opcaoE = "E) Dodge Viper";
        q3.correta = "C";

        q3.escrevaQuestao();
        resposta = q3.leiaResposta();
        q3.isCorreta(resposta);


//
        Questao q4 = new Questao();
        q4.pergunta = "04 - Em qual filme a letty supostamente morre?";
        q4.opcaoA = "A) Velozes e furiosos 5";
        q4.opcaoB = "B) Velozes e furiosos Desafio em Tokyo";
        q4.opcaoC = "C) Velozes e furiosos 4";
        q4.opcaoD = "D) Velozes e furiosos Hobbs & Shaw";
        q4.opcaoE = "E) Velozes e furiosos 9";
        q4.correta = "C";

        q4.escrevaQuestao();
        resposta = q4.leiaResposta();
        q4.isCorreta(resposta);


//
        Questao q5 = new Questao();
        q5.pergunta = "05 - Qual carro mais lento que o Brian dirigiu de todos que ele tinha?";
        q5.opcaoA = "A) Nissan Skyline R34";
        q5.opcaoB = "B) Mine van";
        q5.opcaoC = "C) Dodge Charger";
        q5.opcaoD = "D) Toyota supra";
        q5.opcaoE = "E) Lancer evo";
        q5.correta = "B";

        q5.escrevaQuestao();
        resposta = q5.leiaResposta();
        q5.isCorreta(resposta);
//
        Questao q6 = new Questao();
        q6.pergunta = "06 - Qual o primeiro nome do Toretto?";
        q6.opcaoA = "A) Marco";
        q6.opcaoB = "B) Braga";
        q6.opcaoC = "C) O'conner";
        q6.opcaoD = "D) Carter";
        q6.opcaoE = "E) Dominic";
        q6.correta = "E";

        q6.escrevaQuestao();
        resposta = q6.leiaResposta();
        q6.isCorreta(resposta);
//
        Questao q7 = new Questao();
        q7.pergunta = "07 - Quem supostamente matou a letty?";
        q7.opcaoA = "A) Marco";
        q7.opcaoB = "B) Braga";
        q7.opcaoC = "C) Fenix";
        q7.opcaoD = "D) Hobbs";
        q7.opcaoE = "E) Carter";
        q7.correta = "C";

        q7.escrevaQuestao();
        resposta = q7.leiaResposta();
        q7.isCorreta(resposta);
//
        Questao q8 = new Questao();
        q8.pergunta = "08 - Qual o segundo nome do Brian?";
        q8.opcaoA = "A) Smith";
        q8.opcaoB = "B) Braga";
        q8.opcaoC = "C) O'conner";
        q8.opcaoD = "D) Carter";
        q8.opcaoE = "E) Dominic";
        q8.correta = "C";

        q8.escrevaQuestao();
        resposta = q8.leiaResposta();
        q8.isCorreta(resposta);
//
        Questao q9 = new Questao();
        q9.pergunta = "09 - Como se chama o filho do Toretto?";
        q9.opcaoA = "A) Brian";
        q9.opcaoB = "B) Dominic";
        q9.opcaoC = "C) Tej";
        q9.opcaoD = "D) Roman";
        q9.opcaoE = "E) Jakob";
        q9.correta = "A";

        q9.escrevaQuestao();
        resposta = q9.leiaResposta();
        q9.isCorreta(resposta);
//
        Questao q10 = new Questao();
        q10.pergunta = "10 - Qual o nome da hacker do avião?";
        q10.opcaoA = "A) Mia";
        q10.opcaoB = "B) Cipher";
        q10.opcaoC = "C) Letty";
        q10.opcaoD = "D) Ramsey";
        q10.opcaoE = "E) Leysa";
        q10.correta = "B";

        q10.escrevaQuestao();
        resposta = q10.leiaResposta();
        q10.isCorreta(resposta);
//
        Questao q11 = new Questao();
        q11.pergunta = "11 - Quem organizava as corridas nos primeiros filmes?";
        q11.opcaoA = "A) Roman";
        q11.opcaoB = "B) Biran";
        q11.opcaoC = "C) Marco";
        q11.opcaoD = "D) Jakob";
        q11.opcaoE = "E) Tej";
        q11.correta = "E";

        q11.escrevaQuestao();
        resposta = q11.leiaResposta();
        q11.isCorreta(resposta);
//
        Questao q12 = new Questao();
        q12.pergunta = "12 - Quem que tem mais labia e entra e sai de qualquer lugar?";
        q12.opcaoA = "A) Tej";
        q12.opcaoB = "B) Toretto";
        q12.opcaoC = "C) Roman";
        q12.opcaoD = "D) Han";
        q12.opcaoE = "E) Vinc";
        q12.correta = "C";

        q12.escrevaQuestao();
        resposta = q12.leiaResposta();
        q12.isCorreta(resposta);
//
        Questao q13 = new Questao();
        q13.pergunta = "13 - Em qual filme Toretto foi preso?";
        q13.opcaoA = "A) Velozes e Furiosos 5";
        q13.opcaoB = "B) Velozes e Furiosos 4";
        q13.opcaoC = "C) Velozes e Furiosos 9";
        q13.opcaoD = "D) Velozes e Furiosos 8";
        q13.opcaoE = "E) Velozes e Furiosos 7";
        q13.correta = "B";

        q13.escrevaQuestao();
        resposta = q13.leiaResposta();
        q13.isCorreta(resposta);
//
        Questao q14 = new Questao();
        q14.pergunta = "14 - Quem tinha ciumes do Brian com a mia?";
        q14.opcaoA = "A) Vinc";
        q14.opcaoB = "B) Tej";
        q14.opcaoC = "C) Letty";
        q14.opcaoD = "D) Roman";
        q14.opcaoE = "E) Toretto";
        q14.correta = "A";

        q14.escrevaQuestao();
        resposta = q14.leiaResposta();
        q14.isCorreta(resposta);
//
        Questao q15 = new Questao();
        q15.pergunta = "15 - Em qual filme da franquia Toretto e resgatado do onibus da penitencaria?";
        q15.opcaoA = "A) Velozes e furiosos 8";
        q15.opcaoB = "B) Velozes e furiosos 7";
        q15.opcaoC = "C) Veloses e furiosos 9";
        q15.opcaoD = "D) Velozes e furiosos 10";
        q15.opcaoE = "E) Velozes e furiosos 5";
        q15.correta = "E";

        q15.escrevaQuestao();
        resposta = q15.leiaResposta();
        q15.isCorreta(resposta);
//

    }
}