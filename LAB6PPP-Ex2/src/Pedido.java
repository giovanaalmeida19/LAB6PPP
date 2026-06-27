public abstract class Pedido {
    int quantidade_itens;
    double valor_item;
    String forma_pagamento;

    public Pedido(int quantidade_itens, double valor_item, String forma_pagamento){
        setQuantidade_itens(quantidade_itens);
        setValor_item(valor_item);
        setForma_pagamento(forma_pagamento);
    }

    public abstract void processarPagamento();

    public abstract void haEntrega();

    public void processarPagamento(String formaPagamento, double valor){
        System.out.println("Forma de pagamento: "+formaPagamento);
        System.out.println("Valor: R$ "+valor);
    }

    public void processarPedido(){
        processarPagamento(forma_pagamento, valor_item);
        haEntrega();
    }

    public int getQuantidade_itens() {
        return quantidade_itens;
    }

    public void setQuantidade_itens(int quantidade_itens) {
        this.quantidade_itens = quantidade_itens;
    }

    public double getValor_item() {
        return valor_item;
    }

    public void setValor_item(double valor_item) {
        this.valor_item = valor_item;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }
}
