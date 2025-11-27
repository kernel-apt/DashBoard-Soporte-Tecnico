package models.account;

import java.time.LocalDate;

public class Ticket 
{
    private String employeeName;
    private String ticketNumber;
    private String visitNumber;
    private LocalDate date;
    private String area;

    public Ticket(String employeeName, String ticketNumber, String visitNumber, LocalDate date, String area) 
    {
        this.employeeName = employeeName;
        this.ticketNumber = ticketNumber;
        this.visitNumber = visitNumber;
        this.date = date;
        this.area = area;
    }

    public String getEmployeeName() 
    {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) 
    {
        this.employeeName = employeeName;
    }

    public String getTicketNumber() 
    {
        return this.ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) 
    {
        this.ticketNumber = ticketNumber;
    }

    public String getVisitNumber() 
    {
        return this.visitNumber;
    }

    public void setVisitNumber(String visitNumber) 
    {
        this.visitNumber = visitNumber;
    }

    public LocalDate getDate() 
    {
        return this.date;
    }

    public void setDate(LocalDate date) 
    {
        this.date = date;
    }

    public String getArea() 
    {
        return this.area;
    }

    public void setArea(String area) 
    {
        this.area = area;
    }
}