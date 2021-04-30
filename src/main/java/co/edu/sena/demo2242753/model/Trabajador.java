package co.edu.sena.demo2242753.model;

public class Trabajador {
    private String nombres;
    private String apellidos;
    private String documento;
    private String díasTrabajados;
    private String sueldoMensual;

    public Trabajador(String nombres, String apellidos, String documento, String díasTrabajados, String sueldoMensual) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.díasTrabajados = díasTrabajados;
        this.sueldoMensual = sueldoMensual;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDíasTrabajados() {
        return díasTrabajados;
    }

    public void setDíasTrabajados(String díasTrabajados) {
        this.díasTrabajados = díasTrabajados;
    }

    public String getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(String sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public void subsidioTransporte (){
        int subsidioTransporte;
        subsidioTransporte  = (int) (3.548 * 30);
    }

    public void sueldoPagar (){
        String sueldo = String.valueOf(0);
        int subsidioTransporte = 0;
        sueldo = sueldoMensual + subsidioTransporte;
    }



}
