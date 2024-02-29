package introducao;

public class TiposPrimitivos {
  public static void main(String[] args) {
    // int, long, byte, short, double, float, boolean, char

    int number = 10;
    long numberInLong = 100000;
    byte numberInByte = 10;
    short numberInShort = 10;
    double salaryInDouble = 2000;
    float salaryInFloat = 2000;
    boolean trueOrFalse = true | false;
    char word = 'A';

    System.out.println("O número é " + number);
    System.out.println("O número longo é " + numberInLong);
    System.out.println("O salário em double é " + salaryInDouble);
    System.out.println("O salário em float é " + salaryInFloat);
    System.out.println("O número em byte é " + numberInByte);
    System.out.println("O número em short é " + numberInShort);
    System.out.println("O valor booleano é " + trueOrFalse);
    System.out.println("A letra é " + word);
  }
}