import java.util.ArrayList;
import java.util.List;

import Veiculos.TipoCarro;
import Veiculos.Veiculos;

public class Main {

	public static void main(String[] args) {
		List<Veiculos> veiculos = new ArrayList<>();
		Veiculos veiculo = new Veiculos("ABC");
		Veiculos veiculo1 = new Veiculos("ABC1");
		Veiculos veiculo2 = new Veiculos("ABC2");
		veiculo.setTipoCarro(TipoCarro.CARRO);
		veiculo1.setTipoCarro(TipoCarro.MOTO);
		veiculo2.setTipoCarro(TipoCarro.UTILITARIO);
		
		veiculos.add(veiculo);
		veiculos.add(veiculo1);
		veiculos.add(veiculo2);
		veiculos.forEach(v->System.out.println(v.getPlaca() + " " + v.getTipoCarro()));
		
		
	}
}
