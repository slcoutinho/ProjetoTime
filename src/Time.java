
public class Time {
	private int hora, min, seg;

	public Time(int hora, int min, int seg) {
		//super();
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}
	
	public String formataNumero (int num) {
		if (num < 10 ) {
			return "0"+num;
		}
		else {
			return num+"";
		}
	}
	public String exibirHoraUniversal() {
		String strHora = formataNumero(hora)+":"+formataNumero(min)+":"+formataNumero(seg);
	}
	
	
	
	public String exibirHoraPadrao() {
		int horaPadrao = hora - 12;
		if (hora == 0) {
			return hora+":"+min+":"+seg+" AM";
		}
		else if (hora == 12) {
			return hora+":"+min+":"+seg+" AM";
		}
		else if (hora == 24) {
			return hora+":"+min+":"+seg+" PM";
		}
		else if (hora >=13 && hora <=23) {
			return horaPadrao+":"+min+":"+seg+" PM";
		}
		else {
			return horaPadrao+":"+min+":"+seg+" AM";
		}
	}
}