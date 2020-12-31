package by.htp.task05.main;

import java.util.Comparator;

public class TypeSort implements Comparator<TouristPackages> {

	@Override
	public int compare(TouristPackages tp1, TouristPackages tp2) {

		return tp2.getType().compareTo(tp1.getType());

	}

}
