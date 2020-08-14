package com.company.ticket.listeners;

import com.company.ticket.entity.Issue;
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

@Component("ticket_IssueChangedListener")
public class IssueChangedListener {

    private Calendar calendar;

    @Inject
    private UniqueNumbersAPI uniqueNumbersAPI;

    @Inject
    private TransactionalDataManager transactionalDataManager;

    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    public void beforeCommit(EntityChangedEvent<Issue, UUID> event) {
        Issue issue;
        if (event.getType() != EntityChangedEvent.Type.DELETED) {
            issue = transactionalDataManager.load(event.getEntityId())
                    .view("issue-with-person-ticket")
                    .one();
            calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            if (issue.getIssueId() == null) {
                issue.setIssueId("ISS-" + Integer.toString(calendar.get(Calendar.YEAR)) + "-"
                        + String.format("%05d", uniqueNumbersAPI.getNextNumber("issueId")));
                transactionalDataManager.save(issue);
            }
        }
    }
}