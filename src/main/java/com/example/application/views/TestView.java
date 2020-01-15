package com.example.application.views;

import com.example.application.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

import static com.vaadin.flow.component.notification.Notification.Position.BOTTOM_CENTER;

/**
 * A Designer generated component for the test-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
//@Route(value = "test", layout = MainView.class)
//@RouteAlias(value = "", layout = MainView.class)
@PageTitle("Test View")
@Tag("test-view")
@JsModule("./src/test-view.js")
public class TestView extends PolymerTemplate<TestView.TestViewModel> {

    @Id("vaadinButton")
    private Button vaadinButton;
    @Id("vaadinTextField")
    private TextField vaadinTextField;

    /**
     * Creates a new TestView.
     */
    public TestView() {
        // You can initialise any data required for the connected UI components here.
        vaadinButton.addClickListener(buttonClickEvent -> {
            if (!vaadinTextField.getValue().isEmpty()) {
                Notification.show("Привет, " + vaadinTextField.getValue(), 5000, BOTTOM_CENTER);
            } else {
                Notification
                        .show("Нужно имя!", 5000, BOTTOM_CENTER)
                        .addThemeVariants(NotificationVariant.LUMO_ERROR);
            }
        });
    }

    /**
     * This model binds properties between TestView and test-view
     */
    public interface TestViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
