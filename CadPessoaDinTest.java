import java.util.Scanner;

public class CadPessoaDinTest {
   
    public static void dados(Pessoas[] v) {
        int fim = v.length - 1;
        while (fim >- 0) {
            for (int j = 0; j < fim; j++) {
                if (v[j].idade > v[j + 1].idade) {
                    Pessoas aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
            fim--;
        }
    }

    public static Pessoas maiorIdade(Pessoas[] v){
        
        int indiceMaior= 0;
        for (int i = 1; i < v.length; i++) {
            if (v[indiceMaior].idade < v[i].idade){
                indiceMaior = i;
            }
        }
        return v [indiceMaior];

    }

    public static Pessoas menorIdade(Pessoas[] v){
        int indiceMenor = 0;
        for (int i = 0; i < v.length; i++){
            if (v [indiceMenor].idade > v[i].idade) {
                indiceMenor = i;
                
            }
        }
        return v [indiceMenor];
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos pessoas iram se cadastrar: ");
        int qPessoas = scan.nextInt();
        Pessoas [] pessoas = new Pessoas[qPessoas];

        for (int i = 0; i < pessoas.length; i++){ 
            pessoas[i] = new Pessoas();
            System.out.println("Nome da Pessoa " + (i + 1) + ": ");
            pessoas[i].nome = scan.next();
            System.out.println("Idade da Pessoa " + (i + 1) + ": ");
            pessoas[i].idade = scan.nextInt();

        }

        Pessoas aMMaiorIdade = maiorIdade(pessoas);
        Pessoas aMMenorIdade = menorIdade(pessoas);
        
        System.out.println("Dados da pessoa de maior idade ");
        System.out.println(aMMaiorIdade.nome + ", " + aMMaiorIdade.idade);
        System.out.println("Dados da pessoa de menor idade");
        System.out.println(aMMenorIdade.nome + ", " + aMMenorIdade.idade);
        System.out.println();

        


        dados(pessoas);
        for (Pessoas pessoa : pessoas) {
             System.out.println(pessoa.nome + ", " + pessoa.idade);
        }

        System.out.println();

        
        



        
      
    }

}


