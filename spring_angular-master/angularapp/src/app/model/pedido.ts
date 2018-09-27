import { ItemPedido } from "./itemPedido";

export class Pedido {

    private listaItemPedido : Array<ItemPedido>
    private totalCostoPedido : number;
    private codigo : string


	constructor($totalCostoPedido: number, $listaItemPedido : Array<ItemPedido>) {
        this.totalCostoPedido = $totalCostoPedido;
        this.listaItemPedido = $listaItemPedido;
	}

    /**
     * Getter $totalCostoPedido
     * @return {number}
     */
	public get $totalCostoPedido(): number {
		return this.totalCostoPedido;
	}

    /**
     * Setter $totalCostoPedido
     * @param {number} value
     */
	public set $totalCostoPedido(value: number) {
		this.totalCostoPedido = value;
    }
    
    public get $listaItemPedido(): Array<ItemPedido> {
        return this.listaItemPedido;
      }
    
      public set $listaItemPedido(value: Array<ItemPedido>) {
        this.listaItemPedido = value;
      }

      /**
     * Getter $totalCostoPedido
     * @return {string}
     */
	public get $codigo(): string {
		return this.codigo;
	}

    /**
     * Setter $totalCostoPedido
     * @param {string} value
     */
	public set $codigo(value: string) {
		this.codigo = value;
    }

      

}