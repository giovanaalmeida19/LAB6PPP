public class PedidoLoja extends Pedido{
    public PedidoLoja(int quantidade_itens, double valor_item, String forma_pagamento){
        super(quantidade_itens, valor_item, forma_pagamento);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento do pedido na loja...");
    }

    @Override
    public void haEntrega() {
        System.out.println("Pedido na loja: sem entrega.");
    }
}
