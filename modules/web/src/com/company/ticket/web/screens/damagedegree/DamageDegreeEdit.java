package com.company.ticket.web.screens.damagedegree;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.DamageDegree;

@UiController("ticket_DamageDegree.edit")
@UiDescriptor("damage-degree-edit.xml")
@EditedEntityContainer("damageDegreeDc")
@LoadDataBeforeShow
public class DamageDegreeEdit extends StandardEditor<DamageDegree> {
}