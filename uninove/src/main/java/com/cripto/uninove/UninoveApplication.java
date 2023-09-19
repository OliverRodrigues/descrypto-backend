package com.cripto.uninove;

import com.cripto.uninove.model.CoinModel;
import com.cripto.uninove.service.ConvertDataService;
import com.cripto.uninove.service.GetDataService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class UninoveApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UninoveApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		GetDataService getDataService = new GetDataService();
		String json = getDataService.getData("https://api.coingecko.com/api/v3/coins/list?include_platform=false");

		ConvertDataService convertDataService = new ConvertDataService();
		List<CoinModel> coinsList = convertDataService.convertDataToList(json, CoinModel.class);

		System.out.println(coinsList.toString());
	}
}
