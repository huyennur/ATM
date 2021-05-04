package ATM;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private int ID; //STK
    private String name;
    private int password;
    private double balance; //so du

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    //kiem tra thong tin tai khoan
    public String checkAccount() {
        return String.valueOf(balance);
    }

    //chuyen khoan
    public String transfer(double amount, int id_transfer, ArrayList<Account> list) {
        //if (checkPIN()) return "The transaction is canceled";

        boolean check = true;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).ID == id_transfer) {
                index = i;
                check = false;
                break;
            }

        }
        if (check) return "The ID Transfer is invalid.";
        else {
            if (amount > balance) {
                return "The amount exceeds the balance!";
            } else if (amount <= 0) {
                return "The amount is not valid!";
            } else {
                list.get(index).balance += amount;
                balance -= amount;
                return "Transfer success.";
            }
        }
    }

    public boolean checkPIN() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter PIN: ");
            int pass = scanner.nextInt();
            if (pass == password) {
                scanner.close();
                return false;
            }
            else System.out.println("PIN is incorrect!");
        }
        scanner.close();
        return true;
    }

    //rut tien
    public String withdraw(double amount) {
        //if (checkPIN()) return "The transaction is canceled";

        if (amount > balance) {
            return "The amount exceeds the balance!";
        } else if (amount <= 0 || amount % 50000 != 0) {
            return "The amount must be a multiple of 50000";
        } else {
            balance -= amount;
            return "Your account is deducted " + amount + " VND!";
        }
    }

    //thanh toan hoa don
    public String payBill(double amount) {
        //if (checkPIN()) return "The transaction is canceled";

        if (amount > balance) {
            return "The amount exceeds the balance!";
        } else if (amount <= 0) {
            return "The amount is invalid.";
        } else {
            balance -= amount;
            return "Your account paid " + amount + " VND!";
        }
    }

    public String changePIN(int pass, int newPass, int newPass2) {
        if (pass != password) return "PIN is incorrect!";
        else if (newPass2 != newPass) return "New PIN is invalid.";
        else {
            password = newPass;
            return "Change PIN success.";
        }
    }
}
