
public class Administracion extends Empleado {

	//1. ATRIBUTOS
	char sexo; // M -> mujer, H -> hombre
	int hextra;
	
	//2. MÉTODO DE CONSTRUCTOR
	public Administracion(String dni, String nombreAp, double salario, char sexo, int hextra) {
		super(dni, nombreAp, salario);
		// TODO Auto-generated constructor stub
		this.sexo = sexo;
		this.hextra = hextra;
	}
	

	//3. MÉTODO GET & SET
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getHextra() {
		return hextra;
	}

	public void setHextra(int hextra) {
		this.hextra = hextra;
	}

	
	// 4. MÉTODO TOSTRING
	@Override
	public String toString() {
		return "Administracion [dni=" + dni + ", nombreAp=" + nombreAp + ", salario=" + salario + ", sexo=" + sexo
				+ ", hextra=" + hextra + "]";
	}
	
	
	// 5. AUMENTAR SALARIO CON HORAS EXTRA: 10€ POR HORAS EXTRA
	public void aumento() {
		salario += (hextra*10);
		hextra = 0;
	}
	
	
	
}
