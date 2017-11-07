package com.chapter.errorhandlingwithexceptions;

import static com.chapter.everythingisanobject.Print.*;

public class DynamicFields {

	private Object[][] fields;
	
	public DynamicFields (int initialSize) {
		fields = new Object[initialSize][2];
		for(int i = 0; i < initialSize; i++)
			fields[i] = new Object[]{null, null};
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Object[] obj : fields) {
			result.append(obj[0]);
			result.append(": ");
			result.append(obj[1]);
			result.append("\n");
		}
		return result.toString();
	}
	
	private int hasField(String id) {
		for(int i = 0; i < fields.length; i++) {
			if(id.equals(fields[i][0]))
				return i;
		}
		return -1;
	}
	
	private int makeField(String id) {
		for(int i = 0; i < fields.length; i++) {
			if(fields[i][0] == null) {
				fields[i][0] = id;
				return i;
			}	
		}
		Object[][] tmp = new Object[fields.length + 1][2];
		for(int i = 0; i < fields.length; i++)
			tmp[i] = fields[i];
		for(int i = fields.length; i < tmp.length; i++)
			tmp[i] = new Object[]{null,null};
		fields = tmp;
		return makeField(id);
	}
	
	private int getFieldNumber(String id) throws NoSuchFieldException {
		int fieldNum =  hasField(id);
		if(fieldNum == -1)
			throw new NoSuchFieldException();
		return fieldNum;
	}
	
	public Object getField(String id) throws NoSuchFieldException {
		return fields[getFieldNumber(id)][1];
	}
	
	public Object setField(String id, Object value) throws DynamicFieldsException {
		// TODO Auto-generated method stub
		if(value == null) {
			DynamicFieldsException dfe = new DynamicFieldsException();
			dfe.initCause(new NullPointerException());
			throw dfe;
		}
		
		int fieldNumber = hasField(id);
		if(fieldNumber == -1)
			fieldNumber = makeField(id);
		Object result = null;
		
		try {
			result = getField(id);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		fields[fieldNumber][1] = value;
		return result;
	}
	
	public static void main(String[] args) {
		DynamicFields df = new DynamicFields(3);
		println(df);
		
		try {
			df.setField("d", "A vaue for d");
			df.setField("number", 47);
			df.setField("number2", 48);
			println(df);
			df.setField("d", "A new vaue for d");
			df.setField("number3", 11);
			println("df: " +df);
			println("df.getField(\"d\") : " + df.getField("d"));
			Object field = df.setField("d", null);
		} catch (DynamicFieldsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			
		}

	}

}

class DynamicFieldsException extends Exception {
	
}
