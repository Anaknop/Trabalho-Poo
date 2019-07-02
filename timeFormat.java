package br.com.AnaCarolina.Formats;

public class timeFormat implements Format<horario> {
	
	@override
	public string formatter(horario value) {
		String hora = null;
		hora = value.hora + value.minuto;
		return hora;
	}

}
