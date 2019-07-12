package org.BlockChainService.domain.dto.type;

import java.math.BigInteger;

public class Address {

	public static final String TYPE_NAME = "address";
	public static final int LENGTH = 160;
	public static final String DEFAULT = "0000000000000000000000000000000000000000";
	private final String value;
	
	public Address(String value)
	{
		this.value = value;
	}

	public static String getTypeName() {
		return TYPE_NAME;
	}

	public static int getLength() {
		return LENGTH;
	}

	public static String getDefault() {
		return DEFAULT;
	}

	public String getValue() {
		return value;
	}
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		Address address = (Address) o;
		
		return this.value != null ? value.equals(address.value) : address.value == null;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return value != null ? value.hashCode() : 0;
	}
	
	
}
