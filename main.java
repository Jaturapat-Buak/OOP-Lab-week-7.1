package lab8;

import lab8.Account;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
        CheckingAccount a1 = new CheckingAccount(50000,"61070033",5000);
        a1.showAccount();
        a1.deposit(500);
        System.out.println(a1);
        a1.withdraw("40000.0");
        System.out.println(a1.toString());
        }

}

