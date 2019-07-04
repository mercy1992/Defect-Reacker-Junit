package com.sgic.internal.defecttracker.project.controller.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sgic.internal.defecttracker.project.controller.dto.ConfigDto;
import com.sgic.internal.defecttracker.project.entities.Config;


@Service
public class ConfigConverter {

	private ConfigConverter() {
		
	}

	// Convert entity to dto
	public ConfigDto configToConfigDto(Config config) {
		ConfigDto configDto = new ConfigDto();
		
	if(config != null) {
		configDto.setId(config.getId());
		configDto.setName(config.getName());
		configDto.setValue(config.getValue());
		
		return configDto;
	}
		return null;
		
	}
	
	// Convert dto to entity
public Config configDtoToConfig(ConfigDto configDto) {
	Config config = new Config();
		
		config.setId(configDto.getId());
		config.setName(configDto.getName());
		config.setValue(configDto.getValue());
		return config;
		
		}

//Convert entity to dto list
public List<ConfigDto> configToConfigDto(List<Config> configList) {
	if(configList != null) {
		List<ConfigDto> listConfigDto = new ArrayList<>();
		for (Config config: configList) {
			ConfigDto configDto = new ConfigDto();
			
			configDto.setId(config.getId());
			configDto.setName(config.getName());
			configDto.setValue(config.getValue());
			listConfigDto.add(configDto);
		}
		return listConfigDto;
	}
	return null;
	
}
}
