package domein;

import exception.InformationRequiredException;

public class MeetingBuilder extends AppointmentBuilder {
	
	

	@Override
	public Appointment getAppointment() throws InformationRequiredException {
		try {
			super.getAppointment();
		} finally {
			if (appointment.getEndDate() == null)
				elements.add(RequiredElement.EndDateRequired);
			if (!elements.isEmpty())
				throw new InformationRequiredException(elements);
		}
		return appointment;
	}

}