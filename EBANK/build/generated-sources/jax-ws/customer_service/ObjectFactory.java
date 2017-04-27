
package customer_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the customer_service package. 
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

    private final static QName _ViewCustomerResponse_QNAME = new QName("http://customer_service/", "viewCustomerResponse");
    private final static QName _DeleteCustomer_QNAME = new QName("http://customer_service/", "deleteCustomer");
    private final static QName _EditCustomerResponse_QNAME = new QName("http://customer_service/", "editCustomerResponse");
    private final static QName _DeleteCustomerResponse_QNAME = new QName("http://customer_service/", "deleteCustomerResponse");
    private final static QName _CustomersList_QNAME = new QName("http://customer_service/", "customersList");
    private final static QName _EditCustomer_QNAME = new QName("http://customer_service/", "editCustomer");
    private final static QName _AddCustomer_QNAME = new QName("http://customer_service/", "addCustomer");
    private final static QName _ViewCustomer_QNAME = new QName("http://customer_service/", "viewCustomer");
    private final static QName _AddCustomerResponse_QNAME = new QName("http://customer_service/", "addCustomerResponse");
    private final static QName _CustomersListResponse_QNAME = new QName("http://customer_service/", "customersListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: customer_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCustomer }
     * 
     */
    public AddCustomer createAddCustomer() {
        return new AddCustomer();
    }

    /**
     * Create an instance of {@link CustomersList }
     * 
     */
    public CustomersList createCustomersList() {
        return new CustomersList();
    }

    /**
     * Create an instance of {@link EditCustomer }
     * 
     */
    public EditCustomer createEditCustomer() {
        return new EditCustomer();
    }

    /**
     * Create an instance of {@link CustomersListResponse }
     * 
     */
    public CustomersListResponse createCustomersListResponse() {
        return new CustomersListResponse();
    }

    /**
     * Create an instance of {@link AddCustomerResponse }
     * 
     */
    public AddCustomerResponse createAddCustomerResponse() {
        return new AddCustomerResponse();
    }

    /**
     * Create an instance of {@link ViewCustomer }
     * 
     */
    public ViewCustomer createViewCustomer() {
        return new ViewCustomer();
    }

    /**
     * Create an instance of {@link DeleteCustomer }
     * 
     */
    public DeleteCustomer createDeleteCustomer() {
        return new DeleteCustomer();
    }

    /**
     * Create an instance of {@link ViewCustomerResponse }
     * 
     */
    public ViewCustomerResponse createViewCustomerResponse() {
        return new ViewCustomerResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link EditCustomerResponse }
     * 
     */
    public EditCustomerResponse createEditCustomerResponse() {
        return new EditCustomerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_service/", name = "viewCustomerResponse")
    public JAXBElement<ViewCustomerResponse> createViewCustomerResponse(ViewCustomerResponse value) {
        return new JAXBElement<ViewCustomerResponse>(_ViewCustomerResponse_QNAME, ViewCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_service/", name = "deleteCustomer")
    public JAXBElement<DeleteCustomer> createDeleteCustomer(DeleteCustomer value) {
        return new JAXBElement<DeleteCustomer>(_DeleteCustomer_QNAME, DeleteCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_service/", name = "editCustomerResponse")
    public JAXBElement<EditCustomerResponse> createEditCustomerResponse(EditCustomerResponse value) {
        return new JAXBElement<EditCustomerResponse>(_EditCustomerResponse_QNAME, EditCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_service/", name = "deleteCustomerResponse")
    public JAXBElement<DeleteCustomerResponse> createDeleteCustomerResponse(DeleteCustomerResponse value) {
        return new JAXBElement<DeleteCustomerResponse>(_DeleteCustomerResponse_QNAME, DeleteCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomersList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_service/", name = "customersList")
    public JAXBElement<CustomersList> createCustomersList(CustomersList value) {
        return new JAXBElement<CustomersList>(_CustomersList_QNAME, CustomersList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_service/", name = "editCustomer")
    public JAXBElement<EditCustomer> createEditCustomer(EditCustomer value) {
        return new JAXBElement<EditCustomer>(_EditCustomer_QNAME, EditCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_service/", name = "addCustomer")
    public JAXBElement<AddCustomer> createAddCustomer(AddCustomer value) {
        return new JAXBElement<AddCustomer>(_AddCustomer_QNAME, AddCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_service/", name = "viewCustomer")
    public JAXBElement<ViewCustomer> createViewCustomer(ViewCustomer value) {
        return new JAXBElement<ViewCustomer>(_ViewCustomer_QNAME, ViewCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_service/", name = "addCustomerResponse")
    public JAXBElement<AddCustomerResponse> createAddCustomerResponse(AddCustomerResponse value) {
        return new JAXBElement<AddCustomerResponse>(_AddCustomerResponse_QNAME, AddCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomersListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customer_service/", name = "customersListResponse")
    public JAXBElement<CustomersListResponse> createCustomersListResponse(CustomersListResponse value) {
        return new JAXBElement<CustomersListResponse>(_CustomersListResponse_QNAME, CustomersListResponse.class, null, value);
    }

}
