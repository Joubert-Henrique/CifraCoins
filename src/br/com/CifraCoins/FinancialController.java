package br.com.CifraCoins;

import java.util.ArrayList;
import java.util.List;

import static br.com.CifraCoins.CategoryType.EXPENSE;
import static br.com.CifraCoins.CategoryType.values;

public class FinancialController {
    private List <Transaction> transactions;


    public FinancialController() {
        transactions = new ArrayList<>();
    }

    public void addTransaction (Transaction transaction) {
        transactions.add(transaction);


    }



}

