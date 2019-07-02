package br.com.AnaCarolina.Formats;

public class temperaturaFormat implements Format <temperatura> {
	
	@override
	public String formatter(br.com.AnaCarolina.Formats.temperatura value) {
		String temperatura = new String();
		temperatura = value.temperatura + valeu.escala;
		return temperatura;
	}

}
