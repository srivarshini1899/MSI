package com.bank.group7.composite.service.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.group7.composite.service.model.Composite;

@Repository
public interface CompositeRepo extends JpaRepository<Composite, Integer>{

	@Transactional
	@Modifying
	@Query("UPDATE Composite c SET c.prodId= :prodId WHERE c.custId= :custId")
	 int updateProdIdForCustomerId(@Param("custId") int custId, @Param("prodId") String prodId);
}
