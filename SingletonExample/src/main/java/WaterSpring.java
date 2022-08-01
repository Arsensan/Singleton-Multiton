public class WaterSpring {
    private static WaterSpring instance = null;

    private static String kindOfWater = " fresh water";

    public static WaterSpring getInstance() {
        if (instance == null) {
            instance = new WaterSpring();
        }
        return instance;
    }

    public String getWater(float liter) {
        return liter + kindOfWater;
    }


}
