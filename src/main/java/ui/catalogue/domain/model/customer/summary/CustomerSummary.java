package ui.catalogue.domain.model.customer.summary;

import ui.catalogue.domain.model.customer.identifier.CustomerId;
import ui.catalogue.domain.model.customer.identifier.CustomerName;
import ui.catalogue.domain.model.customer.identifier.CustomerNumber;
import ui.catalogue.domain.primitive.contact.phone.PhoneNumber;

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
