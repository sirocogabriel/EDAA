package prova.A1;

public class Ativ2 {

    public class Aluno {
        String nome;
        int matricula;
        String curso;
    }

    public class Alunos {
        //Questão A
        Aluno[] alunos;
        int tam = 0;

        //Construtor
        Alunos (int tam) {
            alunos = new Aluno[tam];
            this.tam = tam;
        }
        
        //Questão B
        public Aluno[] B () {
            Aluno aluno = new Aluno();
            aluno.nome = "Eu sou um aluninho";
            aluno.matricula = 40028922;
            aluno.curso = "O Curso";
            
            for (int i = 0; i < this.tam; i++) {
                if(alunos[i] == null){
                    alunos[i] = aluno;
                }
            }

            return alunos;
        }
    
        //Questão C
        public Aluno[] C (int matricula) { 
            for (int i = 0; i < this.tam; i++) {
                if (alunos[i] != null && alunos[i].matricula == matricula) {
                    alunos[i] = null;
                }
            }

            return alunos;
        }
    
        //Questão D
        public int D () {
            int numeroPosicoesVazias = 0;
            for (Aluno aluno : alunos) {
                if (aluno == null) {
                    numeroPosicoesVazias++;
                }
            }
            System.out.println(numeroPosicoesVazias);
            return numeroPosicoesVazias;
        }
        
        //Questão E
        public Aluno[] E () {
            Aluno aluno = new Aluno();
            aluno.nome = "Eu sou outro aluninho";
            aluno.matricula = 40028922;
            aluno.curso = "Outro Curso";
            
            if(alunos[tam-1] != null){
                var alunosClone = new Aluno[tam+5];

                for (int i = 0; i < this.tam; i++) {
                    alunosClone[i] = alunos[i];
                }

                alunosClone[tam] = aluno;
                tam = tam + 5;

            }else {
                for (int i = 0; i < tam; i++) {
                    if (alunos[i] == null){
                        alunos[i] = aluno;
                    }
                }
            }

            return alunos;
        }
        
        //Questão F
        public Aluno[] F () {
            Aluno aluno = new Aluno();
            aluno.nome = "Eu sou um aluninho";
            aluno.matricula = 40028922;
            aluno.curso = "O Curso";
            
            for (int i = 0; i < this.tam; i++) {
                if(alunos[i] == null){
                    alunos[i] = aluno;
                }
            }

            return alunos;
        }
    
        //Questão G
        public Aluno[] G () {
            Aluno aluno = new Aluno();
            aluno.nome = "Eu sou um aluninho";
            aluno.matricula = 40028922;
            aluno.curso = "O Curso";
            
            for (int i = 0; i < this.tam - 1; i++) {
                alunos[i+1] = alunos[i];
            }

            alunos[0] = aluno;

            return alunos;
        }

    }
}