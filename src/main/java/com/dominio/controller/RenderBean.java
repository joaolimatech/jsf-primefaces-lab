package com.dominio.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class RenderBean {

    private boolean mostrarTexto = false;

    public boolean isMostrarTexto() {
        return mostrarTexto;
    }

    public void exibirTexto() {
        this.mostrarTexto = true;
    }
}
