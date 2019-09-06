public class Main {

    public static void main(String[] args) {
        Person persona1 = new Person();
        Teacher profesor1 = new Teacher();
        Student estudiante1 = new Student();

        persona1.setName("María");
        persona1.setLastName("Gemini");
        System.out.println("El nombre de la persona es " + persona1.getName());
        System.out.println("El apellido de la persona es " + persona1.getLastName());
        System.out.println(" ");

        profesor1.setName("Vladimir");
        profesor1.setLastName("Castaneda");
        profesor1.setMatter("Java");
        profesor1.setArea("Backend");


        System.out.println("El nombre del profesor es " + profesor1.getName());
        System.out.println("El apellido del profesor es " + profesor1.getLastName());
        System.out.println("La materia del profesor es " + profesor1.getMatter());
        System.out.println("El área del profesor es " + profesor1.getArea());
        System.out.println(" ");

        estudiante1.setName("Pepita");
        estudiante1.setLastName("Lapistolera");
        estudiante1.setEnrollment(1234);
        estudiante1.setCareer("Ingeniería");

        System.out.println("El nombre del estudiante es " + estudiante1.getName());
        System.out.println("El apellido del estudiante es " + estudiante1.getLastName());
        System.out.println("El número de matrícula de " + estudiante1.getName() + " es " + estudiante1.getEnrollment());
        System.out.println("La carrera de " + estudiante1.getName() + " es " + estudiante1.getCareer());
    }
}