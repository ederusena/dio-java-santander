public class Conta {
  private int numberAccount;
  private int agency;
  private String client;
  private double balance;

  public Conta(int numberAccount, int agency, String client, double balance) {
    this.numberAccount = numberAccount;
    this.agency = agency;
    this.client = client;
    this.balance = balance;
  }

  public void welcome() {
    String mensagem = String.format(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.",
        this.client, this.agency, this.numberAccount, this.balance);

    System.out.println(mensagem);
  }

  public int getNumberAccount() {
    return numberAccount;
  }

  public void setNumberAccount(int numberAccount) {
    this.numberAccount = numberAccount;
  }

  public int getAgency() {
    return agency;
  }

  public void setAgency(int agency) {
    this.agency = agency;
  }

  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

}
