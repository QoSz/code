public class Length_mm extends Length {

	double theLengthInMillimetres;

	public void set_mm(double lengthInMM) {
		theLengthInMillimetres = lengthInMM;
	}

	public void set_inches(double lengthInInches) {
		theLengthInMillimetres = lengthInInches * 25.4;
	}

	public double get_mm() {return theLengthInMillimetres;}
	public double get_inches() {return theLengthInMillimetres / 25.4;}
}
