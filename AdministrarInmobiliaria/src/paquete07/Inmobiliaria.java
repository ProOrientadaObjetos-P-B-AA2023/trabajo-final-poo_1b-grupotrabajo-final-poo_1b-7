package paquete07;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;

import java.io.*;
import java.util.*;

public class Inmobiliaria {
    private List<Propietario> propietarios;
    private List<Barrio> barrios;
    private List<Ciudad> ciudades;
    private List<Constructora> constructoras;
    private List<Casa> casas;
    private List<Departamento> departamentos;

    public Inmobiliaria() {
        propietarios = new ArrayList<>();
        barrios = new ArrayList<>();
        ciudades = new ArrayList<>();
        constructoras = new ArrayList<>();
        casas = new ArrayList<>();
        departamentos = new ArrayList<>();
    }

    public void ListaPropietarios(Propietario propietario) {
        propietarios.add(propietario);
    }

    public void ListaBarrio(Barrio barrio) {
        barrios.add(barrio);
    }


    public void ListaCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }

    public void ListaConstructora(Constructora constructora) {

        constructoras.add(constructora);
    }

    public void ListaCasa(Casa casa) {
        casas.add(casa);
    }

    public void ListaDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void ArchivoCiudad() {
        try {
            FileOutputStream fileOut = new FileOutputStream("ciudades.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(ciudades);
            out.close();
            fileOut.close();
            System.out.println("Se han guardado las ciudades correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ArchivoCasa() {
        try {
            FileOutputStream fileOut = new FileOutputStream("casas.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(casas);
            out.close();
            fileOut.close();
            System.out.println("Se han guardado las casas correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ArchivoConstructora() {
        try {
            FileOutputStream fileOut = new FileOutputStream("constructoras.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(constructoras);
            out.close();
            fileOut.close();
            System.out.println("Se han guardado las constructoras correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ArchivoBarrio() {
        try {
            FileOutputStream fileOut = new FileOutputStream("barrios.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(barrios);
            out.close();
            fileOut.close();
            System.out.println("Se han guardado los barrios correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ArchivoPropietarios() {
        try {
            FileOutputStream fileOut = new FileOutputStream("propietarios.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(propietarios);
            out.close();
            fileOut.close();
            System.out.println("Se han guardado los propietarios correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ArchivoDepartamento() {
        try {
            FileOutputStream fileOut = new FileOutputStream("departamentos.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(departamentos);
            out.close();
            fileOut.close();
            System.out.println("Se han guardado los departamentos correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirPropietario() {
        try {
            FileInputStream fileIn = new FileInputStream("propietarios.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            List<Propietario> propietarios = (List<Propietario>) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Propietarios registrados:");
            for (Propietario propietario : propietarios) {
                System.out.println("Nombre: " + propietario.getNombres() + " Apellido: " + propietario.getApellidos() + " Identificación: " + propietario.getIdentificacion());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

        public void escribirBarrios() {
            try {
                FileInputStream fileIn = new FileInputStream("barrios.dat");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                List<Barrio> barrios = (List<Barrio>) in.readObject();
                in.close();
                fileIn.close();

                System.out.println("Barrios registrados:");
                for (Barrio barrio : barrios) {
                    System.out.println("Nombre del Barrio: " + barrio.getNombreBarrio() + " Referencia: " + barrio.getReferencia());
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        public void escribirCiudad() {
            try {
                FileInputStream fileIn = new FileInputStream("ciudades.dat");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                List<Ciudad> ciudades = (List<Ciudad>) in.readObject();
                in.close();
                fileIn.close();

                System.out.println("Ciudades registradas:");
                for (Ciudad ciudad : ciudades) {
                    System.out.println(ciudad.getNombreCiudad() + " - Provincia: " + ciudad.getNombreProvincia());
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        public void escribirConstructora() {
            try {
                FileInputStream fileIn = new FileInputStream("constructoras.dat");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                List<Constructora> constructoras = (List<Constructora>) in.readObject();
                in.close();
                fileIn.close();

                System.out.println("Constructoras registradas:");
                for (Constructora constructora : constructoras) {
                    System.out.println(constructora.getNombreConstructora() + " - ID Empresa: " + constructora.getIdEmpresa());
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        public void escribirCasa() {
            try {
                FileInputStream fileIn = new FileInputStream("casas.dat");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                List<Casa> casas = (List<Casa>) in.readObject();
                in.close();
                fileIn.close();

                System.out.println("Casas registradas:");
                for (Casa casa : casas) {
                    System.out.println("Propietario: " + casa.getPropietario().getNombres() + " " + casa.getPropietario().getApellidos() + "-" + casa.getPropietario().getIdentificacion());
                    System.out.println("Barrio: " + casa.getBarrio().getNombreBarrio() + " - Referencia: " + casa.getBarrio().getReferencia());
                    System.out.println("Ciudad: " + casa.getCiudad().getNombreCiudad() + " - Provincia: " + casa.getCiudad().getNombreProvincia());
                    System.out.println("Número de cuartos: " + casa.getNumeroCuartos());
                    System.out.println("Constructora: " + casa.getCosntructora().getNombreConstructora() + " - ID Empresa: " + casa.getCosntructora().getIdEmpresa());
                    System.out.println("Costo final: " + casa.getCostoFinal());
                    System.out.println("-----------------------");
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        public void escribirDepartamento(){
            try {
                FileInputStream fileIn = new FileInputStream("departamentos.dat");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                List<Departamento> departamentos = (List<Departamento>) in.readObject();
                in.close();
                fileIn.close();

                System.out.println("Departamentos registrados:");
                for (Departamento departamento : departamentos) {
                    System.out.println("Propietario: " + departamento.getPropietario().getNombres() + " " + departamento.getPropietario().getApellidos());
                    System.out.println("Barrio: " + departamento.getBarrio().getNombreBarrio() + " - Referencia: " + departamento.getBarrio().getReferencia());
                    System.out.println("Ciudad: " + departamento.getCiudad().getNombreCiudad() + " - Provincia: " + departamento.getCiudad().getNombreProvincia());
                    System.out.println("Edificio: " + departamento.getNombreEdificio());
                    System.out.println("Ubicación: " + departamento.getUnicacionDepartamento());
                    System.out.println("Constructora: " + departamento.getConstructora().getNombreConstructora() + " - ID Empresa: " + departamento.getConstructora().getIdEmpresa());
                    System.out.println("Costo final: " + departamento.getCostoFinal());
                    System.out.println("-----------------------");
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
}