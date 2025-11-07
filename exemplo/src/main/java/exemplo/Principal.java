package exemplo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Principal implements CommandLineRunner {

    @Autowired
    PessoaRepository pessoaRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(Principal.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Pessoa> pessoas = pessoaRepository.findAll();

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
    }
}

	

