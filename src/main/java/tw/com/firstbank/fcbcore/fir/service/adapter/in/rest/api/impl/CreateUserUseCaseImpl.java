package tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.impl;

import java.util.Random;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import tw.com.firstbank.fcbcore.fir.service.application.in.UseCaseApi;
import tw.com.firstbank.fcbcore.fir.service.domain.UserDto;
import tw.com.firstbank.fcbcore.fir.service.mapper.CreateUserMapper;

@AllArgsConstructor
@Component
public class CreateUserUseCaseImpl implements CreateUserUseCaseService {

	private CreateUserMapper mapper;
	private UserService userService;
	@Override
	public CreateUserResponseCommand execute(CreateUserRequestCommand requestCommand) {
		String no = getNo();
		UserDto createDto = mapper.createUserCommandToDto(no,requestCommand);
		UserDto responseDto = userService.saveUser(createDto);
		return mapper.responseDtoToResponseCommand(responseDto);
	}

	private String getNo(){
		Random r = new Random();
		int no = r.nextInt(99);
		return String.valueOf(no);
	}
}
