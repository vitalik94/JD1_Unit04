package by.htp.task04.main;

import java.util.Comparator;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. 
 * Учитывать возможность блокировки/разблокировки счета. 
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. 
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Account implements Comparable<Account> {

	private int account;
	private int numAccount;
	private boolean blocking;

	public Account(int numAccount, int account, boolean blocking) {

		this.account = account;
		this.numAccount = numAccount;
		this.blocking = blocking;

	}

	public void setAccount(int account) {

		this.account = account;

	}

	public int getAccount() {

		return account;

	}

	public void setNumAccount(int numAccount) {

		this.numAccount = numAccount;

	}

	public int getNumAccount() {

		return numAccount;

	}

	public void setBlocking(boolean blocking) {

		this.blocking = blocking;

	}

	public boolean getBlocking() {

		return blocking;

	}

	public int compareTo(Account a1) {

		if (this.getNumAccount() < a1.getNumAccount()) {

			return -1;

		} else if (this.getNumAccount() < a1.getNumAccount()) {

			return 1;

		}

		return 0;

	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;

		result = prime * result + account;
		result = prime * result + numAccount;
		result = prime * result + (blocking ? 1231 : 1237);
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

		Account other = (Account) obj;

		if (account != other.account)
			return false;
		if (numAccount != other.numAccount)
			return false;
		if (blocking != other.blocking)
			return false;
		return true;

	}

	@Override
	public String toString() {

		return "Номер счета: " + numAccount + ", " + "Счет: " + account + ", " + "Блокировка: " + blocking;

	}

}
