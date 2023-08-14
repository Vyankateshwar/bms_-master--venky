package com.example.Book_my_Show_Application_February.Services;


import com.example.Book_my_Show_Application_February.Entities.UserEntity;
import com.example.Book_my_Show_Application_February.EntryDtos.UserEntryDto;
import com.example.Book_my_Show_Application_February.Repository.UserRepository;
import com.example.Book_my_Show_Application_February.ResponseDto.UserDto;
import com.example.Book_my_Show_Application_February.convertors.UserConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto)throws Exception,NullPointerException{

        UserEntity userEntity = UserConvertor.convertDtoToEntity(userEntryDto);

        userRepository.save(userEntity);

        return "User Added successfully";

    }
    public UserDto getUser(int userId) {
        // Retrieve the user from the database using the userId
        UserEntity userEntity = userRepository.findById(userId).orElse(null);

        if (userEntity != null) {
            UserDto userDto = new UserDto();
            userDto.setId(userEntity.getId());
            userDto.setName(userEntity.getName());
            userDto.setEmail(userEntity.getEmail());
            userDto.setAge(userEntity.getAge());
            userDto.setMobNo(userEntity.getMobNo());
            userDto.setAddress(userEntity.getAddress());

            return userDto;
        }

        return null;
    }



}
