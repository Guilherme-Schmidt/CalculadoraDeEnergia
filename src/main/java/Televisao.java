//Guilherme Schmidt Lingnau RA: 2210924

public final class Televisao extends Dispositivos implements Calc{

   private String tipo;
   private int resolucao;
   
    public Televisao(){
   	tipo = "";
   	resolucao = 0;
    }
    
    //Sobrecarga
    public Televisao(String tipo, int resolucao){
        this.tipo= tipo;
        this.resolucao = resolucao;
    }

   //Sobrescrita
    public double calcular(){ 
        return (getPotencia()*getHoras()*getDias());
    }

    //Sobrescrita
    public double gastoTotal() {
	double telePot = calcular();
        double teleGasto = (telePot / 100) * taxa;
        return teleGasto;
    }

   public String getTipo(){
   	return tipo;
   }
   
   public int getResolucao(){
   	return resolucao;
   }
   
   public void setTipo(String tipo) throws TipoTvErrException{
       if(tipo.equalsIgnoreCase("Led") || tipo.equalsIgnoreCase( "Plasma")){
            this.tipo = tipo;
	}
	else {
            throw new TipoTvErrException();
	}
   }   
   	
   public void setResolucao(int resolucao){
   	this.resolucao = resolucao;
   }
   
   public String getMarca(){
   	return marca;
   }

   public final void setMarca(String marca){
   	this.marca = marca;
   }
   
   
  
   

 
    
}
