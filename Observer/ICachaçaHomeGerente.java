package Observer;

public interface ICachaçaHomeGerente {
    void register(IBar bar);
    void remove(IBar bar);
    void sendMessage();
}
