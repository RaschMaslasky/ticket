package com.company.ticket.web.screens.damagedegree;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticket.entity.DamageDegree;

@UiController("ticket_DamageDegree.browse")
@UiDescriptor("damage-degree-browse.xml")
@LookupComponent("damageDegreesTable")
@LoadDataBeforeShow
public class DamageDegreeBrowse extends StandardLookup<DamageDegree> {
}