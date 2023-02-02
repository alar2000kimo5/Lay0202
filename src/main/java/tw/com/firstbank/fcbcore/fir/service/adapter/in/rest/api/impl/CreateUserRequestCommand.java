package tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.impl;

import java.util.Date;
import lombok.Data;
import tw.com.firstbank.fcbcore.fir.service.application.in.RequestCommand;

@Data
public class CreateUserRequestCommand implements RequestCommand {
	private String branchCode;
	private String businessCategory;
	private String verificationCode;
	private String firstName;
	private String lastName;
	private Date birthday;
	private String email;
	private String phone;
}
