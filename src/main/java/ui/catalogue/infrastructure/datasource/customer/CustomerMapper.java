package ui.catalogue.infrastructure.datasource.customer;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ui.catalogue.domain.model.customer.Customer;
import ui.catalogue.domain.model.customer.identifier.CustomerId;
import ui.catalogue.domain.model.customer.summary.CustomerSummary;

import java.util.List;

@Mapper
public interface CustomerMapper {

    Customer customerOf(@Param("customerId") CustomerId customerId);

    List<CustomerSummary> customerSummaries();
}
