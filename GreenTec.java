package org.add;

public class GreenTec {
	public void greenomr(int order, String type ,int number) {
		System.out.println("Order="+order+  "Type="+type+ "Number="+number);
	}
	private void greenomr(float order , String type , int number) {
 System.out.println("order="+order+ "Type="+type+ "Number="+number);

	}
	
	private void greenomr(String name, String type, int number){
		system.out.println("name="+name+"type"+type"number"+number+);
	}
	
	private void greenomr(String name){
		system.out.println("name"+name+);
	}
		
	
	public static void main(String[] args) {
		GreenTec va = new GreenTec();
		va.greenomr(1, "it", 989765);
		va.greenomr(2, "core", 9753211);
	


	}

}
