package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
