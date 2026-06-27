public abstract class Bebida {
    public abstract void prepararBebida();
    public abstract void adicionaCondimentos();

    public void aqueceAgua(){
        System.out.println("Aquecendo água...");
    }
    public void colocarNaXicara(){
        System.out.println("Colocando bebida na xícara...");
    }

    public void fazBebida(){
        aqueceAgua();
        prepararBebida();
        colocarNaXicara();
        adicionaCondimentos();
    }
}
