package ma.it.exam.Controller;
import ma.it.exam.Entities.user;

import ma.it.exam.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/UserApp/path")

public class UserRestController {


    @Autowired
    private UserService service;

    @GetMapping("/All")
    public Page<user> getAll(Pageable pageable) {

        return service.selectAll(pageable);
    }

    @PostMapping("/AddUser")
    public user put(@RequestBody user U) {
        return service.insert(U);
    }

}

