package controle;

import javafx.application.Application;
import javafx.stage.Stage;
import view.JFPrincipal;

/**
 *
 * @author Salomão Francisco da Silva - Fone: 62 99447-4551
 * @version 1.0
 */
public class Inicializar extends Application {

    @Override
    public void start(Stage primaryStage) {

        JFPrincipal janela = new JFPrincipal();
        janela.setVisible(true);

    }

    public static void main(String[] args) {
        launch(args);
    }

}
