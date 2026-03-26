package com.example.SpringRestAPITest.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SpringRestAPITest.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
