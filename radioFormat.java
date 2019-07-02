package br.com.AnaCarolina.Formats;

public class radioFormat implements Format<Radio> {

		@override
		public String formatter(Radio value) {
			String radio = new String();
			radio = value.frequencia + valeu.estacao + "Mhz";
			return radio;
		}
	}

