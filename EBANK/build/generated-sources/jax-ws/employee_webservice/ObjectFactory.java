
package employee_webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the employee_webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginResponse_QNAME = new QName("http://employee_webservice/", "LoginResponse");
    private final static QName _EditEmployee_QNAME = new QName("http://employee_webservice/", "editEmployee");
    private final static QName _DeleteOperation_QNAME = new QName("http://employee_webservice/", "deleteOperation");
    private final static QName _DeleteOperationResponse_QNAME = new QName("http://employee_webservice/", "deleteOperationResponse");
    private final static QName _EmployeeList_QNAME = new QName("http://employee_webservice/", "employeeList");
    private final static QName _EditEmployeeResponse_QNAME = new QName("http://employee_webservice/", "editEmployeeResponse");
    private final static QName _Login_QNAME = new QName("http://employee_webservice/", "Login");
    private final static QName _EmployeeListResponse_QNAME = new QName("http://employee_webservice/", "employeeListResponse");
    private final static QName _AddEmployee_QNAME = new QName("http://employee_webservice/", "addEmployee");
    private final static QName _AddEmployeeResponse_QNAME = new QName("http://employee_webservice/", "addEmployeeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: employee_webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link EditEmployee }
     * 
     */
    public EditEmployee createEditEmployee() {
        return new EditEmployee();
    }

    /**
     * Create an instance of {@link EmployeeList }
     * 
     */
    public EmployeeList createEmployeeList() {
        return new EmployeeList();
    }

    /**
     * Create an instance of {@link EditEmployeeResponse }
     * 
     */
    public EditEmployeeResponse createEditEmployeeResponse() {
        return new EditEmployeeResponse();
    }

    /**
     * Create an instance of {@link DeleteOperation }
     * 
     */
    public DeleteOperation createDeleteOperation() {
        return new DeleteOperation();
    }

    /**
     * Create an instance of {@link DeleteOperationResponse }
     * 
     */
    public DeleteOperationResponse createDeleteOperationResponse() {
        return new DeleteOperationResponse();
    }

    /**
     * Create an instance of {@link EmployeeListResponse }
     * 
     */
    public EmployeeListResponse createEmployeeListResponse() {
        return new EmployeeListResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link AddEmployeeResponse }
     * 
     */
    public AddEmployeeResponse createAddEmployeeResponse() {
        return new AddEmployeeResponse();
    }

    /**
     * Create an instance of {@link AddEmployee }
     * 
     */
    public AddEmployee createAddEmployee() {
        return new AddEmployee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_webservice/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_webservice/", name = "editEmployee")
    public JAXBElement<EditEmployee> createEditEmployee(EditEmployee value) {
        return new JAXBElement<EditEmployee>(_EditEmployee_QNAME, EditEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_webservice/", name = "deleteOperation")
    public JAXBElement<DeleteOperation> createDeleteOperation(DeleteOperation value) {
        return new JAXBElement<DeleteOperation>(_DeleteOperation_QNAME, DeleteOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_webservice/", name = "deleteOperationResponse")
    public JAXBElement<DeleteOperationResponse> createDeleteOperationResponse(DeleteOperationResponse value) {
        return new JAXBElement<DeleteOperationResponse>(_DeleteOperationResponse_QNAME, DeleteOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_webservice/", name = "employeeList")
    public JAXBElement<EmployeeList> createEmployeeList(EmployeeList value) {
        return new JAXBElement<EmployeeList>(_EmployeeList_QNAME, EmployeeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_webservice/", name = "editEmployeeResponse")
    public JAXBElement<EditEmployeeResponse> createEditEmployeeResponse(EditEmployeeResponse value) {
        return new JAXBElement<EditEmployeeResponse>(_EditEmployeeResponse_QNAME, EditEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_webservice/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_webservice/", name = "employeeListResponse")
    public JAXBElement<EmployeeListResponse> createEmployeeListResponse(EmployeeListResponse value) {
        return new JAXBElement<EmployeeListResponse>(_EmployeeListResponse_QNAME, EmployeeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_webservice/", name = "addEmployee")
    public JAXBElement<AddEmployee> createAddEmployee(AddEmployee value) {
        return new JAXBElement<AddEmployee>(_AddEmployee_QNAME, AddEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee_webservice/", name = "addEmployeeResponse")
    public JAXBElement<AddEmployeeResponse> createAddEmployeeResponse(AddEmployeeResponse value) {
        return new JAXBElement<AddEmployeeResponse>(_AddEmployeeResponse_QNAME, AddEmployeeResponse.class, null, value);
    }

}
