public class PedidoOnline extends Pedido{
    public PedidoOnline(int quantidade_itens, double valor_item, String forma_pagamento){
        super(quantidade_itens, valor_item, forma_pagamento);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento de pedido online...");
    }

    @Override
    public void haEntrega() {
        System.out.println("Pedido online: Entrega - 7.50");
    }
}
