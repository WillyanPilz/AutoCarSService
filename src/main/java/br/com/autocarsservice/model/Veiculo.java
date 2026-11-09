package br.com.autocarsservice.model;

public class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private Cliente cliente;

    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public Cliente getCliente(){return cliente;}
    public void setCliente (Cliente cliente){ this.cliente = cliente; }

}

