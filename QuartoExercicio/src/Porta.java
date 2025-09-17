
public class Porta {
    private String cor;
    private boolean aberta;
    private int portaAberta;
    
    public Porta(String cor, boolean aberta) {
        this.cor = cor;
        this.aberta = aberta;
    }
    
    public String pinta(String cor) {
        this.cor = cor;
        return "mudou para: " + cor;
    }
    public int portasAbertas() {
        if(aberta = true){
            portaAberta += 1;
            
        }
        return portaAberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    
    public void abrir(){
        this.aberta = true;
        
    }
    
    public void fechar() {
        this.aberta = false;
    }
    
    
    
    

    

    
    

    
    
    
    
    
}


