//Guilherme Schmidt Lingnau RA: 2210924

public final class Computador extends Dispositivos implements Calc{

    	private int qtdMemoria;
    	private String processador;
    	private String video;
    	private String monitorMarca;
    	private int monitorRes;
    	
    	public Computador(){
    		qtdMemoria = 0;
    		processador = "";
    		video = "";
    		monitorMarca = "";
    		monitorRes = 0;
    	}
	   	
    	//Sobrescrita
    	public double calcular(){
    		return (getPotencia()*getHoras()*getDias());
    	}

	//Sobrescrita
	public double gastoTotal(){
		double compPot = calcular();
		double compGasto = (compPot / 100)* taxa ;
		return compGasto;
	}
        
        public double getGastoTotal(){
            return gastoTotal();
        
        }
    	public String getMarca(){
   		return marca;
   	}

	//Sobrescrita
	public final void setMarca(String marca, String modelo){
		this.marca = marca + " " + modelo;
	}
   	
    	public int getQtdMemoria(){
    		return qtdMemoria;
    	}
    	
    	public String getProcessador(){
    		return processador;
    	
    	}
    	public String getVideo(){
    		return video;
    	}
    	
    	public String getMonitorMarca(){
    		return monitorMarca;
    	}
    	
    	public int getMonitorRes(){
    		return monitorRes;
    	}

    	public final void setQtdMemoria(int qtdMemoria)throws MemPeqException{
		if(qtdMemoria >0){
			if(qtdMemoria >= 2 && qtdMemoria <=64){
                            this.qtdMemoria = qtdMemoria;
			}
    			else {
                            throw new MemPeqException();
			}
    		}
	}

	public final void setProcessador(String processador){
		this.processador = processador;
	}
	
	public final void setVideo(String video){
		this.video = video;
	}
	
	public final void setMonitorMarca(String monitorMarca){
		this.monitorMarca = monitorMarca;
	}
	
	public final void setMonitorRes(int monitorRes){
		this.monitorRes = monitorRes;
	} 
}
