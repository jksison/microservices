<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Complete Reservation</title>
</head>
<body>
<h2>Complete Reservation</h2>
Airline: ${flight.operatingAirlines} <br/>
Departure City: ${flight.departureCity} <br/>
Arrival City: ${flight.arrivalCity} <br/>

<form action="completeReservation" method="post">
<pre>
<h2>Passenger Details:</h2>
First Name: <input type="text" name="passengerFirstName"/> <br/>
Last Name: <input type="text" name="passengerLastName"/> <br/>
Email: <input type="text" name="passengerEmail"/> <br/>
Phone: <input type="text" name="passengerPhone"/> <br/>

<h2>Card Details:</h2>
Name on the card: <input type="text" name="nameOnTheCard"/> <br/>
Card No: <input type="text" name="cardNumber"/> <br/>
Expiry Date: <input type="text" name="expirationDate"/> <br/>
Three Digit Sec Code: <input type="text" name="securityCode"/> <br/>

<input type="hidden" name="flightId" value="${flight.id}"/>
<input type="submit" value="Confirm">
</pre>



</form>
</body>
</html>