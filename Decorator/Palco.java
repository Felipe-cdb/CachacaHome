package Decorator;

import TiposBares.Bar;

public class Palco extends BarDecorator {
    public Palco(Bar bar) {
        super(bar);
        setName(bar.getName());
        setType(bar.getType());
        setDecorations("Palco, ");
        setBudget(12538.92);
    }
}
