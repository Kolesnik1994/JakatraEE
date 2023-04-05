package ee.cwom.Jakatra.entity;

import java.time.LocalDate;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Todo extends AbstractEntity {
	
	@NotEmpty (message ="Should not be empty")
	@Size (min = 3, max=145)
	private String task;
	
	private LocalDate dateCreated;
	
	@NotNull
	@FutureOrPresent (message ="Due date must be in present or Future")
	@JsonbDateFormat (value ="yyyy-MM-dd")
	private LocalDate dueDate;
	
	private boolean completed;
	
	private boolean archived;
	
	private boolean remind;
	
	@ManyToOne
	@JoinColumn (name="TodoUser_id")
	private TodoUser todoOwner;  // many Todo's can belong to one TodoUser;

}
