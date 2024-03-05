package dio.spring.security.repository;

import dio.spring.security.model.UserAll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<UserAll, String> {
    UserDetails findByLogin(String login);
}
