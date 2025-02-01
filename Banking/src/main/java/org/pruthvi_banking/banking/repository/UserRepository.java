package org.pruthvi_banking.banking.repository;

import org.pruthvi_banking.banking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Boolean existsByEmail(String emial);
}
