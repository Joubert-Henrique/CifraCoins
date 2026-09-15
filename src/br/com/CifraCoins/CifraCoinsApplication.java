package br.com.CifraCoins;

import java.time.LocalDate;

public class CifraCoinsApplication {
    public static void main(String[] args) {
        Category salaryCategory = new Category("salary", CategoryType.INCOME);
        Transaction salary = new Transaction(3000,"Monthly salary",LocalDate.now(),salaryCategory);

        Category freelancerCategory = new Category("freelancer",CategoryType.INCOME);
        Transaction freelancer = new Transaction(2000,"Monthly freelancer",LocalDate.now(),freelancerCategory );

        Category rentCategory = new Category("rent" , CategoryType.EXPENSE);
        Transaction rent = new Transaction(1000,"Monthly rent",LocalDate.now(),rentCategory);

        Category mercadoCategory = new Category("Mercado",CategoryType.EXPENSE);
        Transaction mercado = new Transaction(500,"food",LocalDate.now(),mercadoCategory);

        FinancialController controller = new FinancialController();
        controller.addTransaction(salary);
        controller.addTransaction(rent);
        controller.addTransaction(freelancer);
        controller.addTransaction(mercado);

        System.out.printf("R$ %.2f Total de receitas\n",controller.calculateIncome());
        System.out.printf("R$ %.2f Total de despesas\n",controller.calculateExpense());
        System.out.printf("R$ %.2f Valor total atualizado\n",controller.calculateBalance());


    }
}
