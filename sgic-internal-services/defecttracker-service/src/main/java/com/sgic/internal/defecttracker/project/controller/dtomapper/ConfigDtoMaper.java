//package com.sgic.internal.defecttracker.project.controller.dtomapper;
//
//import java.util.List;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.sgic.internal.defecttracker.project.controller.converter.ConfigConverter;
//import com.sgic.internal.defecttracker.project.controller.dto.ConfigDto;
//import com.sgic.internal.defecttracker.project.entities.Config;
//import com.sgic.internal.defecttracker.project.services.ConfigServices;
//import com.sgic.internal.defecttracker.project.services.impl.ConfigServicesimpl;
//
//@Service
//public class ConfigDtoMaper {
//	
//	@Autowired 
//	ConfigServices configServices;
//	
//	@Autowired
//	private ConfigConverter configConverter;
//	
//	private static Logger logger = LogManager.getLogger(ConfigServicesimpl.class);
//	
//	// Mapper for creating Config
//	public Boolean createConfig(ConfigDto configDto) {
//		Config config = configConverter.configDtoToConfig(configDto);
//	configServices.createConfig(config);
//	return true;
//	}
//	
//	// Mapper for listing all Config
//	public List<ConfigDto> getAllConfig() {
//	List<ConfigDto> configList = configServices.findAllConfig();
//	if(configList != null) {
//		return (configConverter.configToConfigDto(configList));
//	}
//	else {
//		return null;
//	}
//	}
//	
//	public ConfigDto getConfigById(int id) {
//		Config configList = configServices.findConfigById(id);
//		if(configList != null) {
//			return configConverter.configToConfigDto(configList);
//		}
//		else {
//			return null;
//		}
//		
//	}
//	// Mapper for delete condif
//	public Boolean deleteConfig(int id) {
//		if(configServices.deleteConfigById(id)) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	// Mapper for update Config
//	public Boolean updateConfig(int id,ConfigDtoMaper configDto);public ConfigDtoMaper() {
//		Config config = configConverter.configDtoToConfig(configDto);
//		if(configList == null);
//		return false;
//	}
//	else {
//		config.setId(id);
//		configServices.createConfig(config);
//		return true;
//	}
//}
//	}
//
