import Decorator.*;
import Factory.*;
import Observer.BarObserver;
import Observer.WhatsAppMessage;
import TiposBares.Bar;
import TiposBares.ClassicBar;
import TiposBares.RockBar;

public class CachaçaHome {
    public static void main(String[] args) {
        // Factory.
        RockBarFactory rock_bar_factory = new RockBarFactory();
        ClassicBarFactory classic_bar_factory = new ClassicBarFactory();
        Bar rocks_bar = rock_bar_factory.create(RockBar.class);
        Bar classic_bar = classic_bar_factory.create(ClassicBar.class);

        // Decorator.
        classic_bar = new Palco(classic_bar);
        classic_bar = new Sinuca(classic_bar);
        rocks_bar = new Sinuca(rocks_bar);

        // Observer.
        BarObserver bar_observer = new BarObserver();
        bar_observer.register(classic_bar);
        bar_observer.register(rocks_bar);
        bar_observer.remove(rocks_bar);
        WhatsAppMessage message = new WhatsAppMessage();
        message.setMessage("Feriado dia 14 de dezembro!");
        bar_observer.setMessage(message);
        bar_observer.sendMessage();

        // Informações.
        System.out.println("\n");
        System.out.println(classic_bar.getBarInformations());
        System.out.println(rocks_bar.getBarInformations());
        System.out.println("\n");
    }
}