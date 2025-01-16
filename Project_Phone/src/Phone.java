public class Phone {
	private int number;
	private final int model;
	private int weight;	
    // Phone(int n) {this.number = n;}
    Phone(int model, int number) {
		this.number = number;
		this.model = model;
	} 
	Phone(int n, int m, int w) {
        this(m, n);
		this.weight = w;
	} 

	public void receiveCall(String name) {
		System.out.println("Звонит "+ name);
	}
	public int getNumber() {return number;} 
	public int getModel() {return model;}
	public int getWeight() {return weight;}  
	public void receiveCall(String name, int numb) {
		this.number = numb;
		System.out.println("Звонит "+ name+" "+number);
	}        
}

