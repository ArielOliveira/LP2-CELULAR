public class Credit {
  private int credits;
  
  public Credit() {
    this.credits = 0;
  }

  public Credit(int credits) {
    if (credits > 0) {
      this.credits = credits;  
    } else {
      System.out.println("Valor de inicialização inválido!");
      this.credits = 0;
    }
  }

  public void setCredits(int credits) {
    this.credits = credits;
  } 

  public int getCredits() {
    return credits;
  }

  public void topUp(int value) {
    if (value > 0) {
      credits = credits + value;
    } else {
      System.out.println("topUp foi chamado com um valor negativo: " + value);
    }
  }

  public void consume(int value) {
    if (value <= credits) {
      credits = credits - value;
    } else {
      System.out.println("Você não tem saldo o suficiente para essa operação!");
    }
  }

  public void creditCharge(int charge) {
    if (charge > 0) {
    }
  } 
 
  public static void main (String[] args) {
     Credit c = new Credit(-1); 
     System.out.println(c.getCredits());
  }
}
