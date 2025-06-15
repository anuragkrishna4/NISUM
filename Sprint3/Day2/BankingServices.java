class InvalidAccountNumberException extends Exception {
    public InvalidAccountNumberException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class BankingServices {
    private String accountNumber;
    private double balance;

    public BankingServices(String accountNumber, double initialBalance) throws InvalidAccountNumberException {
        validateAccountNumber(accountNumber);
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    private void validateAccountNumber(String accNumber) throws InvalidAccountNumberException {
        if (accNumber == null) {
            throw new InvalidAccountNumberException("Account number cannot be null");
        }
        if (accNumber.length() != 10) {
            throw new InvalidAccountNumberException("Account number must be exactly 10 digits");
        }
        
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        try {
            BankingServices bankAccount = new BankingServices("1234567890", 1000.0);
            System.out.println("Initial balance: $" + bankAccount.getBalance());
            
            bankAccount.deposit(500.0);
            System.out.println("Balance after deposit: $" + bankAccount.getBalance());
            
            bankAccount.deposit(-200.0);
        } catch (InvalidAccountNumberException | InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}