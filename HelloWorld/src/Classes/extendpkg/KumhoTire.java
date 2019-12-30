package Classes.extendpkg;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		// TODO Auto-generated method stub
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "금호타이어 수명:" + (maxRotation - accumulateRotation));
			return true;
		} else {
			System.out.println("***금호 타이어 펑크***" + location);
			return false;
		}
	}

}