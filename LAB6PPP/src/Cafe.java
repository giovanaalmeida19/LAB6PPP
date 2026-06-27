public class Cafe extends Bebida {

    @Override
    public void prepararBebida() {
        System.out.println("Preparando café...");
    }

    @Override
    public void adicionaCondimentos() {
        System.out.println("Colocando condimentos: adoçante e chantilly...");
    }
}
