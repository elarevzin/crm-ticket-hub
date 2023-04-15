package com.erevzin.crmtickethub.logic.externalfetch;

import com.erevzin.crmtickethub.datamodel.CrmSystemName;
import com.erevzin.crmtickethub.datamodel.ExternalCrmTicket;
import com.erevzin.crmtickethub.datamodel.ExternalCrmTicketsData;
import com.erevzin.crmtickethub.logic.utils.ExternalDataReader;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public interface CrmExternalTicketFetcher {

    String filePath = "";
    CrmSystemName externalSystemName = CrmSystemName.UNKNOWN;

    ExternalDataReader externalDataReader = null;

    default ExternalDataReader getExternalDataReader() {
        return externalDataReader;
    }

    default String getFilePath() {
        return filePath;
    }

    default CrmSystemName getExternalSystemName() {
        return externalSystemName;
    }


    default List<ExternalCrmTicket> fetchCrmTickets() {
        List<ExternalCrmTicket> externalCrmTicketList = getExternalDataReader().getExternalCrmTicketList(getFilePath());
        externalCrmTicketList.forEach(ticket -> ticket.setOriginalSystemName(getExternalSystemName()));
        return externalCrmTicketList;
    }

}
