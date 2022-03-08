package domein;

import java.util.*;

public enum RequiredElement {

    StartDateRequired, EndDateRequired, 
    DescriptionRequired, AttendeeRequired, LocationRequired;

	protected Collection<AppointmentBuilder> elements;
}
