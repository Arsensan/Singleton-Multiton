public class SingletonApp {
    public static void main(String[] args) {
        System.out.println("Start APP");
        System.out.println("**********\n");

        Singleton singleton1 = Singleton.getInstance();
        System.out.println("1 - " + singleton1);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("2 - " + singleton2);

        WaterSpring waterSpring = WaterSpring.getInstance();

        float someWater = 1.4f;
        System.out.println("4 - " + waterSpring.getWater(someWater));

        someWater = 1.3f;
        System.out.println("5 - " + waterSpring.getWater(someWater));

        System.out.println("Water spring " + waterSpring);

        float waterForTea = 2.3f;
        Teapot teapot = new Teapot(waterForTea);
        System.out.println("6 - " + teapot.makeTea());

        Multiton multiton = Multiton.getMultitonInstance("1");
        System.out.println("7 - " + multiton);

        multiton = Multiton.getMultitonInstance("2");
        System.out.println("8 - " + multiton);


        Limitedmultiton limitedmultiton = Limitedmultiton.getLimitedmultiton(Limitedmultiton.Count.ONE);
        System.out.println("9 - " + limitedmultiton);
        limitedmultiton = Limitedmultiton.getLimitedmultiton(Limitedmultiton.Count.TWO);
        System.out.println("10 - " + limitedmultiton);

        System.out.println("\n**********");
        System.out.println("Close APP");
    }
}
