package tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.impl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserRequest;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.DeleteUserResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.GetUserResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.GetUsersResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.UpdateUserRequest;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.UpdateUserResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.UserControllerApi;
import tw.com.firstbank.fcbcore.fir.service.mapper.CreateUserMapper;

@AllArgsConstructor
@RestController
public class UserControllerImpl implements UserControllerApi {

	private CreateUserMapper mapper;
	private CreateUserUseCaseService createUserUseCase;

	@PostMapping("")
	@Override
	public CreateUserResponse createUser(@RequestBody CreateUserRequest createUserRequest) {
		CreateUserResponse createUserResponse  = new CreateUserResponse();
		CreateUserRequestCommand createUserRequestCommand  = mapper.createUserToCommand(createUserRequest);
		CreateUserResponseCommand res = createUserUseCase.execute(createUserRequestCommand);
		return mapper.responseCommandToResponase(res);
	}

	// http://localhost:9527/Lay/v1/users/{branchCode}/{no}
	@GetMapping("/{branchCode}/{no}")
	@Override
	public GetUserResponse getUser(@PathVariable("branchCode") String branchCode,@PathVariable String no) {
		GetUserResponse getUserResponse = new GetUserResponse();
		getUserResponse.setBranchCode(branchCode);
		return  getUserResponse;
	}

	@Override
	public GetUsersResponse getUsers() {
		return null;
	}



	@Override
	public UpdateUserResponse updateUser(String no, UpdateUserRequest updateUserRequest) {
		return null;
	}

	@Override
	public DeleteUserResponse deleteUser(String no) {
		return null;
	}
}
