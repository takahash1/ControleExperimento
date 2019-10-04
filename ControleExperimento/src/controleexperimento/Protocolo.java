package controleexperimento;

import java.util.Date;

public class Protocolo {

    private String status;
    private String justificativa;
    private String resumoPort;
    private String resumoIng;
    private Date dataini;
    private Date datafim;
    private String especie;
    private int qtdAnimalEspecie;

    public Protocolo(String status, String justificativa, String resumoPort, String resumoIng, Date dataini, Date datafim, String especie, int qtdAnimalEspecie) {

        this.status = status;
        this.justificativa = justificativa;
        this.resumoPort = resumoPort;
        this.resumoIng = resumoIng;
        this.dataini = dataini;
        this.datafim = datafim;
        this.especie = especie;
        this.qtdAnimalEspecie = qtdAnimalEspecie;
    }
    
    public String getStatus(){
        return (this.status);
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    public String getJustificativa(){
        return (this.justificativa);
    }
    
    public void setJustificativa(String justificativa){
        this.justificativa = justificativa;
    }
    public String getResumoPort(){
        return (this.resumoPort);
    }
    
    public void setResumoPort(String resumoPort){
        this.resumoPort = resumoPort;
    }
    
    public String getResumoIng(){
        return (this.resumoIng);
    }
    
    public void setResumoIng(String resumoIng){
        this.resumoIng = resumoIng;
    }
    
    public Date getDataini(){
        return (this.dataini);
    }
    
    public void setDataini(Date dataini){
        this.dataini = dataini;
    }
    
    public Date getDatafim(){
        return (this.datafim);
    }
    
    public void setDatafim(Date datafim ){
        this.datafim = datafim;
    }
    
    public String getEspecie(){
        return (this.especie);
    }
    
    public void setEspecie(String especie){
        this.especie = especie;
    }
    
    public int getQtdAnimalEspecie(){
        return (this.qtdAnimalEspecie);
    }
    
    public void setQtdAnimalEspecie (int qtdAnimalEspecie){
        this.qtdAnimalEspecie = qtdAnimalEspecie;
    }
}

