package view;

import br.edu.fateczl.filaobj.Fila;
import controller.OperacaoController;
import controller.clientes;

public class Principal {

	public static void main(String[] args) {

		Fila fila = new Fila();
		clientes cliente = new clientes();

		for (int i = 0; i < 20; i++) {
			cliente.nome = "cliente" + (i + 1);
			fila.insert(cliente.nome);
			cliente.qtdPeca = (int) ((Math.random() * 31) + 20);
			fila.insert(cliente.qtdPeca);
			cliente.valPeca = (float) ((Math.random() * 96) + 5);
			fila.insert(cliente.valPeca);
		}
		OperacaoController op = new OperacaoController(fila);
		op.caixa();
	}

}
