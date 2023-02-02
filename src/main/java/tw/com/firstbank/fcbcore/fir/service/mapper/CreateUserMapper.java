package tw.com.firstbank.fcbcore.fir.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserRequest;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.CreateUserResponse;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.impl.CreateUserRequestCommand;
import tw.com.firstbank.fcbcore.fir.service.adapter.in.rest.api.impl.CreateUserResponseCommand;
import tw.com.firstbank.fcbcore.fir.service.domain.User;
import tw.com.firstbank.fcbcore.fir.service.domain.UserDto;

@Mapper(componentModel = "spring")
public interface CreateUserMapper {

	public CreateUserRequestCommand createUserToCommand(CreateUserRequest createUserRequest);

	@Mappings({
		@Mapping(source = "no",target = "no")
	})
	UserDto createUserCommandToDto(String no, CreateUserRequestCommand requestCommand);

	@Mappings({
		@Mapping(source = "no",target = "userId.no"),
		@Mapping(source = "branchCode",target = "userId.branchCode")
	})
	User userDtoToEntity(UserDto createDto);

	@Mappings({
		@Mapping(source = "userId.no",target = "no"),
		@Mapping(source = "userId.branchCode",target = "branchCode")
	})
	UserDto userEntityToDto(User resUser);

	CreateUserResponseCommand responseDtoToResponseCommand(UserDto responseDto);

	CreateUserResponse responseCommandToResponase(CreateUserResponseCommand res);
}
