package enumTipo;

public enum EnumEmprego {
  DEVJUNIOR("Desenvolvedor Júnior"),
  DEVPLENO("Desenvolvedor Pleno"),
  DEVSENIOR("Desenvolvedor Sênior");

  private String valor;

  private EnumEmprego(String valor) {
    this.valor = valor;
  }

  public String getValor() {
    return valor;
  }
}
