package Factory;

import TiposBares.*;

public class ClassicBarFactory implements IBarFactory {
    public Bar create(Class c) {
       if (c == ClassicBar.class) return new ClassicBar();
       return null;
    }
}