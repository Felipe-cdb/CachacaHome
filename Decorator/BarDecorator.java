package Decorator;

import TiposBares.Bar;

public abstract class BarDecorator extends Bar {
    protected Bar bar_decorado;
    
    public BarDecorator(Bar bar_decorado) {
        this.bar_decorado = bar_decorado;
    }

    public Bar getBar() {
        return bar_decorado;
    }   

    @Override
    public double getBudget() {
        return this.budget + bar_decorado.getBudget();
    }

    @Override
    public String getDecorations() {
        return bar_decorado.getDecorations() + this.decorations;
    }   

}