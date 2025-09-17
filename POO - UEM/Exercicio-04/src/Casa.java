
public class Casa  {
    private String corCasa;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;


    public Casa(String cor,Porta porta1, Porta porta2, Porta porta3) {
        this.corCasa = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
        
        
        
        
    } 
    
    

    public String getCorCasa() {
        return corCasa;
    }

    public void setCorCasa(String corCasa) {
        this.corCasa = corCasa;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }
    
    public int quantasEstaoAbertas() {
        int portaAberta = 0;
        if(porta1.isAberta() == true) {
            portaAberta += 1;
        }
        if(porta2.isAberta() == true) {
            portaAberta +=1;
        }
        if(porta3.isAberta() == true) {
            portaAberta += 1;
        }
        System.out.print("O numero de portas abertas: ");
        return portaAberta;
        
    }
    
    
    

    
    
    

    



    
    
    
    
}
