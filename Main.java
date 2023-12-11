public class Main {
    public static void main(String[] args) {
        try {
            Account account = new Account(100.0);
            System.out.println("Начальный баланс: " + account.getBalance());

            account.deposit(50.0);
            System.out.println("Баланс после депозита: " + account.getBalance());

            account.withdraw(20.0);
            System.out.println("Баланс после снятия: " + account.getBalance());

            account.withdraw(200.0); // Превышение баланса
            System.out.println("Эта строка не будет выполнена");
        } catch (IllegalArgumentException ex) {
            System.out.println("Ошибка: " + ex.getMessage());
        } catch (InsufficientFundsException ex) {
            System.out.println("Ошибка: " + ex.getMessage());
        }
    }
}


