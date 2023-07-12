//Guilherme Schmidt Lingnau RA: 2210924

public abstract class Dispositivos {
	
	private int potencia;
	private int dias;
	private int horas;
	public String marca;
	public final double taxa = 2.99;

	public Dispositivos(){
		potencia=0;
		marca = "";
		dias = 0;
		horas = 0;
	}
   	public int getDias(){
            return dias;
   	}
   	public int getHoras(){
            return horas;
   	}  	
   	public String getMarca(){
            return marca;
   	}  	
   	public int getPotencia(){
            return potencia;
   	}
   	public final void setDias(int dias){
            this.dias = dias;
   	}
   	public final void setHoras(int horas) throws HorasDiaException {
            if(horas > 0 && horas <=24){
   		this.horas = horas;
   	}	
            else {
		throw new HorasDiaException();	
            }   	
        }	
   	public  void setMarca(String marca){
            this.marca = marca;
   	}
   	public final void setPotencia(int potencia){
            this.potencia = potencia;
   	}

  


   	
   
   	
  
    
    
}
