/* for exercise java_1 */

public class User {

	private String username;
	private String password;
	private String fullname;

	public User(String uname, String passwd, String fname) {
	  username = uname;
	  password = passwd;
	  fullname = fname;
	}

	public void setUsername(String uname) {
		username = uname;
	}

	public void setPassword(String passwd) {
		 password = passwd;
	}

	public void setFull(String fname) {
		fullname = fname;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getFullname() {
		return fullname;
	}

	public String toString() {
	  return "<" + username + ", " + password + ", " + fullname + ">";
	}
}