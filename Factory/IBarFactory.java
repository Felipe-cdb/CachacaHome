package Factory;

import TiposBares.Bar;

public interface IBarFactory {
    Bar create(Class c);
}