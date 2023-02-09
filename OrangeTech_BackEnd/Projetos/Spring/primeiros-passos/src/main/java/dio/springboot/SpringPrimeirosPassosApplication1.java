//package dio.springboot;
//
//import dio.springboot.app.ConversorJson;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//@SpringBootApplication
//public class PrimeirosPassosApplication {
//
//	public static void main(String[] args) {SpringApplication.run(PrimeirosPassosApplication.class, args);}
//	@Bean
//	public CommandLineRunner run(ConversorJson conversor) throws Exception {
//		return args -> {
//			String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praca da Se\",\"localidade\": \"Sao Paulo\"}";
//			ViaCepResponse response = conversor.converter(json);
//			System.out.println("Dados do CEP: " + response);
//		};
//	}
//}
