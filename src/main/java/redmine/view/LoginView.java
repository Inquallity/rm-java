package redmine.view;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Maksim Radko
 *         on 23 September 2016.
 */
public class LoginView {

    public LoginView(@NotNull Stage stage) {
        final Parent login = loadParent();
        if (login == null) {
            throw new IllegalStateException("Can't init view");
        }
        final Scene loginScene = new Scene(login);
        stage.setTitle("Redmine app");
        stage.setScene(loginScene);
        stage.show();
    }

    @Nullable
    private Parent loadParent() {
        try {
            final ClassLoader cl = getClass().getClassLoader();
            final URL resource = cl.getResource("sample.fxml");
            if (resource != null) {
                return FXMLLoader.load(resource);
            }
        } catch (IOException e) {
            System.out.printf("%s: %s", e, e.getMessage());
        }
        return null;
    }
}
