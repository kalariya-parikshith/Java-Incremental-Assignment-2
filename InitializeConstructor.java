class InitializeConstructor{
	InitializeConstructor(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		InitializeConstructor[] arr = new InitializeConstructor[10]; 
		for(int i=0; i<10; i++){
			arr[i] = new InitializeConstructor("kp");
		}
	}
}