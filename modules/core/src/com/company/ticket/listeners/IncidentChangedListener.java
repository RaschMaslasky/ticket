package com.company.ticket.listeners;

import com.company.ticket.entity.Incident;
import com.haulmont.cuba.core.TransactionalDataManager;
import com.haulmont.cuba.core.app.UniqueNumbersAPI;
import com.haulmont.cuba.core.app.events.EntityChangedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.inject.Inject;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Component("ticket_IncidentChangedListener")
public class IncidentChangedListener {

    private Calendar calendar;

    @Inject
    private UniqueNumbersAPI uniqueNumbersAPI;

    @Inject
    private TransactionalDataManager transactionalDataManager;

    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    public void beforeCommit(EntityChangedEvent<Incident, UUID> event) {
        Incident incident;
        if (event.getType() != EntityChangedEvent.Type.DELETED) {
            incident = transactionalDataManager.load(event.getEntityId())
                    .view("incident-with-activities")
                    .one();
            calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            if (incident.getIncidentId() == null) {
                incident.setIncidentId("INC-" + Integer.toString(calendar.get(Calendar.YEAR)) + "-"
                        + String.format("%05d", uniqueNumbersAPI.getNextNumber("incidentId")));
                transactionalDataManager.save(incident);
            }
        }
    }
}