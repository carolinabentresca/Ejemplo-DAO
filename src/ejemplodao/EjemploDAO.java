package ejemplodao;

import dao.ClienteDao;
import iDao.IClienteDao;

public class EjemploDAO {

    public static void main(String[] args) {

        //Instanciamos clase interface y Clase que la implementa
        IClienteDao clienteDao = new ClienteDao();
        //Mostramos por pantalla una lista de Clientes
       clienteDao.obtenerClientes().forEach(System.out::println);

    }

}
