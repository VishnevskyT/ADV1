package exercise_3;

/**
 * Завдання 3
 * У папці з прикладами ex_004_comparable. Дописати логіку, щоб метод compareTo() здійснив пошук за швидкістю
 * (якщо ж швидкість у 2-х об'єктів дорівнює, то шукаємо за ціною) -> ціною -> моделі -> кольору машини.
 */

public class Car implements Comparable{

    int speed;
    int price;
    String model;
    String color;

    public Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.speed + " " + this.price + " " + this.model + " " + this.color;



    }

    @Override
     public int compareTo(Object o) {
        int temp = this.speed - ((Car)o).speed;
        if (temp == 0) {
            if (this.price - ((Car)o).price == 0) {
                if (this.model.equals(((Car)o).model)) {
                    return this.color.compareToIgnoreCase(((Car) o).color);
                }
                return this.model.compareToIgnoreCase(((Car)o).model);
            }
            return this.price - ((Car)o).price;
        } else {
            return temp;
        }
    }

}
