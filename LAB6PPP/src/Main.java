//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(){
    Bebida meuCafe = new Cafe();
    Bebida meuCapuccino = new Capuccino();
    Bebida meuCha = new Chá();

    meuCafe.fazBebida();

    System.out.println("\n");

    meuCapuccino.fazBebida();

    System.out.println("\n");

    meuCha.fazBebida();
}
