package question01;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
	public List<T> arrays;

	public GenericList() {
		this.arrays = new ArrayList<>();
	}

	public List<T> getArrays() {
		return arrays;
	}

	public void setArrays(List<T> arrays) {
		this.arrays = arrays;
	}

	@Override
	public String toString() {
		return "GenericList [arrays=" + arrays + "]";
	}

}
