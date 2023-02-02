package tw.com.firstbank.fcbcore.fir.service.adapter.out.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tw.com.firstbank.fcbcore.fir.service.domain.User;
import tw.com.firstbank.fcbcore.fir.service.domain.UserId;


@Repository
public interface UserRepostory extends JpaRepository<User, UserId> {

}
