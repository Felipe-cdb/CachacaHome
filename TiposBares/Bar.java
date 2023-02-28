package TiposBares;

import Observer.IBar;
import Observer.WhatsAppMessage;

public abstract class Bar implements IBar {
    protected String name;
    protected String type;
    protected double budget;
    protected String decorations;
    protected String whatsapp;
    
    public Bar() {
        decorations = "";
        whatsapp = "";
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public double getBudget() {
        return budget;
    }
    
    public void setBudget(double budget) {
        this.budget = budget;
    }
    
    public String getDecorations() {
        return decorations;
    }

    public void setDecorations(String decorations) {
        this.decorations = decorations;
    }
    
    public String getBarInformations() {
        String retorno = String.format("%s | tipo %s | decorações: %s | orçamento: R$ %.2f | whatsapp: %s \n ", getName(), getType(), getDecorations(), getBudget(), whatsapp);
        return retorno;
    }

    public void update(WhatsAppMessage message) {
        this.whatsapp = this.whatsapp + message.getMessage() + ", ";
    }
}
