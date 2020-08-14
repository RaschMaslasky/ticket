package com.company.ticket.web.screens.person;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.Person;

@UiController("ticket_Person.browse")
@UiDescriptor("person-browse.xml")
@LookupComponent("personsTable")
@LoadDataBeforeShow
public class PersonBrowse extends StandardLookup<Person> {
}