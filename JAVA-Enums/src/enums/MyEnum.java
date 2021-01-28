package enums;

public enum MyEnum {
	LUNES("L", true), MARTES("M", false), MIERCOLES("X", true), JUEVES("J", true), VIERNES("V", false);
	
	private String value;
	private boolean flag;
	
	private MyEnum (String value, boolean flag) {
		this.value = value;
		this.flag = flag;
	}

	public String getValue() {
		return value;
	}

	public boolean isFlag() {
		return flag;
	}
	
}
