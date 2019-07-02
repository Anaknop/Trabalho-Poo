package br.com.AnaCarolina.Formats;

public class displayRadio extends display<Radio> {
	private Radio radio;
	private Format<Radio> radioFormat;

	displayRadio(Radio radio, Format<Radio> radioFormat) {
		this.radio = radio;
		this.radioFormat = radioFormat;

	}

	@override
	void show() {
		System.out.println(radioFormat.Formatter(radio));
	}
}
