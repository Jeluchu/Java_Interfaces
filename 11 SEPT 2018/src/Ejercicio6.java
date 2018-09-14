
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creando profes...
		Profesor profe1 = new Profesor("5678904T", "Txema Gonzalez", 1154.67, 8, true);
		Profesor profe2 = new Profesor("5934122B", "Jose L. Alvarez", 1328.02, 5, true);
		
		// creando personal de admon...
		Administracion admin1 = new Administracion("6459912L", "Enrique Donoso", 1552.22, 'H', 3);
		Administracion admin2 = new Administracion("7889594K", "Eva Puertas", 1466.31, 'M', 1);
		
		// creando directivos...
		Directivo d1 = new Directivo("5147331M", "Manuel de Castro", 1675.15, true, 'T');
		Directivo d2 = new Directivo("5698443F", "Javier Pozo", 1623.04, false, 'M');
		
		System.out.println(profe1.toString());
		System.out.println(profe2.getSalario());
		admin2.setNombreAp("Eva Porteria");
		System.out.println(admin2.toString());
		System.out.println(d1.isSalesiano());
		System.out.println(d2.toString());
		
	}

}
