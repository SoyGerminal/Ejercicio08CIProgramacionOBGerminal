package es.germinal;

public class Main {
    public static void main(String[] args) {
        Persona Germinal= new Persona();
        Germinal.setAge(44);
        Germinal.setName("Germinal");
        Germinal.setPhoneNumber(666555777);
        System.out.println("La edad que tiene la persona es: " + Germinal.getAge() + ". Su nombre es: " + Germinal.getName() + ". Su número de teléfono es: " + Germinal.getPhoneNumber());

    }
}
