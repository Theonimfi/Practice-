/* Java_1 */

public class Emploee {

	private int id;
	private String name;
	private String surname;
	private Double salary;

	public Emploee(){
	}

	public Emploee(int sId, String sName, String sSurname, double sSalary) {

		id=sId;
		name=sName;
		surname=sSurname;
		salary=sSalary;

	}

	public void setId(int eId) {
		id=eId;
	}

	public int getId() {
			return id;
	}

	public void setName(String eName) {
			name=eName;
	}

	public String getName() {
		return name;
	}

	public void setSurname(String eSurname){
			surname=eSurname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSalary(double eSalary){
				salary=eSalary;
		}


        public Double getSalary() {
			return salary;
	}



	public String toString() {

		String pdata = "----------------------" + "\n"
						+ "Student Personal Data:" + "\n"
						+ "----------------------" + "\n"
						+ "id: " + id + "\n"
						+ "Name: " + name + "\n"
						+ "Surname: " + surname + "\n"
						+ "salary: " + salary + "\n";


		return pdata;
	}
}
