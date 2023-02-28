package Factory;

import TiposBares.*;

public class RockBarFactory implements IBarFactory {
    public Bar create(Class c) {
       if (c == RockBar.class) 
            return new RockBar();
       else if (c == LinkinBark.class)
            return new LinkinBark();
       return null;
    }
}