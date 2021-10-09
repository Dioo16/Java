

public class Lampada {
    private int potencia;
    private String tipo;
    private int voltagem;
    private boolean status;

    

    
    

    public verificarstatus()
    {
        return this.status;
    }

    public void acender(){
        this.status = true;
    }
    
    public void apagar(){
        this.status = false;


    }


   
    public Lampada(int potencia, String tipo, int voltagem, boolean status){
        this.potencia = potencia;
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.status = status;

    }




    public int getPotencia(){
        return this.potencia;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;   
    }

    public int getvoltagem(){
        return this.voltagem;
    }

    public void setvoltagem(int voltagem){
        this.voltagem = potencia;   
    }


    public String gettipo(){
        return this.tipo;
    }

    public void settipo(String tipo){
        this.tipo = tipo;   
    }

    public boolean getstatus(){
        return this.status = status;
    }

    public void setstatus(boolean status){
        this.status = status;
    }


}
