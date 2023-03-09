package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import seedu.address.model.person.Person;

import java.util.*;

public class PersonalPane extends UiPart<Region> {

    private static final String FXML = "PersonalPane.fxml";
    public final Person person;
    private boolean status;

    @FXML
    private HBox personalPane;

    @FXML
    private Label name;
    @FXML
    private Label id;
    @FXML
    private Label phone;
    @FXML
    private Label address;
    @FXML
    private Label email;
    @FXML
    private FlowPane tags;

    public PersonalPane(Person person) {
        super(FXML);
        this.person = person;
        name.setText(person.getName().fullName);
        phone.setText(person.getPhone().value);
        address.setText(person.getAddress().value);
        email.setText(person.getEmail().value);
        person.getTags().stream()
                .sorted(Comparator.comparing(tag -> tag.tagName))
                .forEach(tag -> tags.getChildren().add(new Label(tag.tagName)));
    }

    public void setDisplayStatus() {
        if (this.person == null) {
            this.status = false;
        } else {
            this.status = true;
        }
    }

    public boolean getStatus() {
        return this.status;
    }

}