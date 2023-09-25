package com.Anish.User_Management_Systems.IUserRepo;

import com.Anish.User_Management_Systems.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Long> {

}
