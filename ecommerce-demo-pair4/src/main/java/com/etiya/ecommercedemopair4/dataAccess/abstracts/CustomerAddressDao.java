package com.etiya.ecommercedemopair4.dataAccess.abstracts;

import com.etiya.ecommercedemopair4.entities.concrete.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerAddressDao extends JpaRepository<CustomerAddress, Integer> {
}
