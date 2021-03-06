package com.wesley.bitcointracker.config;

import com.wesley.bitcointracker.service.BitcoinPriceService;
import com.wesley.bitcointracker.service.BitcoinPriceServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BitcoinPriceConfig {

    @Bean
    public BitcoinPriceService bitcoinPriceService() {
        return new BitcoinPriceServiceImpl();
    }

}