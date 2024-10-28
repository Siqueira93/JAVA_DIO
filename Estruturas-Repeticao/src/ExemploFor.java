public class ExemploFor {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE" , "JONAS" , "JULIA" , "MARCOS" };
       //   BLOCO DE INCIALIZACAO ; EXPRESSÃO BOOLEANA DE VALIDAÇÃO ; BLOCO DE ATUALIZAÇÃO      
       // EXPRESSÃO BOOLEANA DE VALIDAÇÃO: executa o comando FOR até que seja false assim para a execução 
       // BLOCO DE ATUALIZAÇÃO: fazemos o poderoso contador, que seria a mesma cooisa que x = x+1, sendo assim sempre vai somar +1 ou ++
        for (int x = 0; x < alunos.length; x ++) {
            // nesse exemplo mesmo estamos determinando que x não poderá ser maior que o tamanho total da lista de alunos 
            System.out.println("O aluno no indice: " + x + " é " + alunos[x]);
        }

        System.out.println("imprima o aluno no indice 2 " + alunos[2]);
        
    }
}
