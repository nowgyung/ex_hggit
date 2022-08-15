package study_220815;

class Car {
	int gasolineGauge;

	public Car(int gasolineGauge) {
		this.gasolineGauge = gasolineGauge;
	}
}

class HybridCar extends Car {
	int electricGauge;

	public HybridCar(int gasolineGauge, int electricGauge) {
		super(gasolineGauge);
		this.electricGauge = electricGauge;
	}
}

class HybridwaterCar extends HybridCar {
	int waterGauge;

	public HybridwaterCar(int gasolineGauge, int electricGauge, int waterGauge) {
		super(gasolineGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린: "+ gasolineGauge);
		System.out.println("잔여 전기량: "+electricGauge);
		System.out.println("잔여 워터량: "+waterGauge);
		
	}
}

public class Ex01 {
	public static void main(String[] args) {
		HybridwaterCar hybridcar = new HybridwaterCar(10, 20, 30);
		hybridcar.showCurrentGauge();
	}
}
