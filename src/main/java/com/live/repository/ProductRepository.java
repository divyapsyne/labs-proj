package com.live.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.live.entity.UserProfile;

@Repository
public interface ProductRepository extends JpaRepository<UserProfile,Long>{

}
