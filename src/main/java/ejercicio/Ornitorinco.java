package ejercicio;
import java.util.Scanner;
public class Ornitorinco {

		public static void main(String[] args) {

           
            boolean respuesta=true;
            byte hombres=0;
            byte mujeres=0;
            short vecesmuerto=0;
            
            
            
            do {
            	 Scanner scan = new Scanner(System.in);
            
            System.out.println("Escribe h si eres hombre,"
            		+ "  m si eres mujer o n si es neutro");

            String respuesta1 = scan.nextLine();
            
            char genero = 'x';

            switch (respuesta1) {

            case "h":

            case "hombre":

            case "H":

            case "Hombre":

                    genero = 'h';
                    hombres++;
                    break;

            case "m":

            case "mujer":

            case "Mujer":

            case "M":

                    genero = 'm';
                    mujeres++;
                    break;

            case "n":

                    genero = 'n';

                    break;

            default:

                    genero = 'n';

                    break;

            }


            System.out.print("Dime el nº de alumnos de tu aula.\n");

            byte nAlumnos = Byte.parseByte(scan.nextLine());

            System.out.println("Cenec, 24 de Octubre, " + nAlumnos

                            + " estudiantes están en el \"aula 2\"\n aguantando el sopor"

                            + " de la clase de programación. De repente,\n " + " "
                            + "cae un ornitorrinco con metralletas del tragaluz."

                            + "¿Qué haces?"
                            + "\n\t1 - Le tiras tu monitor a la cabeza"

                            + "\n\t2 - Le dices \"Juan Carlos\",¿Dónde te habías metido?" 
                            + "\n\t3 -Me escondo"
                            + "\n\t4 -Salgo corriendo gritando MARICON EL ULTIMO"
                            + "\n\t5 -No hago nada si me quedo quieto no me ve"
                            + "\n\t6 -Me quedo flipando y me muero del susto"
            		
            		
            		);

            byte opcion = Byte.parseByte(scan.nextLine());


            switch (opcion) {

            case 1:

                    System.out.println("Le da una patada ninja al monitor y te lo devuelve");
                    vecesmuerto++;
                    break;

            case 2:

                    System.out.println("Te pega un tiro, y te dice: " + "Me llamo cancamuso, "
                    		+ "so payas"

                                    + (genero == 'h' ? 'o' : genero == 'm' ? 'a' : 'e') + ": "
                                    		+ "Muere. Has Muerto");
                    vecesmuerto++;
                    break;

            case 3:

                    System.out.println("Se lía a metralletazos, a tí" + " no te mata,\n "
                    		+ "porque te has escondido,"

                           + "pero se carga a " + (nAlumnos * 60 / 100) + " compañeros");

                    break;
            case 4:
            	 System.out.println("Se te queda mirando y eres el primero que muere.");
            	 vecesmuerto++;
                 break;
            case 5:
           	 System.out.println("INCREIBLE NI TE VIO Y PUDISTE SOBREVIVIR");

                break;
            case 6:
              	 System.out.println("Te moriste del shock que has sufrido");
              	vecesmuerto++;
                   break;
                 default:

                            System.out.println("Tenías que poner un número"

                                            + " entre 1 y 6");

                            break;

            }
            System.out.println("¿Quieres seguir jugando?");
    		//Pedir por teclao si o no
    		if (!scan.nextLine().equalsIgnoreCase("si")) {
    			respuesta=false;
    		}
    	}while (respuesta==true);
            System.out.println("Han jugado un total de " + hombres);
            System.out.println("Han jugado un total de " + mujeres);
            System.out.println("Has muerto un total de " +vecesmuerto + " veces");
		}

    }
