package project.ifood.ifoodclone.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.ifood.ifoodclone.models.User;
import project.ifood.ifoodclone.repository.UserRepository;
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
        userRepository.deleteById(id);
    }

    public User update(Long id, User userUpdate) {
        User usuarioParaAtualizar = findById(id);
        return updateData(usuarioParaAtualizar, userUpdate);
    }

    private User updateData(User usuarioParaAtualizar, User novoUsuario) {
        usuarioParaAtualizar.setNome(novoUsuario.getNome());
        usuarioParaAtualizar.setEmail(novoUsuario.getEmail());
        usuarioParaAtualizar.setPassword(novoUsuario.getPassword());
        usuarioParaAtualizar.setPhone(novoUsuario.getPhone());
        return userRepository.save(usuarioParaAtualizar);
    }
}
