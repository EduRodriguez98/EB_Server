package dto;

import java.util.ArrayList;

import dto.FlightDTO;

public class EBFlightAssembler {
	
	public ArrayList<EBFlightDTO> disassemble(ArrayList<FlightDTO> flightsDTO) {
		ArrayList<EBFlightDTO> flights = new ArrayList<EBFlightDTO>();

		for (FlightDTO f : flightsDTO) {
			flights.add(new EBFlightDTO(f.getFlightCode(), f.getOrigin(), f.getDestination(), f.getDate(), f.getPrice()));
		}

		System.out.println("* Disassembling Flights ...");
		
		return flights;
	}
}
