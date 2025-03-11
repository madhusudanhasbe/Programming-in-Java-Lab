package Assignment8and10;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class EmployeeController {
    @FXML
    private TextField employeeIdField, nameField, ageField, emailField, departmentField;
    @FXML
    private Button createTableButton, registerButton, viewButton, updateButton;
    @FXML
    private Label statusLabel;

    private DatabaseHandler dbHandler = new DatabaseHandler();

    @FXML
    protected void onCreateTableButtonClick() {
        dbHandler.createTable();
        statusLabel.setText("Employee table created!");
    }

    @FXML
    protected void onRegisterButtonClick() {
        Employee employee = new Employee();
        employee.setId(employeeIdField.getText());
        employee.setName(nameField.getText());
        employee.setAge(Integer.parseInt(ageField.getText()));
        employee.setEmail(emailField.getText());
        employee.setDepartment(departmentField.getText());
        dbHandler.registerEmployee(employee);
        statusLabel.setText("Employee registered!");
    }


    @FXML
    protected void onViewButtonClick() {
        dbHandler.viewEmployees();
        statusLabel.setText("Viewing employees!");
    }

    @FXML
    protected void onUpdateButtonClick() {
        Employee employee = new Employee();
        employee.setId(employeeIdField.getText());
        employee.setName(nameField.getText());
        employee.setAge(Integer.parseInt(ageField.getText()));
        employee.setEmail(emailField.getText());
        employee.setDepartment(departmentField.getText());
        dbHandler.updateEmployee(employee);
        statusLabel.setText("Employee updated!");
    }
}
