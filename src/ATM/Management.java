package ATM;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    public ArrayList<Account> insertData() {
        ReadDB readDB = new ReadDB();
        readDB.connect();


        ArrayList<Account> listAcc = new ArrayList<>();
        try {
            Scanner scf = new Scanner(new File("D:\\react project\\ATM\\src\\ATM\\Account.txt"));

            while (scf.hasNextLine()){
                Account a = new Account();
                String s = scf.nextLine();

                int so1 = s.indexOf("\t");
                a.setID(Integer.parseInt(s.substring(0, so1)));

                //int so2 = s.indexOf("\t", so1 + 1);a.setName(s.substring(so1 + 1, so2));

                // sửa so1 thanh so2
                int so3 = s.indexOf("\t", so1 + 1);
                // sửa so1 thanh so2
                a.setPassword(Integer.parseInt(s.substring(so1 + 1, so3)));
                a.setBalance(Double.parseDouble(s.substring(so3 + 1)));

                listAcc.add(a);
            }
            scf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAcc;
    }

    public Account login(ArrayList<Account> list) {


        System.out.println("@22222 ");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Account ID: ");
            int id = sc.nextInt();
            if (id > list.size()) {
                System.out.println("ID is invalid.");
                continue;
            }

            System.out.print("Enter PIN: ");
            int pass = sc.nextInt();

            if (list.get(id - 1).getPassword() == pass) {
                System.out.println("Login success");

                return list.get(id - 1);
            }
            else System.out.println("PIN is incorrect!");
        }

        System.out.println("Login unsuccess && the card is locked.");


        return null;
    }

    public Account shutdown() {
        return null;
    }

    public void updateData(ArrayList<Account> list) {
        try {
            FileWriter fw = new FileWriter("D:\\react project\\ATM\\src\\ATM\\Account.txt");
            for (Account a : list) {
                fw.write(a.getID() + "\t" + a.getName() + "\t" + a.getPassword() + "\t" + a.getBalance() + "\n");
            }
            fw.close();
            System.out.println("Update success!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
