
package expresionesregulares;

public class Formularios {
    private String nombre;
    private String regex;
    private String[] valido;
    private String[] invalido;
    private String prueba;
    private String reemplazo;

    public Formularios() {
        
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String[] getValido() {
        return valido;
    }

    public void setValido(String[] valido) {
        this.valido = valido;
    }

    public String[] getInvalido() {
        return invalido;
    }

    public void setInvalido(String[] invalido) {
        this.invalido = invalido;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getReemplazo() {
        return reemplazo;
    }

    public void setReemplazo(String reemplazo) {
        this.reemplazo = reemplazo;
    }
    
    
}
