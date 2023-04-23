package model;

import java.util.Scanner;

public class Resposta {

  Scanner sc = new Scanner(System.in);

  //#region Atributos
  private String nome = "Gilberto Carvalhal";

  private String[] habilidades = {
    "Java",
    "SpringBoot",
    "API Rest",
    "JavaScript",
    "HTML5",
    "CSS3",
    "SQL",
    "NOSQL",
    "GIT",
    "POSTMAN",
  };

  private String link = "https://www.github.com/GilCarvalhal";

  private String contratar = "";

  //#endregion

  //#region Constructor
  public Resposta() {}

  //#endregion

  //#region Getters & Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String[] getHabilidades() {
    return habilidades;
  }

  public void setHabilidades(String[] habilidades) {
    this.habilidades = habilidades;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getContratar() {
    return contratar;
  }

  public void setContratar(String contratar) {
    this.contratar = contratar;
  }

  //#endregion

  //#region Methods
  public void contratar() {
    do {
      System.out.println(
        "Vai me contratar?" +
        "\n digite Y - para SIM " +
        " digite N - para não \n"
      );
      System.out.println("Não aceito um não como resposta! \n");
      contratar = sc.nextLine();
    } while (
      !contratar.equalsIgnoreCase("Y") &&
      !contratar.equalsIgnoreCase("S") &&
      !contratar.equalsIgnoreCase("YES") &&
      !contratar.equalsIgnoreCase("YES!") &&
      !contratar.equalsIgnoreCase("SIM") &&
      !contratar.equalsIgnoreCase("SIM!") &&
      !contratar.equalsIgnoreCase("YES.") &&
      !contratar.equalsIgnoreCase("SIM.")
    );
    System.out.println("Fizeram a melhor escolha!");
  }
  //#endregion
}
