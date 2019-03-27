package api;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
    {

        DBBanka database = new DBBanka("jdbc:sqlite:"+DBConfig.dbLocalBanka);

        Scanner sc = new Scanner(System.in);

        try {
         
            database.printBankOffices();

            database.makePayment(4,sc.next()); // obaratiti paznju na SQLInjection (sc.next() -> "5000.0; // ")

            database.printBankAccount();

            try {
                database.makeTransferFaultAnomaly(1, 4, sc.nextFloat());
            }catch (Exception e){
                System.out.println(e.getMessage());
                // Hmmm. Nestala struja? Kako se ovo izvrsava???
                // Pogresno stanje!
            }
            database.printBankAccount();


            try {
                database.makeTransfer(1, 4, sc.nextFloat());
            }catch (Exception e){
                System.out.println(e.getMessage());
                // Hmmm. Nestala struja? Kako se ovo izvrsava???
            }
            database.printBankAccount();
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
       
}}
