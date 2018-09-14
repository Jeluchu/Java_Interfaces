
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado emp1 = new Profesor("5695872J", "Txemagon", 755.39, 8, true);
		Profesor pro1 = new Profesor("5687452L", "JoseLuis", 834.91, 7, false);
		
		Empleado dir1 = new Directivo("5720064H", "Manuel", 1030.50, true, 'T');
		Directivo dir2 = new Directivo("5822023P", "Javier", 984.32, false, 'M');
		
		Empleado admin1 = new Administracion("02985523K", "Eva", 687.21, 'M', 4);
		Administracion admin2 = new Administracion("1234567Y", "Enrique", 841.69, 'H', 2);
		
		System.out.println(emp1.toString());
		System.out.println(dir2.getSalario());
		admin1.setSalario(500);
		System.out.println(admin1.getSalario());
		
	}

	
}
