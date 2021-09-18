
package paquete1;


class Clase1 {
    
   private String atributoDefault = "valor atributo privado";

    private Clase1() {
        System.out.println("Constructor privado");
    }
     public Clase1(String ars){
         this();
         System.out.println("Constructor Publico"); 
    }
//    public Clase1(String atributo){
//        System.out.println("Constructor Publico");
//    }
    private void metodoPrivado(){
        
        System.out.println("Metodo private");
    }

    public String getAtributoDefault() {
        return atributoDefault;
    }

    public void setAtributoDefault(String atributoDefault) {
        this.atributoDefault = atributoDefault;
    }
   
    
}
