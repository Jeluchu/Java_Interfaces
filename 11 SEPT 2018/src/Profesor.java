
public class Profesor extends Empleado {

	//1. atributos
	int asignaturas;
	boolean tutor;
	
	// 2. MÉTODO CONSTRUCTOR
	public Profesor(String dni, String nombreAp, double salario, int asignaturas, boolean tutor) {
		super(dni, nombreAp, salario);
		// TODO Auto-generated constructor stub
		this.asignaturas = asignaturas;
		this.tutor = tutor;
	}

	//3. MÉTODO GET & SET
	public int getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(int asignaturas) {
		this.asignaturas = asignaturas;
	}

	public boolean isTutor() {
		return tutor;
	}

	public void setTutor(boolean tutor) {
		this.tutor = tutor;
	}

	// 4. MÉTODO TOSTRING
	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", nombreAp=" + nombreAp + ", salario=" + salario + ", asignaturas="
				+ asignaturas + ", tutor=" + tutor + "]";
	}

	public void tutorizar() {
		if (asignaturas > 5) tutor = true;
		else tutor = false;
	}
	
}
