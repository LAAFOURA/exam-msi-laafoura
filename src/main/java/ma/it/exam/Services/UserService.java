package ma.it.exam.Services;

import ma.it.exam.Entities.user;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface UserService {
    Page<user> selectAll(Pageable pageable);

    user insert(user U);
}
