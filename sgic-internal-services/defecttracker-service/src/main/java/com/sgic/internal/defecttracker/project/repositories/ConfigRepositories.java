package com.sgic.internal.defecttracker.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.internal.defecttracker.project.entities.Config;

public interface ConfigRepositories extends JpaRepository<Config, Integer>{

}
