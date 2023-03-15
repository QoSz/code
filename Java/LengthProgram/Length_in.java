public class Length_in extends Length {

	double theLengthInInches;

	public void set_mm(double lengthInMM) {
		theLengthInInches = lengthInMM / 25.4;
	}

	public void set_inches(double lengthInInches) {
		theLengthInInches = lengthInInches;
	}

	public double get_mm() {return theLengthInInches * 25.4;}
	public double get_inches() {return theLengthInInches;}
}
