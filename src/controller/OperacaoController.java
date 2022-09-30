package controller;

import java.text.DecimalFormat;
import br.edu.fateczl.filaobj.Fila;

public class OperacaoController {

	public void caixa(Fila f) {
		while (!f.isEmpty()) {
			try {
				String nome = (String) f.remove();
				int qtd = (int) f.remove();
				float valor = (float) f.remove();
				String total = new DecimalFormat("####.00").format((float) qtd * valor);
				System.out.println("cliente: " + nome + "  total: "+ total);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
