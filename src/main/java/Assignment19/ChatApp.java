package Assignment19;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChatApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/view.fxml"));
        UserController controller1 = new UserController(user1);
        user1.setController(controller1);
        loader1.setController(controller1);
        Parent root1 = loader1.load();

        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/view.fxml"));
        UserController controller2 = new UserController(user2);
        user2.setController(controller2);
        loader2.setController(controller2);
        Parent root2 = loader2.load();

        FXMLLoader loader3 = new FXMLLoader(getClass().getResource("/view.fxml"));
        UserController controller3 = new UserController(user3);
        user3.setController(controller3);
        loader3.setController(controller3);
        Parent root3 = loader3.load();

        Stage stage1 = new Stage();
        stage1.setTitle("Chat - " + user1.getName());
        stage1.setScene(new Scene(root1));
        stage1.show();

        Stage stage2 = new Stage();
        stage2.setTitle("Chat - " + user2.getName());
        stage2.setScene(new Scene(root2));
        stage2.show();

        Stage stage3 = new Stage();
        stage3.setTitle("Chat - " + user3.getName());
        stage3.setScene(new Scene(root3));
        stage3.show();
    }
}