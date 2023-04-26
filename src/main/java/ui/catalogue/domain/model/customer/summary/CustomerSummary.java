package ui.catalogue.domain.model.customer.summary;

import ui.catalogue.domain.model.customer.contact.phone.PhoneNumber;
import ui.catalogue.domain.model.customer.identifier.CustomerId;
import ui.catalogue.domain.model.customer.identifier.CustomerName;
import ui.catalogue.domain.model.customer.identifier.CustomerNumber;

/**
 * 顧客サマリー
 */
public record CustomerSummary(
        CustomerId customerId,
        CustomerNumber customerNumber,
        CustomerName customerName,
        PhoneNumber phoneNumber
){
}
