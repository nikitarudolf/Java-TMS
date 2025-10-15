package lesson6;

class CreditCard {

    private final int accountNumber;
    private int creditsAmount;

    public CreditCard(int number, int initialAmount) {
        this.accountNumber = number;
        this.creditsAmount = initialAmount;
    }

    public void addCredits(int a) {
        if(a>0) {
            this.creditsAmount += a;
            return;
        }
        System.out.println("Неверное значение");
    }

    public void withdrawCredits(int a) {

        if(this.creditsAmount < a) {
            System.out.println("Недостаточно средств");
            return;
        }
        this.creditsAmount -= a;
    }

    public void outputInfo() {
        System.out.println("Номер счета: " + this.accountNumber + "\n" + "Баланс: " + this.creditsAmount);
    }

}
