package com.codeclan.filemanager.filemanager.repositories;

import com.codeclan.filemanager.filemanager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
