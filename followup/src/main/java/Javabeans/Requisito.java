/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javabeans;

/**
 *
 * @author Jose Luiz
 */
public class Requisito {

    private String idReq;
    private String nomeReq;
    private String modReq;
    private String funcReq;
    private String dataReq;
    private String autorReq;
    private String udataReq;
    private String uautorReq;
    private int versaoReq;
    private String prioridadeReq;
    private String compReq;
    private int horaReq;
    private int estadoReq;
    private String faseReq;
    private String descricao;
    private Projeto Pro;
    
    public Requisito(){
    }
    
    public Requisito(String idReq, String nomeReq, String modReq, String funcReq, String dataReq, String autorReq, String udataReq,
    String uautorReq, int versaoReq, String prioridadeReq, String compReq, int horaReq, int estadoReq, String faseReq, String descricao){
        this.idReq = idReq;
        this.nomeReq = nomeReq;
        this.modReq = modReq;
        this.funcReq = funcReq; 
        this.dataReq = dataReq; 
        this.autorReq = autorReq; 
        this.udataReq = udataReq;
        this.uautorReq = uautorReq;
        this.versaoReq = versaoReq; 
        this.prioridadeReq = prioridadeReq; 
        this.compReq = compReq;
        this.horaReq = horaReq;
        this.estadoReq = estadoReq;
        this.faseReq = faseReq;
        this.descricao = descricao;
    }
    
    public String getIdReq() {
        return idReq;
    }

    public void setIdReq(String idReq) {
        this.idReq = idReq;
    }

    public String getNomeReq() {
        return nomeReq;
    }

    public void setNomeReq(String nomeReq) {
        this.nomeReq = nomeReq;
    }

    public String getModReq() {
        return modReq;
    }

    public void setModReq(String modReq) {
        this.modReq = modReq;
    }

    public String getFuncReq() {
        return funcReq;
    }

    public void setFuncReq(String funcReq) {
        this.funcReq = funcReq;
    }

    public String getDataReq() {
        return dataReq;
    }

    public void setDataReq(String dataReq) {
        this.dataReq = dataReq;
    }

    public String getAutorReq() {
        return autorReq;
    }

    public void setAutorReq(String autorReq) {
        this.autorReq = autorReq;
    }

    public String getUdataReq() {
        return udataReq;
    }

    public void setUdataReq(String udataReq) {
        this.udataReq = udataReq;
    }

    public String getUautorReq() {
        return uautorReq;
    }

    public void setUautorReq(String uautorReq) {
        this.uautorReq = uautorReq;
    }

    public int getVersaoReq() {
        return versaoReq;
    }

    public void setVersaoReq(int versaoReq) {
        this.versaoReq = versaoReq;
    }

    public String getPrioridadeReq() {
        return prioridadeReq;
    }

    public void setPrioridadeReq(String prioridadeReq) {
        this.prioridadeReq = prioridadeReq;
    }

    public String getCompReq() {
        return compReq;
    }

    public void setCompReq(String compReq) {
        this.compReq = compReq;
    }

    public int getHoraReq() {
        return horaReq;
    }

    public void setHoraReq(int horaReq) {
        this.horaReq = horaReq;
    }

    public int getEstadoReq() {
        return estadoReq;
    }

    public void setEstadoReq(int estadoReq) {
        this.estadoReq = estadoReq;
    }

    public String getFaseReq() {
        return faseReq;
    }

    public void setFaseReq(String faseReq) {
        this.faseReq = faseReq;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Projeto getPro() {
        return Pro;
    }

    public void setPro(Projeto Pro) {
        this.Pro = Pro;
    }

}
