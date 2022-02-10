package ma.it.exam.Services;

import ma.it.exam.Entities.user;
import ma.it.exam.Controller.UserRestController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

public class UserRestControllerTest<when> {


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static when;

    @RunWith(SpringRunner.class)
    public class UserRestControllerTest {


        private UserRestController controller;

        private UserService service;


        @Test
        public void getListUserTest() throws Exception{
            Page<user> pro= Mockito.mock(Page.class);
            when(service.selectAll((java.awt.print.Pageable) Pageable.ofSize(1))).thenReturn(pro);
            Page<user> UerFromService = service.selectAll((java.awt.print.Pageable) Pageable.ofSize(1));
            when(service.selectAll((java.awt.print.Pageable) Pageable.ofSize(1))).thenReturn(UerFromService);

        }
        @Test
        public void createNewUserTest() {


            user oussama = new user();
            oussama.setEmail("oussama.laafoura@mail.com");
            oussama.setFullName("Oussama LAAFOURA");
            BDDMockito.given(service.insert(oussama)).willReturn(oussama);
            user createdUser = service.insert(oussama);
        }

}
