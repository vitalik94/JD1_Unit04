package by.htp.task04.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. 
 * Учитывать возможность блокировки/разблокировки счета. 
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. 
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class AccountLogic {

	public List<Account> searchAccount(Client c, int na) {

		List<Account> searchAccount = new ArrayList<Account>();

		for (Account a : c.getAccount()) {

			if (a.getNumAccount() == na) {

				searchAccount.add(a);

			}

		}

		return searchAccount;

	}

	public int sumAccount(Client c) {

		int sum = 0;

		for (Account a : c.getAccount()) {

			sum += a.getAccount();

		}

		return sum;

	}

	public int sumPositiveAccount(Client c) {

		int sum = 0;

		for (Account a : c.getAccount()) {

			if (a.getAccount() > 0) {

				sum += a.getAccount();

			}

		}

		return sum;

	}

	public int sumNegativeAccount(Client c) {

		int sum = 0;

		for (Account a : c.getAccount()) {

			if (a.getAccount() < 0) {

				sum += a.getAccount();

			}

		}

		return sum;

	}

}
