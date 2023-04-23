import enumTipo.EnumEmprego;
import java.util.Scanner;
import model.Resposta;

public class Emprego {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Resposta resp = new Resposta();

    System.out.printf("Olá, meu nome é: %s", resp.getNome() + "\n\n");
    System.out.println(
      "Busco uma nova oportunidade de emprego para o cargo de: " +
      EnumEmprego.DEVJUNIOR +
      "\n"
    );

    System.out.printf("Essas são minhas habilidades: \n");
    for (String habilidade : resp.getHabilidades()) {
      System.out.println(habilidade);
    }
    System.out.println();

    System.out.printf(
      "E esse é o link do meu repositório: %s",
      resp.getLink() + "\n\n"
    );

    resp.contratar();
    sc.close();
  }
}
