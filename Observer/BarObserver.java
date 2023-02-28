package Observer;

import java.util.ArrayList;
import java.util.List;

public class BarObserver implements ICachaçaHomeGerente {
    private List<IBar> bares = new ArrayList<>();
    private WhatsAppMessage message;

    @Override
    public void register(IBar bar) {
        bares.add(bar);
    }

    @Override
    public void remove(IBar bar) {
        bares.remove(bar);
    }

    @Override
    public void sendMessage() {
        for (IBar b : bares) {
            b.update(message);
        }
    }

    public void setMessage(WhatsAppMessage message) {
        this.message = message;
    }
}
