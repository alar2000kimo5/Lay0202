package tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api;

import javax.validation.Valid;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
// http://localhost:8080/Lay
@RequestMapping("/v1/users")
@Validated
@Component
public interface UserControllerApi {

	public GetUserResponse getUser(String branchCode,String no);

	public GetUsersResponse getUsers();

	public CreateUserResponse createUser(CreateUserRequest createUserRequest);

	public UpdateUserResponse updateUser(String no , UpdateUserRequest updateUserRequest);

	public DeleteUserResponse deleteUser(String no);

}
