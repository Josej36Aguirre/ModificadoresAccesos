
package paquete1;





public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Public");
        clase1.setAtributoDefault("Cambio de valor atributo privado");
        System.out.println("Atributo privado = "+clase1.getAtributoDefault());
    }
}
