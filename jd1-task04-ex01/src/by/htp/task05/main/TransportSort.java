package by.htp.task05.main;

import java.util.Comparator;

public class TransportSort implements Comparator<TouristPackages> {

	@Override
	public int compare(TouristPackages tp1, TouristPackages tp2) {

		return tp1.getTransport().compareTo(tp2.getTransport());

	}

}
