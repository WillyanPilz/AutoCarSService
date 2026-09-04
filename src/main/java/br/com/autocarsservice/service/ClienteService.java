package br.com.autocarsservice.service;
import br.com.autocarsservice.model.Cliente;

import java.util.ArrayList;


public class ClienteService {

        ArrayList<Cliente> lista_de_clientes = new ArrayList<>();

        public void adicionarCliente(Cliente cliente) {
            lista_de_clientes.add(cliente);
        }

        public int quantidadeClientes(){
            return lista_de_clientes.size();

        }

        public void listarClientes(){
            for(Cliente clienteAtual : lista_de_clientes){
                System.out.println("ID: " + clienteAtual.getId());
                System.out.println("Email: " + clienteAtual.getEmail());
                System.out.println("Nome: " + clienteAtual.getNome());
                System.out.println("Telefone: " + clienteAtual.getTelefone());


            }
        }




}
