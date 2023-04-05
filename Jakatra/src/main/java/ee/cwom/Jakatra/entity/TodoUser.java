package ee.cwom.Jakatra.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table (name="TodoUserTable")
public class TodoUser extends AbstractEntity {
	
	
	@Column (length = 100, name ="primary_key_column")
	@NotEmpty
	@Email // set format user@email.com
	private String email;
	
	@NotNull
	@Size (min = 8, max =100)
	@Pattern(regexp = "") //must have at least one upper case, + one lower case, and must contain $ % & # !
	private String password;
	@NotEmpty
	@Size (min=2, max=100)
	private String fullName;

	//@OneToMany
	//private final Collection <Todo> todos = new ArrayList<>();

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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
	

}
