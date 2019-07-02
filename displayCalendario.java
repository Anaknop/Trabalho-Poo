package br.com.AnaCarolina.Formats;

public class displayCalendario extends Display<calendario> {
	private Calendario calendario;
	private Format<Calendario> data;

	displayCalendario(Calendario calendario, Format<Calendario> data) {
		this.calendario = calendario;
		this.data = data;

	}

	@Override
	void show() {
		System.out.println("Dia" + "Mês" + "Ano");

	}

}
