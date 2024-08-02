public class Temper {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

public class Tester {
    public void test() {
        Temper t = new Temper();
        t.setTemperature(17.2); // setTemperature メソッドを使用して値を設定
        double temp = t.getTemperature(); // getTemperature メソッドを使用して値を取得
        System.out.println("Temperature: " + temp);
    }
}

