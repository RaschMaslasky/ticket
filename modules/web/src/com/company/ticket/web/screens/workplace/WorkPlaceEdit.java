package com.company.ticket.web.screens.workplace;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.WorkPlace;

@UiController("ticket_WorkPlace.edit")
@UiDescriptor("work-place-edit.xml")
@EditedEntityContainer("workPlaceDc")
@LoadDataBeforeShow
public class WorkPlaceEdit extends StandardEditor<WorkPlace> {
    //TODO необходимо дополнить атрибутами
}