package creational.factory;
/**
 * 
 * @author softgroup_dmitriy
 *
 */
 class Honda extends Car {

	private String label;
	private String transmision;
	private String enginePower;

	public Honda(String label, String transmision, String enginePower) {
		this.label = label;
		this.transmision = transmision;
		this.enginePower = enginePower;
	}

	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public String getTransmision() {

		return transmision;
	}

	@Override
	public String getEnginePower() {
		return enginePower;
	}
}
