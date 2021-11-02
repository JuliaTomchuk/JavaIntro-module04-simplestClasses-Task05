package my.home.module04.counter;

import java.util.Random;

public class TestingData {

	private int[] array;

	TestingData() {
		array = new int[10];
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int[] getArray() {
		return array;
	}

	public int[] createArray(int length) {
		Random random = new Random();

		array = new int[length];
		int element = random.nextInt(100);

		for (int i = 0; i < array.length; i++) {
			array[i] = element;
			element++;

		}
		return array;

	}

	public void printArray() {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("");

	}

}
