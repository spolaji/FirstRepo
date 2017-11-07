package com.chapter.everythingisanobject;

public class DataOnly {
	int i;
	float f = (float)0.0;
	double d = 1.0;
	boolean b;
	
	public static void main(String[] args) {
		DataOnly data = new DataOnly();
		System.out.println("i: " +data.i);
		System.out.println("d: " +data.d);
		System.out.println("f: " +data.f);
		System.out.println(data.f == 1.2f);
		System.out.println("Float: " +Float.floatToIntBits(data.f));
		System.out.println("b: " +data.b);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (b ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(d);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Float.floatToIntBits(f);
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataOnly other = (DataOnly) obj;
		if (b != other.b)
			return false;
		if (Double.doubleToLongBits(d) != Double.doubleToLongBits(other.d))
			return false;
		if (Float.floatToIntBits(f) != Float.floatToIntBits(other.f))
			return false;
		if (i != other.i)
			return false;
		return true;
	}
}
