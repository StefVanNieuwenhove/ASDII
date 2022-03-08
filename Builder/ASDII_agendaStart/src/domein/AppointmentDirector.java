package domein;

import java.time.LocalDateTime;
import java.util.List;

import exception.InformationRequiredException;

public class AppointmentDirector {

	/**
	 * 
	 * @param builder
	 * @param startDate
	 * @param endDate
	 * @param description
	 * @param attendees
	 */
	public Appointment buildAppointment(AppointmentBuilder builder, LocalDateTime startDate, LocalDateTime endDate, String description, List<Contact> attendees, Location location) throws InformationRequiredException {
		// TODO - implement AppointmentDirector.buildAppointment
		 if (builder == null)
			 builder = new AppointmentBuilder();
		 
		 builder.createNewAppointment();
		 builder.applyDates(startDate, endDate);
		 builder.applyDescription(description);
		 builder.applyLocation(location);
		 builder.applyAttendees(attendees);
		 
		 return builder.getAppointment();
	}


}