import java.util.Scanner;

public class EjercicioFinalThread extends Thread 
{

	private String tipo;
	private int sup;
	private int espera;

	public EjercicioFinalThread(String pTipo, int pSuperior, int pEspera)
	{
		System.out.println("Extendiendo la clase Thread");
		this.tipo = pTipo;
		this.sup = pSuperior;
		this.espera = pEspera;
	}

	public void run()
	{
		try
		{
			if(tipo.equals("impar"))
			{
				for(int i = 1; i<=sup; i++)
				{
					if(i%2!=0)
					{
						System.out.println(i);
						Thread.sleep(espera);
					}
				}
			}
			else if(tipo.equals("par"))
			{
				for(int i = 1; i<=sup; i++)
				{
					if(i%2==0)
					{
						System.out.println(i);
						Thread.sleep(espera);
					}
				}
			}
		}
		catch(Exception E) {}
		System.out.println("Saliendo: " + tipo);
	}

	public static void main(String[] args)
	{
		System.out.println("Ingrese el límite superior");
		Scanner in = new Scanner(System.in);
		int limite = in.nextInt();
		EjercicioFinalThread t0 = new EjercicioFinalThread("impar",limite,50);
		EjercicioFinalThread t1 = new EjercicioFinalThread("par",limite,50);

		t0.start();
		t1.start();
	}
}
