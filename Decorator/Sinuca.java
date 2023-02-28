package Decorator;

import TiposBares.Bar;

public class Sinuca extends BarDecorator {
    public Sinuca(Bar bar) {
        super(bar);
        // bar_decorado.setDecorations(bar_decorado.getDecorations() + "Sinuca, ");
        // bar_decorado.setBudget(bar_decorado.getBudget()+2000);
        setName(bar.getName());
        setType(bar.getType());
        setDecorations("Sinuca, ");
        setBudget(2000);
    }
}