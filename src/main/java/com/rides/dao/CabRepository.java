package com.rides.dao;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rides.model.CabTripData;

@RepositoryRestResource(collectionResourceRel = "rides", path = "rides")
@Cacheable("cabs")
public interface CabRepository extends JpaRepository<CabTripData, Long> {
	
	List<CabTripData> findByMedallion(@Param("medallion") String medallion);
	
	@Query("select count(*) from CabTripData where medallion = :medallion and to_date(pickup_datetime, 'yyyy-mm-dd') = :date")
	Integer findTripsByMedallion(@Param("medallion") String medallion, @Param("date") String date);

}
