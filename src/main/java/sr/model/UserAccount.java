package sr.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "tb_useraccount")
public class UserAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String password;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "staff_id")
	private Staff staff;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "role_id")
	private Role role;
	
	public UserAccount() {
		super();
	}

	public UserAccount(int id, String email, String password, Staff staff, Role role) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.staff = staff;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
	
}
