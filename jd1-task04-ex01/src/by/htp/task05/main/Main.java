package by.htp.task05.main;

import java.util.Collections;
import java.util.List;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору 
 * туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.)
 * для оптимального выбора. Учитывать возможность выбора транспорта, питания и числа дней.
 * Реализовать выбор и сортировку путевок.
 */

public class Main {

	public static void main(String[] args) {

		ListTouristPackages l = new ListTouristPackages();

		l.add(new TouristPackages(Type.RELAXATION, Transport.AIRPLANE, Food.ALLINCLUSIVE, 14));
		l.add(new TouristPackages(Type.CRUISE, Transport.SHIP, Food.THREEMEALS, 14));
		l.add(new TouristPackages(Type.EXCURSIONS, Transport.AUTOBAS, Food.BREAKFAST, 2));

		print(l);

		TouristPackagesLogic tplogic = new TouristPackagesLogic();

		printChoice(tplogic.choiceTour(l, Type.RELAXATION));

		printChoice(tplogic.choiceTour(l, Transport.SHIP));

		printChoice(tplogic.choiceTour(l, Food.BREAKFAST));

		printChoice(tplogic.choiceTour(l, 14));

		Collections.sort(l.getTouristpackages(), new TransportSort());
		print(l);

		Collections.sort(l.getTouristpackages(), new TypeSort());
		print(l);

		Collections.sort(l.getTouristpackages(), new FoodSort());
		print(l);

	}

	public static void print(ListTouristPackages l) {

		for (TouristPackages tp : l.getTouristpackages()) {

			System.out.println(tp.toString());

		}

		System.out.println();

	}

	public static void printChoice(List<TouristPackages> listtouristpackages) {

		for (TouristPackages tp : listtouristpackages) {

			System.out.println(tp.toString());

		}

		System.out.println();

	}

}
