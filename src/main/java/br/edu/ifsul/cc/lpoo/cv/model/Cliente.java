package br.edu.ifsul.cc.lpoo.cv.model;

import java.util.Calendar;

public class Cliente extends Pessoa {
    private Calendar data_ulima_visita;
    private Agenda agenda;

    public Cliente() {

    }

    public Calendar getData_ulima_visita() {
        return data_ulima_visita;
    }

    public void setData_ulima_visita(Calendar data_ulima_visita) {
        this.data_ulima_visita = data_ulima_visita;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
}


