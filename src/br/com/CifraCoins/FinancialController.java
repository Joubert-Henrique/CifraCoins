package br.com.CifraCoins;

import java.util.ArrayList;
import java.util.List;

public class FinancialController {
    private User user;

    public User getUser() {
        return user;
    }

    private List<Transaction> transactions;

    public FinancialController(User user) {
        this.user=user;
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public double calculateIncome() {
        double total = 0;

        for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);

            if (transaction.getCategory().getType() == CategoryType.INCOME){
                total += transaction.getValue();
            }
        }

        return total;
    }

    public double calculateExpense() {
        double total = 0;

        for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);

            if (transaction.getCategory().getType() == CategoryType.EXPENSE) {
                total += transaction.getValue();
            }
        }

        return total;


    }

    public double calculateBalance(){
        double total=0;
        total = calculateIncome()-calculateExpense();

        return total;

    }




}
