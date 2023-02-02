package tw.com.firstbank.fcbcore.fir.service.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "FCBUSER")
public class User implements Serializable {
	@EmbeddedId
	private UserId userId;
	private String businessCategory;
	private String verificationCode;
	private String firstName;
	private String lastName;
	private Date birthday;
	private String email;
	private String phone;
}
