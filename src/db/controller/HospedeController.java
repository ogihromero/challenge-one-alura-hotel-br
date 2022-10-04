package db.controller;

import db.dao.HospedeDAO;
import db.factory.ConnectionFactory;
import db.modelo.Hospede;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

public class HospedeController {
    private HospedeDAO hospedeDAO;

    public HospedeController() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.hospedeDAO = new HospedeDAO(connection);
    }

    public void deletar(Integer id) {
        this.hospedeDAO.deletar(id);
    }

    public void salvar(Hospede hospede) {
        this.hospedeDAO.salvar(hospede);
    }

    public List<Hospede> listar() {
        return this.hospedeDAO.buscar();
    }

    public List<Hospede> listarHospedesId(String id) {
        return this.hospedeDAO.buscarId(id);
    }
    public void alterar(String nome, String sobrenome, Date dataNascimento, String nacionalidade, String telefone, Integer idReserva, Integer id) {
        this.hospedeDAO.alterar(nome, sobrenome, dataNascimento, nacionalidade, telefone, idReserva, id);
    }
}
