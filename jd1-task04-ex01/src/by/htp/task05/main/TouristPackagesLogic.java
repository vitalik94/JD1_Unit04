package by.htp.task05.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TouristPackagesLogic {

	public List<TouristPackages> choiceTour(ListTouristPackages l, Type type) {

		List<TouristPackages> choicetour = new ArrayList<TouristPackages>();

		for (TouristPackages tp : l.getTouristpackages()) {

			if (tp.getType() == type) {

				choicetour.add(tp);

			}

		}

		return choicetour;

	}

	public List<TouristPackages> choiceTour(ListTouristPackages l, Transport transport) {

		List<TouristPackages> choicetour = new ArrayList<TouristPackages>();

		for (TouristPackages tp : l.getTouristpackages()) {

			if (tp.getTransport() == transport) {

				choicetour.add(tp);

			}

		}

		return choicetour;

	}

	public List<TouristPackages> choiceTour(ListTouristPackages l, Food food) {

		List<TouristPackages> choicetour = new ArrayList<TouristPackages>();

		for (TouristPackages tp : l.getTouristpackages()) {

			if (tp.getFood() == food) {

				choicetour.add(tp);

			}

		}

		return choicetour;

	}

	public List<TouristPackages> choiceTour(ListTouristPackages l, int day) {

		List<TouristPackages> choicetour = new ArrayList<TouristPackages>();

		for (TouristPackages tp : l.getTouristpackages()) {

			if (tp.getDay() == day) {

				choicetour.add(tp);

			}

		}

		return choicetour;

	}

}
