package com.absolutehh.app.data.service;

import com.absolutehh.app.data.entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}