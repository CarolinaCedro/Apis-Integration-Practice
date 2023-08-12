package io.github.com.priceexchangesystem.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}


//Resumindo sobre o RestTemplate para que eu possa consultar em um futuro
/*
RestTemplate é uma classe fornecida pelo Spring Framework que simplifica a comunicação entre aplicativos que fazem chamadas HTTP.
Ela permite que você realize solicitações HTTP para outros serviços ou APIs, obtenha as respostas e lide com os dados resultantes.

Resumidamente, o RestTemplate:

Realiza Requisições HTTP: Permite que você faça solicitações HTTP GET, POST, PUT, DELETE e outras para servidores remotos.
Consome Recursos Web: Você pode usá-lo para consumir APIs RESTful, receber dados JSON, XML ou outros formatos de resposta.
Lida com Conversão de Dados: Automaticamente converte as respostas do formato bruto (como JSON) para objetos Java que você pode usar no seu código.
Lida com Cabeçalhos e Parâmetros: Permite definir cabeçalhos HTTP, parâmetros de consulta e corpo da solicitação.
Lida com Erros e Respostas: Pode lançar exceções específicas para diferentes status HTTP, o que ajuda a lidar com erros de forma eficaz.
Facilita a Integração: Ajuda na integração entre diferentes partes de um aplicativo ou entre aplicativos separados.

* */
