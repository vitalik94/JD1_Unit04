package by.htp.task05.main;

import java.util.ArrayList;
import java.util.List;

public class ListTouristPackages {

	private List<TouristPackages> touristpackages;

	public ListTouristPackages() {

		touristpackages = new ArrayList<TouristPackages>();

	}

	public void setTouristpackages() {

		this.touristpackages = touristpackages;

	}

	public List<TouristPackages> getTouristpackages() {

		return touristpackages;

	}

	public void add(TouristPackages tp) {

		touristpackages.add(tp);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((touristpackages == null) ? 0 : touristpackages.hashCode());
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
		ListTouristPackages other = (ListTouristPackages) obj;
		if (touristpackages == null) {
			if (other.touristpackages != null)
				return false;
		} else if (!touristpackages.equals(other.touristpackages))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ListTouristPackages [touristpackages=" + touristpackages + "]";
	}

}
