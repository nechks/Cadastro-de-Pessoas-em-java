
public class CadPessoas {

    public static void bolha(Pessoas[] v) {
        int fim = v.length - 1;
        while (fim > -0) {
            for (int j = 0; j < fim; j++) {
                if (v[j].idade < v[j + 1].idade) {
                    Pessoas aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
            fim--;
        }
    }

    public static void main(String[] args) {

        Pessoas[] pessoas = {
                new Pessoas("Junio", 23),
                new Pessoas("Maria da Penha", 43),
                new Pessoas("Mathues Breno Souza", 16),
                new Pessoas("Lion Martins", 21),
                new Pessoas("Thiago Luiz", 35)
        };

        // Arrays.sort(pessoas, Comparator.comparingInt((Pessoas p) ->
        // p.idade).reversed());

       // for (Pessoas pessoa : pessoas) {
       //System.out.println(pessoa.pessoa + ", " + pessoa.idade);
       // }

        bolha(pessoas);

        for (Pessoas pessoa : pessoas) {
            System.out.println(pessoa.nome + ", " + pessoa.idade);
        }

    }

}
