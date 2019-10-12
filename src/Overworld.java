import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Overworld extends Application
{
	public static Random fate;
	public void start(Stage primaryStage) throws Exception
	{
		fate = new Random();
		Cubeworld cubeWorld = new Cubeworld();
		Image krosky = new Image("yaes.png");
		ImageView cathy = new ImageView(krosky);
		//cubeWorld.shutdown(fate.nextInt(1000000));
		Text scream = new Text("Hi");
		TextFlow ryan = new TextFlow(scream);
		ryan.setTextAlignment(TextAlignment.LEFT);
		Pane pain = new Pane(ryan);
		pain.setPrefSize(750, 500);
        pain.setStyle("-fx-background-color: #C34723");
        Pane pan = new Pane(cathy);
        pain.setStyle("-fx-background-color: #C34723");

        Scene scene = new Scene(pain, 750, 500);
        Scene scen = new Scene(pan, krosky.getWidth(), krosky.getHeight());

        Timeline time = new Timeline(new KeyFrame(Duration.millis(250), new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent arg0)
			{
				Text jesus = new Text(" " + cubeWorld.Vaporize());
				ryan.getChildren().add(jesus);
			}
		}));
        time.setCycleCount(Timeline.INDEFINITE);
        time.play();

        Stage secondaryStage = new Stage();
        secondaryStage.setTitle("Cubeworld");
        secondaryStage.setScene(scen);
        secondaryStage.show();

		primaryStage.setTitle("Cubeworld");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	public static void main(String[] args)
	{
		launch(args);
	}
}