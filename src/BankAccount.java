import java.math.BigDecimal;

public class BankAccount {
    double balance;
    long accountNumber = -1;
   private AccountOwner accountOwner;

    public BankAccount(AccountOwner accountOwner, double balance) {
        this.accountOwner = accountOwner;
        this.balance = balance;
        this.accountNumber = setaccountNumber();
    }
public int deposit(double amount) {
        if (amount <= 0) {
            return 2;
        } else {
            balance += amount;
            return 1;
        }
}

public int withdraw(double amount) {
        if (amount <= 0) {
            return 2;
        }
        if (amount > balance) {
            return 3;
        } else {
            balance -= amount;
            return 1;
        }
}

public int transfer(long account, double amount) {
        if(ATM.lookup(account) == null) {
            return 4;
        } else if (amount < 0) {
            return 2;
        } else if (amount > this.balance) {
            return 3;
        }
        this.withdraw(amount);
       ATM.lookup(account).deposit(amount);
        return 1;
}
public String getMaskedAccountNumber(){
        long acc = accountNumber;
        String number = String.valueOf(acc);
        String masked = "";
        for (int i = 0; i < number.length() - 4; i++) {
            masked += "*";
        }
        masked += number.substring(number.length()-4, number.length());
return masked;
}
public java.lang.String getFormattedBalance() {
        String balaceOut = String.format("$%,.02f", balance);
        return balaceOut;
}
public BigDecimal validateBalance(double balance) {
        if (balance <= 0) {
            return BigDecimal.ZERO;
        } else {
            return BigDecimal.valueOf(balance);
        }
}
public long getAccountNumber() {
        return this.accountNumber;
}
public AccountOwner getAccountOwner() {
        return this.accountOwner;
}
public void setAccountOwner(AccountOwner accountOwner) {
        if (accountOwner != null) {
            this.accountOwner = accountOwner;
        }
}
public BigDecimal getBalance() {
        return BigDecimal.valueOf(this.balance);
}
public long setaccountNumber() {
        long acute;
        while (true) {
            acute = (long) (Math.random() * Math.pow(10, 9));
            BankAccount po = ATM.lookup(acute);
            if(po == null) {
                return acute;
            }
        }
}
}

