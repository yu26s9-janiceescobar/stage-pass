package nl.pluralsight.stagepass.dto;

import nl.pluralsight.stagepass.model.Concert;

import java.math.BigDecimal;

public record ConcertSummary(Long concertId, String concertTitle, int totalSeats, int seatsBooked, int availableSeats, BigDecimal totalRevenue) {
    public static ConcertSummary from (Concert concert){
        BigDecimal revenue = concert.getTicketPrice().multiply(BigDecimal.valueOf(concert.getBookedSeats()));
        return new ConcertSummary(
                concert.getId(),
                concert.getTitle(),
                concert.getTotalSeats(),
                concert.getBookedSeats(),
                concert.getAvailableSeats(),
                revenue
        );
    }
}
