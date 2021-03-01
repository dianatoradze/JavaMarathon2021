package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;
    static int maxLength;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public int getLength() {
        return length;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель:" + " " + producer + ", " + "год выпуска:" + " " + year + ", " + "длина:" + " " + length + ", " + "вес:" + " " + weight + ", "
                + "количество топлива в баке:" + " " + fuel);
    }

    public void fillUp(int n) {

        fuel += n;
    }

    public static void compareAirplanes(Airplane a1, Airplane a2) {

        if (a1.getLength() > a2.getLength()) {
            maxLength = a1.getLength();
            System.out.println("Первый самолет длиннее");
        } else if (a2.getLength() > a1.getLength()) {
            maxLength = a2.getLength();
            System.out.println("Второй самолет длиннее");
        } else if (a2.getLength() == a1.getLength()) {
            System.out.println("Длины самолетов равны");
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Изготовитель:").append(" ").append(producer).append(", ");
        sb.append("год выпуска:").append(" ").append(year).append(", ");
        sb.append("длина:").append(" ").append(length).append(", ");
        sb.append("вес:").append(" ").append(weight).append(", ");
        sb.append("количество топлива в баке:").append(" ").append(fuel);
        return sb.toString();
    }
}

