package src;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kwonsungyang on 04/10/2018
 */
public class Test {
    public static void main (String[] args) {
//        Set<Short> s = new HashSet<>();
//        for (short i = 0; i < 100; i++) {
//            s.add(i);
//            s.remove(i - 1);
//        }
//        System.out.println(s.size());

        log(null);
    }

    private static void log(@Nullable final Object x) {
        System.out.println(x.toString());
    }
}
