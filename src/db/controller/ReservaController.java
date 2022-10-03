package db.controller;

import db.dao.ReservaDAO;
import db.factory.ConnectionFactory;
import db.modelo.Reserva;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

public class ReservaController {
    private ReservaDAO reservaDAO;

    public ReservaController() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.reservaDAO = new ReservaDAO(connection);
    }

    public void salvar(Reserva reserva) {
        this.reservaDAO.salvar(reserva);
    }

    public List<Reserva> buscar() {
        return this.reservaDAO.buscar();
    }

    public List<Reserva> buscarId(String id) {
        return this.reservaDAO.buscarId(id);
    }

    public void atualizar(Date dataEntrada, Date dataSaida, String valor, String formaPagamento, Integer id) {
        this.reservaDAO.alterar(dataEntrada, dataSaida, valor, formaPagamento, id);
    }

    public void deletar(Integer id) {
        this.reservaDAO.deletar(id);
    }
}
