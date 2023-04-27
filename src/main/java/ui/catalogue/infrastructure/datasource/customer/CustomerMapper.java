package ui.catalogue.infrastructure.datasource.customer;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ui.catalogue.domain.model.customer.Customer;
import ui.catalogue.domain.model.customer.contact.Contact;
import ui.catalogue.domain.model.customer.identifier.CustomerId;
import ui.catalogue.domain.model.customer.identifier.CustomerName;
import ui.catalogue.domain.model.customer.identifier.CustomerNumber;
import ui.catalogue.domain.model.customer.summary.CustomerSummary;

import java.util.List;
import java.util.UUID;

@Mapper
public interface CustomerMapper {

    Customer customerOf(@Param("customerId") CustomerId customerId);

    List<CustomerSummary> customerSummaries();

    long newCustomerNumber();

    void register(
            @Param("customerId") CustomerId customerId,
            @Param("customerNumber") CustomerNumber customerNumber);

    void registerRevision(
            @Param("customerId") CustomerId customerId,
            @Param("revision") UUID revision);

    void registerCustomerName(
            @Param("customerId") CustomerId customerId,
            @Param("revision") UUID revision,
            @Param("customerName") CustomerName customerName);

    void registerContact(
            @Param("customerId") CustomerId customerId,
            @Param("revision") UUID revision,
            @Param("contact") Contact contact);

    void registerActive(
            @Param("customerId") CustomerId customerId,
            @Param("revision") UUID revision);

    void deleteActive(@Param("customerId") CustomerId customerId);
}
