package my.home.module04.counter;

/*Опишите класс, реализующий десятичный счётчик, который может увеличивать или уменьшать своё значение на еденицу в заданном диапазоне.
 * Предусмотрите инициализацию счётчика значениями по умолчанию и произвольными значениями. Счётчик имеет методы увеличения и уменьшения состояния,
 *  и метод позволяющий получить его текущее состояние.Написать код, демострирующий все возможности класса*/
public class Counter {

	private int currentValue;
	private int maxValue;
	private int minValue;

	public Counter() {
		currentValue = 0;
		maxValue = 10;
		minValue = 0;
	}

	public Counter(int maxValue, int minValue, int currentValue) {
		this.maxValue = maxValue;
		this.minValue = minValue;
		this.currentValue = currentValue;
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

	public void setmaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public int getmaxValue() {
		return maxValue;
	}

	public void setminValue(int minValue) {
		this.minValue = minValue;
	}

	public int increaseCounter() {
		if (currentValue > maxValue - 1) {
			currentValue = maxValue;
			return (currentValue);
		} else {
			return (currentValue++);
		}
	}

	public int decreaseCounter() {
		if (currentValue < minValue + 1) {
			currentValue = minValue;
			return (currentValue);
		} else {
			return (currentValue--);
		}
	}

}
