/**
 * Клас, який зберігає номер і значення числа Фібоначі
 */
class FibonacciNumber {
    private int index;
    private int value;

    /**
     * Конструктор класу
     * @param index
     * @param value
     */
    public FibonacciNumber(int index, int value) {
        this.index = index;
        this.value = value;
    }

    /**
     * Отримання номера
     * @return номер числа
     */

    public int getIndex() {
        return index;
    }

    /**
     * Встановлення номера
     * @param index
     */

    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * Отримання значення
     * @return значення
     */

    public int getValue() {
        return value;
    }

    /**
     * Встановлення значення
     * @param value
     */

    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Виведення результату
     * @return результат
     */

    @Override
    public String toString() {
        return "Індекс: " + index + ", Значення: " + value;
    }
}
