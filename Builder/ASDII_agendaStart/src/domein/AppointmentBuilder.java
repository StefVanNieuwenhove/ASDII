package domein;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import exception.InformationRequiredException;

public class AppointmentBuilder {

	protected Appointment appointment;
	protected Set<RequiredElement> elements;

	public Appointment getAppointment() throws InformationRequiredException {
		
		elements = new HashSet<>();
		
		if (appointment.getStartDate() == null) 
			elements.add(RequiredElement.StartDateRequired);
		if (appointment.getDescription() == null)
			elements.add(RequiredElement.EndDateRequired);
		if (appointment.getLocation() == null) 
			elements.add(RequiredElement.LocationRequired);
		if (appointment.getAttendees().isEmpty())
			elements.add(RequiredElement.AttendeeRequired);
		if (!elements.isEmpty())
			throw new InformationRequiredException(elements);
		
		return this.appointment;
	}

	public void createNewAppointment() {
		// TODO - implement AppointmentBuilder.createNewAppointment
		appointment = new Appointment();
	}

	/**
	 * 
	 * @param startDate
	 * @param endDate
	 */
	public void applyDates(LocalDateTime startDate, LocalDateTime endDate) {
		// TODO - implement AppointmentBuilder.applyDates
		if (startDate != null && startDate.isAfter(LocalDateTime.now())) {
			appointment.setStartDate(startDate);
			if (endDate != null && endDate.isAfter(startDate))
				appointment.setEndDate(endDate);
		}
		
	}

	/**
	 * 
	 * @param description
	 */
	public void applyDescription(String description) {
		// TODO - implement AppointmentBuilder.applyDescription
		appointment.setDescription(description);
	}

	/**
	 * 
	 * @param location
	 */
	public void applyLocation(Location location) {
		// TODO - implement AppointmentBuilder.applyLocation
		appointment.setLocation(location);
	}

	/**
	 * 
	 * @param attendees
	 */
	public void applyAttendees(List<Contact> attendees) {
		// TODO - implement AppointmentBuilder.applyAttendees
		appointment.setAttendees(attendees);
	}

	

	

}