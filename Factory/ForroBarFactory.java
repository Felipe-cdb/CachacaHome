package Factory;

import TiposBares.Bar;
import TiposBares.MandacaruBar;

public class ForroBarFactory implements IBarFactory {
    public Bar create(Class c) {
       if (c == MandacaruBar.class)
            return new MandacaruBar();
       return null;
    }
}
