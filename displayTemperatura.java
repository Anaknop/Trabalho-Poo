package br.com.AnaCarolina.Formats;

public class displayTemperatura extends display<Temperatura> {
	private Temperatura temperatura;
	private Format<Temperatura> temperaturaFormat;

	DisplayTemperatura(Temperatura temperatura, Format<Temperatura> temperaturaFormat){
		this.temperatura = temperatura;
		this.temperaturaFormat = temperaturaFormat;
	}

	@Override
	void show() {
		System.out.println(temperaturaFormat.formatter(temperatura));
	}
}
