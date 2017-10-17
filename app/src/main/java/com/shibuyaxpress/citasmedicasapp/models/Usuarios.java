package com.shibuyaxpress.citasmedicasapp.models;

/**
 * Created by paulf on 16-Oct-17.
 */

public class Usuarios {
    private String usuario_id;
    private String usuario_nombre;
    private String usuario_clave;
    private String usuario_tipo;
    private String usuario_registro_fecha;

    public Usuarios(String usuario_id, String usuario_nombre, String usuario_clave, String usuario_tipo, String usuario_registro_fecha) {
        this.usuario_id = usuario_id;
        this.usuario_nombre = usuario_nombre;
        this.usuario_clave = usuario_clave;
        this.usuario_tipo = usuario_tipo;
        this.usuario_registro_fecha = usuario_registro_fecha;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUsuario_nombre() {
        return usuario_nombre;
    }

    public void setUsuario_nombre(String usuario_nombre) {
        this.usuario_nombre = usuario_nombre;
    }

    public String getUsuario_clave() {
        return usuario_clave;
    }

    public void setUsuario_clave(String usuario_clave) {
        this.usuario_clave = usuario_clave;
    }

    public String getUsuario_tipo() {
        return usuario_tipo;
    }

    public void setUsuario_tipo(String usuario_tipo) {
        this.usuario_tipo = usuario_tipo;
    }

    public String getUsuario_registro_fecha() {
        return usuario_registro_fecha;
    }

    public void setUsuario_registro_fecha(String usuario_registro_fecha) {
        this.usuario_registro_fecha = usuario_registro_fecha;
    }
}
