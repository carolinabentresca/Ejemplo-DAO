package dao;

import iDao.IClienteDao;
import java.util.*;
import model.Cliente;

public class ClienteDao implements IClienteDao {

    List<Cliente> clientes;

    public ClienteDao() {
        clientes = new ArrayList();
        Cliente cli1 = new Cliente(101, "Mariano", "Rodriguez", "Mariano@gmail.com");
        Cliente cli2 = new Cliente(102, "Federico", "Pereyra", "FedericoPereyra@gmail.com");
        Cliente cli3 = new Cliente(103, "Carolina", "King", "KingCarolina@gmail.com");
        Cliente cli4 = new Cliente(104, "Eliana", "Jimenez", "Eliana@gmail.com");
        Cliente cli5 = new Cliente(105, "Romina", "Farias", "RominaF@gmail.com");
        clientes.add(cli1);
        clientes.add(cli2);
        clientes.add(cli3);
        clientes.add(cli4);
        clientes.add(cli5);
    }

    //Método List
    @Override
    public List<Cliente> obtenerClientes() {
        return clientes;
    }

}
