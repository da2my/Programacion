package model;

public class Precio {
    private double vip;
    private double standar;
    private double economico;
 
    public Precio() {
    	vip=45;
    	standar=33.54;
    	economico=26.4;
    }
    
    public Precio(double vip, double standar, double economico) {
    	this.vip=vip;
    	this.standar=standar;
    	this.economico=economico;
    }

	public double getVip() {
		return vip;
	}

	public void setVip(double vip) {
		this.vip = vip;
	}

	public double getStandar() {
		return standar;
	}

	public void setStandar(double standar) {
		this.standar = standar;
	}

	public double getEconomico() {
		return economico;
	}

	public void setEconomico(double economico) {
		this.economico = economico;
	}

	@Override
	public String toString() {
		return "Precio [vip=" + vip + ", standar=" + standar + ", economico=" + economico + "]";
	}

    
    
}
