package br.com.autocarsservice.service;
import br.com.autocarsservice.model.Cliente;

import java.util.ArrayList;


public class ClienteService {

        ArrayList<Cliente> listaDeClientes = new ArrayList<>();

        public void adicionarCliente(Cliente cliente) {
            listaDeClientes.add(cliente);
        }

        public int quantidadeClientes(){
            return listaDeClientes.size();

        }

        public void listarClientes(){
            for(Cliente clienteAtual : listaDeClientes){
                System.out.println("ID: " + clienteAtual.getId());
                System.out.println("Email: " + clienteAtual.getEmail());
                System.out.println("Nome: " + clienteAtual.getNome());
                System.out.println("Telefone: " + clienteAtual.getTelefone());


            }
        }
}
