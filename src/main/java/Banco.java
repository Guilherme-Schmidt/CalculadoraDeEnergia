// Guilherme Schmidt Lingnau RA: 2210924

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Banco {
   
    private static Banco bancoUnico;
    static List<Computador> BDComp= new ArrayList<Computador>();
    static List<Televisao> BDTele = new ArrayList<Televisao>();
    static List<Impressora> BDImp = new ArrayList<Impressora>();

    public static Banco getBanco(){
        if(bancoUnico == null){
            bancoUnico = new Banco();
        }
        return bancoUnico;
    }
    
    public static List<Computador> getBdComp(){
        return BDComp;
    }
    
    public static List<Televisao> getBdTele(){
        return BDTele;
    }
    
    public static List<Impressora> getBdImp(){
        return BDImp;
    }
        
    public static Computador cadComp(Computador comp){

		if(consComp(comp)== null){
			BDComp.add(comp);
			return comp;
		}
		else{
			return null;
		}

	}

     public static Computador consComp(Computador c1){
		for(int i = 0; i < BDComp.size(); i++){
			if(c1.getMarca().equals(BDComp.get(i).getMarca())){
				return BDComp.get(i);
			}
		}
                return null;
	}
  
    public static Computador altComp(Computador c1){
            for(int i = 0; i < BDComp.size(); i++){
                    if(c1.getMarca().equals(BDComp.get(i).getMarca())){
                       
                       
                        String Horas = JOptionPane.showInputDialog(null,"NOVA HORA","ATUALIZAR HORAS",1);
                        try {
                            BDComp.get(i).setHoras(Integer.parseInt(Horas));
                        }  
                        catch(HorasDiaException ex){
                            JOptionPane.showMessageDialog(null, "Horas invalidas !", "Cadastro OK", 1);
                        }
                        catch(NumberFormatException nfe){
                             JOptionPane.showMessageDialog(null, "As Horas devem deve ser numero inteiro !", "Cadastro OK", 1);
                        }
                        String Dias = JOptionPane.showInputDialog(null,"NOVO DIA","ATUALIZAR DIA",1);
                        try{  
                            BDComp.get(i).setDias(Integer.parseInt(Dias));
                        }
                         catch (NumberFormatException nfe){
                            JOptionPane.showMessageDialog(null, "O dia deve ser numero inteiro !", "Cadastro Invalido", 1); 
                        }
                        String Potencia = JOptionPane.showInputDialog (null,"NOVA POTENCIA", "ATUALIZAR POTENCIA",    1  );
                        try{
                            
                            BDComp.get(i).setPotencia(Integer.parseInt(Potencia));
                        }
                        catch (NumberFormatException nfe){
                            JOptionPane.showMessageDialog(null, "A Potencia deve ser numero inteiro !", "Cadastro Invalido", 1);
                        }
                        return BDComp.get(i);
                    }   
            }
            return null;
  }
  
    public static Computador excComp(Computador c1){
    	for(int i = 0; i < BDComp.size(); i++){
                    if(c1.getMarca().equals(BDComp.get(i).getMarca())){
                        BDComp.remove(BDComp.get(i));
                        return null;
                    }
            }
            return c1;	
    }

  
    public static Televisao cadTelev(Televisao telev){
        if(consTelev(telev)== null){
                BDTele.add(telev);
                    return telev;
		}
        else{
                return null;
        }
    }
    public static Televisao consTelev(Televisao t1){
		for(int i = 0; i < BDTele.size(); i++){
                    if(t1.getMarca().equals(BDTele.get(i).getMarca())){
                        return BDTele.get(i);
                    }
		}
            return null;
	}

    public static Televisao altTelev(Televisao t1){
        for(int i=0;i<BDTele.size();i++){
            if(t1.getMarca().equals(BDTele.get(i).getMarca())){
                
                String Potencia = JOptionPane.showInputDialog (null,"NOVA POTENCIA", "ATUALIZAR POTENCIA",    1  );
                try{
                    BDTele.get(i).setPotencia(Integer.parseInt(Potencia));
                }
                catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "A potencia deve ser numero inteiro !", "Cadastro Invalido", 1);
                }
                String Horas = JOptionPane.showInputDialog(null,"NOVA HORA","ATUALIZAR HORAS",1);
                try {
                    BDTele.get(i).setHoras(Integer.parseInt(Horas));
                }  
                catch(HorasDiaException ex){
                    JOptionPane.showMessageDialog(null, "Horas invalidas !", "Cadastro OK", 1);
                }
                catch(NumberFormatException nfe){
                     JOptionPane.showMessageDialog(null, "As Horas devem deve ser numero inteiro !", "Cadastro OK", 1);
                }
                String Dias = JOptionPane.showInputDialog(null,"NOVO DIA","ATUALIZAR DIA",1);
                try{  
                    BDTele.get(i).setDias(Integer.parseInt(Dias));
                }
                 catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "o dia deve ser numero inteiro !", "Cadastro Invalido", 1); 
                }
                return BDTele.get(i);
            }   
        }
        return null;
    }
 
    public static Televisao excTelev(Televisao t1){
        for(int i =0;i<BDTele.size();i++){
                    if(t1.getMarca().equals(BDTele.get(i).getMarca())){
                        BDTele.remove(BDTele.get(i));
                        return null;
                    }
                }
            return t1;
    }
  
    public static Impressora excImpre(Impressora i1){
        for(int i=0;i<BDImp.size();i++){
            if(i1.getMarca().equals(BDImp.get(i).getMarca())){
                    BDImp.remove(BDImp.get(i));
                    return null;
            }
        }
        return i1; 
    }
    public static Impressora cadImpre(Impressora impre){
        if(consImpre(impre)== null){
			BDImp.add(impre);
			return impre;
		}
		else{
			return null;
		}
    }

    public static Impressora consImpre(Impressora i1){
        for(int i = 0;i<BDImp.size();i++){
            if(i1.getMarca().equals(BDImp.get(i).getMarca())){
                return BDImp.get(i);
            }
        }
        return null ; 
  }

    public static Impressora altImpre(Impressora i1){
         for(int i = 0;i<BDImp.size();i++){
            if(i1.getMarca().equals(BDImp.get(i).getMarca())){
                        String Potencia = JOptionPane.showInputDialog (null,"NOVA POTENCIA", "ATUALIZAR POTENCIA",    1  );
                        try{
                            BDImp.get(i).setPotencia(Integer.parseInt(Potencia));
                        }
                        catch (NumberFormatException nfe){
                            JOptionPane.showMessageDialog(null, "A Potencia deve ser numero inteiro !", "Cadastro Invalido", 1);
                        }
                        String Horas = JOptionPane.showInputDialog(null,"NOVA HORA","ATUALIZAR HORAS",1);
                        try {
                            BDImp.get(i).setHoras(Integer.parseInt(Horas));
                        }  
                        catch(HorasDiaException ex){
                            JOptionPane.showMessageDialog(null, "Horas invalidas !", "Cadastro OK", 1);
                        }
                        catch(NumberFormatException nfe){
                             JOptionPane.showMessageDialog(null, "As Horas devem deve ser numero inteiro !", "Cadastro OK", 1);
                        }
                        String Dias = JOptionPane.showInputDialog(null,"NOVO DIA","ATUALIZAR DIA",1);
                        try{  
                            BDImp.get(i).setDias(Integer.parseInt(Dias));
                        }
                         catch (NumberFormatException nfe){
                            JOptionPane.showMessageDialog(null, "o dia deve ser numero inteiro !", "Cadastro Invalido", 1); 
                        }
                        return BDImp.get(i);
                    }   
            }
            return null;
    }
}
            