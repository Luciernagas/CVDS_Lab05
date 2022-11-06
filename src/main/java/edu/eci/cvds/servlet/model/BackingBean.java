package edu.eci.cvds.servlet.model;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import java.util.Random;

@SessionScoped
@ManagedBean(name = "guessBean")
public class BackingBean {
    private int numeroAleatorio;

    private int n_intento;

    private int intentos;

    private int premio;

    private String estadoJuego;

    public BackingBean(){
        iniciar();
    }

    private void iniciar(){
        Random ran = new Random();
        this.numeroAleatorio = ran.nextInt(10);
        this.intentos = 0;
        this.n_intento = 0;
        this.premio = 100000;
        this.estadoJuego = "Perdiste :(";
    }

    public void juego(ActionEvent actionEvent){
        this.intentos += 1;
        if(this.n_intento == this.numeroAleatorio && this.intentos <= 10){
            this.estadoJuego = "Ganaste :) : " + getPremio();
        }
        else{
            if(this.premio != 0){
                this.premio -= 10000;
            }

        }
    }

    public void reinciar(ActionEvent actionEvent){
        iniciar();
    }
    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public int getN_intento() {
        return n_intento;
    }



    public void setRandomNumber() {
        this.numeroAleatorio = numeroAleatorio;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    public String getEstadoJuego() {
        return estadoJuego;
    }

    public void setEstadoJuego(String estadoJuego) {
        this.estadoJuego = estadoJuego;
    }
    public void setN_intento(int n_intento) {
        this.n_intento = n_intento;
    }
}
