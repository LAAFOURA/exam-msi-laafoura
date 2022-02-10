package ma.it.exam.Services;
import ma.it.exam.Entities.user;
import ma.it.exam.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository UserRepository;

    @Override
    public Page<user> selectAll(Pageable pageable){
        return UserRepository.findAll(pageable);
    }

    @Override
    public user insert(user U){
        return UserRepository.save(U);
    }

}

