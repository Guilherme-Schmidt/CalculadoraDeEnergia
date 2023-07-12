//Guilherme Schmidt Lingnau RA: 2210924




public final class Impressora extends Dispositivos implements Calc{

   private String tecnologia;
   private String conexao;
   
   
   
   public Impressora(){
   	tecnologia = "";
   	conexao = "";
   }
	//Sobrecarga
   public Impressora(String tecnologia, String conexao){
	this.tecnologia = tecnologia;
	this.conexao = conexao;
		
   }
   //Sobrescrita
    public double calcular(){
	double impPot = (getPotencia()*getHoras()*getDias());
   	return impPot;
    }
    
    //Sobrescrita
    public double gastoTotal(){
	double impPot = calcular();
	double impGasto = (impPot / 100) * taxa;
	return impGasto;	
    }
   
    public String getTecnologia(){
   	return tecnologia;
    }
	
	
    public String getMarca(){
        return marca;
   }
	

    public final void setMarca(String marca){
        this.marca = marca;
    }

    public String getConexao(){
        return conexao;
   }

    public void setTecnologia(String tecnologia) {
   	this.tecnologia = tecnologia;
   }

   public void setConexao(String conexao)throws ConecErrException{

	if(conexao.equalsIgnoreCase("Wifi") || conexao.equalsIgnoreCase( "USB")){
     		this.conexao = conexao;
	}
	else {
		throw new ConecErrException();
	}
   }   

}
