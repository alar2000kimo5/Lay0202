package tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import tw.com.firstbank.fcbcore.fir.service.adapter.out.repository.UserRepostory;
import tw.com.firstbank.fcbcore.fir.service.domain.User;
import tw.com.firstbank.fcbcore.fir.service.domain.UserDto;
import tw.com.firstbank.fcbcore.fir.service.mapper.CreateUserMapper;

@AllArgsConstructor
@Component
public class UserService {

	private CreateUserMapper mapper;
	private UserRepostory userRepostory;
	public UserDto saveUser(UserDto createDto) {
		User user = mapper.userDtoToEntity(createDto);
		User resUser = userRepostory.save(user);
		return mapper.userEntityToDto(resUser);

	}
}
