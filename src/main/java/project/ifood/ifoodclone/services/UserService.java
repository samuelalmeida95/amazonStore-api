package project.ifood.ifoodclone.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import project.ifood.ifoodclone.models.User;
import project.ifood.ifoodclone.repository.UserRepository;
import project.ifood.ifoodclone.services.exceptions.DatabaseException;
import project.ifood.ifoodclone.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> usuarioBuscado = userRepository.findById(id);
        return usuarioBuscado.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User create(User user){
        return userRepository.save(user);
    }

    public void delete(Long id) {
        try{
            userRepository.deleteById(id);
        }catch( EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }catch(DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User userUpdate) {
        try{
            User usuarioParaAtualizar = findById(id);
            return updateData(usuarioParaAtualizar, userUpdate);
        }catch(EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }       
    }

    private User updateData(User usuarioParaAtualizar, User novoUsuario) {
        usuarioParaAtualizar.setNome(novoUsuario.getNome());
        usuarioParaAtualizar.setEmail(novoUsuario.getEmail());
        usuarioParaAtualizar.setPassword(novoUsuario.getPassword());
        usuarioParaAtualizar.setPhone(novoUsuario.getPhone());
        return userRepository.save(usuarioParaAtualizar);
    }
}
