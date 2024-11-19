package taller3.televisores;

public class TV {
	int canal = 1;
	int precio = 500;
	int volumen = 1;
	boolean estado;
	Marca marca;
	Control control;
	static int numTv;
	
	public TV(Marca marca, boolean estado ){
		this.marca = marca;
		this.estado = estado;
	}
	
	public void setMarca(Marca marca){
		this.marca = marca;
	}
	public Marca getMarca(){
		return marca;
	}
	public void setCanal(int canal){
		if (estado == true && canal >= 1 && canal <= 120) { 
			this.canal = canal;
		}
	
	}
	public int getCanal() {
		return canal;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPrecio(){
		return precio;
	}
	public void setVolumen(int volumen) {
		if (estado == true && volumen >= 0 && volumen <= 7) {
			this.volumen = volumen;
		}
	}
	public int getVolumen() {
		return volumen;
	}
    public void setControl(Control control) {
    	this.control = control;
    }
    public Control getControl() {
    	return control;
    }
    
       	
    public TV() {
    	numTv++;   	
    }
    public static int contador() {
    	return numTv;
    }
    
    
    
    public void turnOn() {
    	this.estado = true;
    }
    public void turnOff() {
    	
    	this.estado = false;
    	
    }
    
    public boolean getEstado() {
    	return estado;
    }
    
    
    
    public void canalUp () {
    	if(estado == true) {
    		if(this.canal >= 1 && this.canal <= 119) {
    			this.canal ++;
    		}
    	}
    	
    }
    public void canalDown() {
    	if(estado == true) {
    		if(this.canal >= 2 && this.canal <= 120) {
    			this.canal --;
    		}
    	}
    	
    }
    
    
    public void volumenUp () {
    	if(estado == true) {
    		if(this.volumen >= 0 && this.volumen <= 6) {
    			this.volumen ++;
    		}
    	}
    	
    }
    public void volumenDown() {
    	if(estado == true) {
    		if(this.volumen >= 1 && this.volumen <= 7) {
    			this.volumen --;
    		}
    	}
    	
    }
	public static void setNumTV(int i) {
		numTv = i;	
	}
	public static int getNumTV() {
		return numTv;

	}
    
    
}
