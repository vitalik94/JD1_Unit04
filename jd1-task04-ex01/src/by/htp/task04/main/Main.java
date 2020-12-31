package by.htp.task04.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. 
 * Учитывать возможность блокировки/разблокировки счета. 
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. 
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {

	public static void main(String[] args) {

		Client c = new Client();

		c.add(new Account(1279, 100, false));
		c.add(new Account(4704, 250, true));
		c.add(new Account(2764, 726, false));
		c.add(new Account(2964, 245, false));
		c.add(new Account(8259, -252, false));
		c.add(new Account(2594, 847, false));
		c.add(new Account(1423, 240, true));
		c.add(new Account(3408, -173, false));
		c.add(new Account(2340, -263, true));
		c.add(new Account(2631, 744, false));

		AccountLogic al = new AccountLogic();

		print(c, al);

		printSearch(al, c, 1279);

		Collections.sort(c.getAccount());

		printSort(c);

	}

	public static void print(Client c, AccountLogic al) {

		for (Account a : c.getAccount()) {

			System.out.println(a.getNumAccount() + ", " + a.getAccount());

		}

		System.out.println();
		System.out.println("Общая сумма счетов: " + al.sumAccount(c));
		System.out.println();
		System.out.println("Общая сумма положительных счетов: " + al.sumPositiveAccount(c));
		System.out.println();
		System.out.println("Общая сумма отрицательных счетов: " + al.sumNegativeAccount(c));
		System.out.println();

	}

	public static void printSearch(AccountLogic al, Client c, int na) {

		System.out.println(al.searchAccount(c, na));

		System.out.println();

	}

	public static void printSort(Client c) {

		for (Account a : c.getAccount()) {

			System.out.println(a.getNumAccount() + ", " + a.getAccount());

		}

	}

}
