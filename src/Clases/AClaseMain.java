//15 de abril de 2024
//Patricio Arturo Mendez Gonzalez
package Clases;


public class AClaseMain {
    public static void main(String[] args) {
             
        AClaseMain clasemain = new AClaseMain();
        
        clasemain.Lapiz();
//        clasemain.Serie();
//        clasemain.Videojuego();
//        clasemain.Videojuego();
//        clasemain.Vehiculo();
//        clasemain.Persona();
//        clasemain.Alumno();
//        clasemain.Credencial();
//        clasemain.Computadora();
//        clasemain.Televisor();
//        clasemain.Casa();
//        clasemain.Libro();
//        clasemain.CuentaBancaria();
//        clasemain.Celular();
//        clasemain.Mochila();
                        
    }
    
    public void Lapiz(){
        Lapiz lapiz = new Lapiz();
        
        lapiz.setColor("Amarillo");
        lapiz.setMaterial("Madera");
        lapiz.setPrecio(2.99);
        lapiz.setTamanio(15);
        lapiz.setMarca("KANSEKA");
        
        System.out.println(lapiz.escribir("Hola gente"));
        System.out.println(lapiz.borrar("Hola", true));
        System.out.println(lapiz.dibujarPersona(true));  
        
        System.out.println(lapiz.toString());
        
    }
    
    public void Serie(){
        Serie serie = new Serie("Plaza Sesamo", 1400, 30, 1990, "Infantil ");
        
        System.out.println(serie.reproducir(true));
        System.out.println(serie.pausar(true));
        System.out.println(serie.saltarIntro(true));
        
        System.out.println(serie.toString());
    }
    
    public void Videojuego(){
        Videojuego videojuego = new Videojuego();
        
        videojuego.setAño(2021);
        videojuego.setCalidadgrafica("Alta");
        videojuego.setPeso(155);
        videojuego.setTitulo("Pokemon");
        videojuego.setTrama("Aventura");
        
        System.out.println(videojuego.controles("Teclado"));
        System.out.println(videojuego.jugar(true));
        System.out.println(videojuego.mostrarPuntaje(2000));
        
        System.out.println(videojuego.toString());
    }
    
    public void Vehiculo(){
        Vehiculo vehiculo = new Vehiculo("Ford", "Ka", "Manual", 2001, "Gris");
        
        System.out.println(vehiculo.avazar(true));
        System.out.println(vehiculo.frenar(true));
        System.out.println(vehiculo.retroceder(true));
        
        System.out.println(vehiculo.toString());
    }
    
    public void Persona(){
        Persona persona = new Persona(){};
        
        persona.setNombre("Pato");
        persona.setEdad(19);
        persona.setSexo('H');
        persona.setEstatura(1.85);
        persona.setNacionalidad("Mexicana");
        
        System.out.println(persona.comer("Pollo"));
        System.out.println(persona.dormir(true));
        System.out.println(persona.respirar(true));  
        
        System.out.println(persona.toString());
        
    }
    
    public void Alumno(){
        Alumno alumno = new Alumno("Patricio", 19, "TICS", "TI23110156", 8);
        
        System.out.println(alumno.estudiar(true));
        System.out.println(alumno.hacerTarea(true));
        System.out.println(alumno.sacarPromedio(7, 8.5, 8.8));
        
        System.out.println(alumno.toString());
    }
    
    public void Credencial(){
        Credencial credencial = new Credencial();
        
        credencial.setNombre("Patricio");
        credencial.setEdad(19);
        credencial.setId("ABCD1234");
        credencial.setSexo('H');
        credencial.setDireccion("Salvatierra #1234");
        
        System.out.println(credencial.identificar("Patricio"));
        System.out.println(credencial.informacion("Patricio", 19));
        System.out.println(credencial.permitirVotar(19));
        
        System.out.println(credencial.toString());
    }
    
    public void Computadora(){
        Computadora computadora = new Computadora("Hp", "14 dk1508la", 8, 256, "1920x1080");

        System.out.println(computadora.encender(true));
        System.out.println(computadora.abrirProgramas(1));
        System.out.println(computadora.apagar(true));
        
        System.out.println(computadora.toString());
    }
    
    public void Televisor(){
        Televisor televisor = new Televisor(){};
        
        televisor.setMarca("Toshiba");
        televisor.setColor("Negro");
        televisor.setPulgadas(28);
        televisor.setRelaciondeaspecto("16:9");
        televisor.setSeñal("Digital");
        
        System.out.println(televisor.encender(true));
        System.out.println(televisor.cambiarCanal(1));
        System.out.println(televisor.apagar(true));
        
        System.out.println(televisor.toString());
    }
    
    public void Casa(){
        Casa casa = new Casa("Salvatierra #1234", "Verde", 250, 4, 8);
        
        System.out.println(casa.abrirPuerta(true));
        System.out.println(casa.abrirVentana(true));
        System.out.println(casa.encenderLuces(true));
        
        System.out.println(casa.toString());
    }
    
    public void Libro(){
        Libro libro = new Libro();
        
        libro.setTitulo("El principe");
        libro.setAutor("Nicolas Maquiavelo");
        libro.setAño(1600);
        libro.setEditorial("Desconocida");
        libro.setPaginas(100);
        
        System.out.println(libro.abrirLibro(true));
        System.out.println(libro.pasarPagina(10, 5));
        System.out.println(libro.cerrarLibro(true));
        
        System.out.println(libro.toString());
    }
    
    public void CuentaBancaria(){
        CuentaBancaria cuenta = new CuentaBancaria("Patricio", 123456789, "BBVA", 100.00, "Sin movimientos");
        
        System.out.println(cuenta.depositar(100.00));
        System.out.println(cuenta.transferir(50.00));
        System.out.println(cuenta.retirar(50.00));
        
        System.out.println(cuenta.toString());
    }
    
    public void Celular(){
        Celular celular = new Celular();
        
        celular.setMarca("Cubot");
        celular.setModelo("X70");
        celular.setRam(12);
        celular.setAlmacenamiento(256);
        celular.setCapacidadbateria(5200);
        
        System.out.println(celular.encender(true));
        System.out.println(celular.abrirApp(1));
        System.out.println(celular.apagar(true));
        
        System.out.println(celular.toString());
    }
    
    public void Mochila(){
        Mochila mochila = new Mochila("The north face", "Blanca", 4, 2, 4);
        
        System.out.println(mochila.abrirMochila(true));
        System.out.println(mochila.guardarCosas("Laptop"));
        System.out.println(mochila.sacarCosas("Lapices"));
        
        System.out.println(mochila.toString());
    }
    
}

