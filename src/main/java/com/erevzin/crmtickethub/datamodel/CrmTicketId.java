package com.erevzin.crmtickethub.datamodel;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CrmTicketId implements Serializable {

    @Column(name = "ERROR")
    private Integer error;

    @Column(name = "PROVIDER")
    private String provider;

}