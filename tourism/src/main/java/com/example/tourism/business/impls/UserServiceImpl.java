package com.example.tourism.business.impls;

import com.example.tourism.business.services.UserService;
import com.example.tourism.data.entities.UserEntity;
import com.example.tourism.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import javax.transaction.Transactional;
import java.util.Optional;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity createUser(int user_id, String name, String surname, String email, String password, String wallet) {
        UserEntity newUser = new UserEntity(user_id, name, surname, email, password, wallet);
        return create(newUser);
    }


    @Override
    public UserEntity create(UserEntity entity) {
        UserEntity ent = userRepository.findByUserId(entity.getUserId());
        if (ent != null) {
            throw new EntityExistsException();
        }
        return userRepository.save(entity);
    }

    @Override
    public Optional<UserEntity> readById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public Page<UserEntity> readAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public void update(UserEntity newEntity) {
        userRepository.save(newEntity);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

}
