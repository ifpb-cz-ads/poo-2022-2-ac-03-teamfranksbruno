public class CTExercicio1
{
   public static void main(String[] args) {

        int idade = Integer.parseInt(args[0]);
        String classeEleitoral = "Não pode votar.";

        if (idade > 15) {
          classeEleitoral = "Votar é facultativo.";
        }

        if (idade > 17 && idade < 66) {
          classeEleitoral = "Votar é obrigatório.";
        }

    System.out.println(classeEleitoral);
  }
}
