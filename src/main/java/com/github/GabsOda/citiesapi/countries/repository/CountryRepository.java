package com.github.GabsOda.citiesapi.countries.repository;

import com.github.GabsOda.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
