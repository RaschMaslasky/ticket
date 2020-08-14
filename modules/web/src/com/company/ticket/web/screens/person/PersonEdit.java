package com.company.ticket.web.screens.person;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.Person;

@UiController("ticket_Person.edit")
@UiDescriptor("person-edit.xml")
@EditedEntityContainer("personDc")
@LoadDataBeforeShow
public class PersonEdit extends StandardEditor<Person> {
}