
public class Main {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("João", 25, "123.456.789-00");
    Pessoa pessoa2 = new Pessoa("Maria", 15, "987.654.321-00");
    Pessoa pessoa3 = new Pessoa("João", 25, "123.456.789-00");

    System.out.println("A pessoa 1 é igual a pessoa 2? " + pessoa1.equals(pessoa2));
    System.out.println("A pessoa 1 é igual a pessoa 3? " + pessoa1.equals(pessoa3));
  }
}