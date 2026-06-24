package com.def.example.HospitalApp.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.def.example.HospitalApp.ENTITY.HospitalEntity;

@Repository
public interface HospitalRepository extends JpaRepository<HospitalEntity, Integer> {

}