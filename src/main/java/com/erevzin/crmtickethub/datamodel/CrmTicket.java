package com.erevzin.crmtickethub.datamodel;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

//@Entity
//@Table(name = "CRM_TICKET")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CrmTicket {

    private Long id;

    private Integer originalCaseId;
    private CrmSystemName originalSystemName;
    private Integer customerId;
    private String providerName;
    private Integer errorCode;
    private Date creationDate;
    private Date lastModifiedDate;
    private CrmTicketStatus status;
    private String productName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrmTicket that = (CrmTicket) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(originalCaseId, that.originalCaseId) &&
                Objects.equals(originalSystemName, that.originalSystemName) &&
                Objects.equals(errorCode, that.errorCode) &&
                Objects.equals(providerName, that.providerName) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(customerId, that.customerId) &&
                status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, originalCaseId, originalSystemName, customerId, providerName, errorCode, status, productName );
    }


}
