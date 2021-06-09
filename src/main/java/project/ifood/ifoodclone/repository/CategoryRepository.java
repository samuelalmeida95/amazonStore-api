package project.ifood.ifoodclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.ifood.ifoodclone.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
