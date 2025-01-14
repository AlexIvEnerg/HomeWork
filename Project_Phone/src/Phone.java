public class Phone {
	private int number;
	private final int model;
	private int weight;
	
    // Phone() {}
    /* Phone(int model, int number) {
		this.number = number;
		this.model = model;
	} */
	Phone(int n, int m, int w) {
		this.number = n;
        this.model = m;
        // this(m, n);
		this.weight = w;
	} 	
	/* public void receiveCall(String name) {
		System.out.println("Звонит "+ name);
	} */
	public int getNumber() { return number; } 
	public int getModel() {return model;}
	public int getWeight() {return weight;}  
	 /* public void receiveCall(String name, int numb) {
		this.number = numb;
		System.out.println("Звонит "+ name+" "+number);
	}  */            
    //  System.out.println(phone1.model +" "+ phone2.model +" "+ phone3.model);
    //  System.out.println(phone1.weight +" "+ phone2.weight +" "+ phone3.weight);
}

