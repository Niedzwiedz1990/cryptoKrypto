package com.example.cryptokrypto.service;

import com.example.cryptokrypto.dto.WeatherDto;
import com.example.cryptokrypto.mapper.WeatherMapper;
import com.example.cryptokrypto.repository.WeatherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Slf4j
public class WeatherService {

    final private WeatherRepository weatherRepository;
   // private static final Logger logger= LoggerFactory.getLogger(WeatherService.class);
    final private WeatherMapper mapper;

    public WeatherService(final WeatherRepository weatherRepository,final WeatherMapper mapper) {
        this.weatherRepository = weatherRepository;
        this.mapper = mapper;
    }

    // CRUD

    public List<WeatherDto> getAllWeathers(){
        var objectsFromRepo  = weatherRepository.findAll();
        log.info("weathers from repo : {}", objectsFromRepo);
        return objectsFromRepo
                .stream()
                .map(weather -> mapper.fromEntityToDto(weather))
                .collect(Collectors.toList());





    }
}
