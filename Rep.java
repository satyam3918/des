package design;

public class Rep implements Repair {

	

	@Override
	public void ProcessPhoneRepair(String modelName) {
		
		System.out.println(modelName+"repair accepted!");
	}

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType +" repair accepted!");

	}

	
}
