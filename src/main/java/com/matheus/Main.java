// Importação de Pacotes
package com.matheus;

// Importação de Classes
import com.matheus.ui.UIConfigUser;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main extends Application {

    private static ConfigurableApplicationContext springContext;

    public static void main(String[] args) {
        // Inicia o JavaFX Application
        Application.launch(Main.class, args);
    }

    @Override
    public void init() {
        // Inicializa o Spring Boot
        springContext = SpringApplication.run(Main.class);
    }

    @Override
    public void start(Stage stage) {
        // Obtém o bean do Spring
        UIConfigUser uiConfigUser = springContext.getBean(UIConfigUser.class); 

        // Inicia a UI
        uiConfigUser.start(stage);
    }

    @Override
    public void stop() {
        // Fecha o contexto Spring ao encerrar o JavaFX
        springContext.close();
    }
}
