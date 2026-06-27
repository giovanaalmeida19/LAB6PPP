public class Capuccino extends Bebida{
    @Override
    public void prepararBebida() {
        System.out.println("Preparando capuccino...");
    }

    @Override
    public void adicionaCondimentos() {
        System.out.println("Colocando condimentos no capuccino: canela e chocolate...");
    }
}
