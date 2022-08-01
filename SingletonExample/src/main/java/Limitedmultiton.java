import java.util.HashMap;
import java.util.Map;

public class Limitedmultiton {
    public enum Count {
        ONE,
        TWO,
        THREE
    }

    private static Map instances = new HashMap();
    private static Limitedmultiton limitedmultiton = null;

    public static Limitedmultiton getLimitedmultiton(Enum key) {
        limitedmultiton = (Limitedmultiton) instances.get(key);
        if (limitedmultiton == null) {
            limitedmultiton = new Limitedmultiton();
            instances.put(key, limitedmultiton);

        }
        return limitedmultiton;
    }
}
