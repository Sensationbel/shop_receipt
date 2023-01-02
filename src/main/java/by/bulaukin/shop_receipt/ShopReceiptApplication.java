package by.bulaukin.shop_receipt;

import by.bulaukin.shop_receipt.pars_data.data.RequestsParsingResult;
import by.bulaukin.shop_receipt.run_app.RunningApp;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
@RequiredArgsConstructor
public class ShopReceiptApplication implements CommandLineRunner {

	private final RunningApp runningAppFromFile;
	private final RunningApp runningAppFromConsole;

	public static void main(String[] args) {
		log.info("Starting the Application");
		String[] args1 = new String[] {"11-6", "13-6", "5-1", "1-3", "20-2", "card-2569 "};
		String[] args2 = new String[] {"C:\\Users\\Sensationbel\\Desktop\\data.txt"};
			SpringApplication.run(ShopReceiptApplication.class, args1);
		log.info("Finished the Application");
	}

	@Override
	public void run(String... args) throws Exception {
		if(args.length == 0) {

		} else if(args.length > 1){
			runningAppFromConsole.run(args);
		} else runningAppFromFile.run(args);


	}
}
