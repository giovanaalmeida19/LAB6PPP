public class Chá extends Bebida {
    @Override
    public void prepararBebida() {
        System.out.println("Preparando chá...");
    }

    @Override
    public void adicionaCondimentos() {
        System.out.println("Colocando condimentos no chá: sachê e adoçante...");
    }
}
