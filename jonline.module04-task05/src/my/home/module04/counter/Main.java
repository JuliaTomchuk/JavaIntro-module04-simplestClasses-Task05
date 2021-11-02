package my.home.module04.counter;

public class Main {

	public static void main(String[] args) {

		TestingData test = new TestingData();

		System.out.println("тестируем счётчик в пределах его диапазона");
		int[] array = test.createArray(10);

		test.printArray();

		Counter counter = new Counter(10, 0, 0);

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				counter.increaseCounter();
				System.out.print(counter.getCurrentValue() + " ");
			}

		}

		System.out.println("");

		System.out.println("тестируем счётчик при выходе за верхнюю границу диапазона");

		counter.setCurrentValue(0);

		array = test.createArray(50);

		test.printArray();

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				counter.increaseCounter();
				System.out.print(counter.getCurrentValue() + " ");

			}

		}
		System.out.println("");

		System.out.println("тестируем счётчик при выходе за нижнюю границу диапазона");

		counter.setCurrentValue(10);

		for (int j = 0; j < array.length; j++) {
			if (array[j] % 2 != 0) {
				counter.decreaseCounter();
				System.out.print(counter.getCurrentValue() + " ");
			}
		}

	}
}
