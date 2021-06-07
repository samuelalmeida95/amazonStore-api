package project.ifood.ifoodclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.ifood.ifoodclone.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
