package br.com.autocarsservice.model;

public class Cliente {

    private int id = 0;
    private String nome;
    private String telefone;
    private String email;


    //GET E SETTER DO ID DO CLIENTE
        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id = id;
        }

    //GET E SETTER DO NOME DO CLIENTE
        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }

    //GET E SETTER DO TELEFONE DO CLIENTE
        public String getTelefone(){
            return telefone;
        }
        public void setTelefone(String telefone){
            this.telefone = telefone;
        }

    //GET E SETTER DO EMAIL DO CLIENTE
        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email = email;
        }


}
