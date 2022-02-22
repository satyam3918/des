package design;

public class Ord implements Order {

	@Override
	public void ProcessOrder(String modelName) {
		System.out.println(modelName +" order accepted!");

	}

	

}
