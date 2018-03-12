$(document).ready(function(){
    getData();
 });

 // get all the data from database to html flight
 function getData(){
    console.log("Acquire data");

    $.ajax({
        url: "http://localhost:8080/api/flights/",
        type: "get",
        success: function(data){
            var flightList = "";
            $.each(data, function(index, flight){
                console.log(flight);
                   var flightString = "<tr><td>" +  flight.airportID +  "</td><td>" +  flight.fromLocation + "</td><td>" + flight.toLocation + "</td><td>" + flight.plane.planeID + "</td></tr>";
           flightList += flightString;
           });
            $("#flightTable").append(flightList);
        }
    });
 }

 function deleteFlight(id){


 }