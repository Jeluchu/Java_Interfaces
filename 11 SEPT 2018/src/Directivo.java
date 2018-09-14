
public class Directivo extends Empleado {

	//1. ATRIBUTO
	boolean salesiano;
	char turno; //M --> ma�ana, T --> tarde

	//2. M�TODO DE CONSTRUCTOR
	public Directivo(String dni, String nombreAp, double salario, boolean salesiano, char turno) {
		super(dni, nombreAp, salario);
		this.salesiano = salesiano;
		this.turno = turno;
	}
	

	// 3. M�TODO GET 6 SET
	public boolean isSalesiano() {
		return salesiano;
	}

	public void setSalesiano(boolean salesiano) {
		this.salesiano = salesiano;
	}

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

	// 4. M�TODO TOSTRING
	@Override
	public String toString() {
		return "Directivo [dni=" + dni + ", nombreAp=" + nombreAp + ", salario=" + salario + ", salesiano=" + salesiano
				+ ", turno=" + turno + "]";
	}

	
	

	
}
