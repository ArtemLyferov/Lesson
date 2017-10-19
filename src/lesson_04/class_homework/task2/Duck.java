package lesson_04.class_homework.task2;

public class Duck {

    private byte stomachVolume;
    private byte foodVolume;

    public Duck(byte stomachVolume) {
        if (stomachVolume <= 0) {
            System.err.println("Объем желудка должен быть положителен");
        } else {
            this.stomachVolume = stomachVolume;
            this.foodVolume = 0;
        }
    }

    public void eat(byte breadVolume) {
        if (breadVolume <= 0) {
            System.err.println("Объем хлеба должен быть положителен");
        } else {
            int result = foodVolume + breadVolume;
            if (result <= 0.9 * stomachVolume) {
                this.foodVolume = (byte)result;
            } else {
                this.foodVolume = (byte)(0.9 * stomachVolume);
                System.out.println("Я больше не могу есть");
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Уточка наелась на %d %%", 100 * foodVolume / stomachVolume);
    }

}
