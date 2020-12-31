package by.htp.task04.main;

import java.util.ArrayList;
import java.util.List;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. 
 * Учитывать возможность блокировки/разблокировки счета. 
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. 
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Client {

	private List<Account> account;

	public Client() {

		account = new ArrayList<Account>();

	}

	public void setAccount(List<Account> account) {

		this.account = account;

	}

	public List<Account> getAccount() {

		return account;

	}

	public void add(Account a) {

		account.add(a);

	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;

		result = prime * result + ((account == null) ? 0 : account.hashCode());

		return result;

	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Client other = (Client) obj;

		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		return true;

	}

	@Override
	public String toString() {

		return "account" + account;

	}

}
