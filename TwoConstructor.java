class TwoConstructor{
	public TwoConstructor(int i){
		this(i*1.0f);
	}
	public TwoConstructor(float f){
		System.out.println("Calling the second constructor from first");
	}
	public static void main(String[] args) {
		TwoConstructor obj = new TwoConstructor(1);
	}
}