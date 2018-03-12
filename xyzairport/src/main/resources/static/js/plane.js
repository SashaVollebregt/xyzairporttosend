$(document).ready(function(){
    getData();
 });

 // get all the data from database to html plane
 function getData(){
    console.log("Acquire data");

    $.ajax({
        url: "http://localhost:8080/api/plane/",
        type: "get",
        success: function(data){
//        $("#planeTable").DataTable({
//            data:data,
//            columns:[{ data: 'stationed'}, {data:'type'}, {data:'fuel'}]
//        });
            var planeList = "";
            $.each(data, function(index, plane){

                   var planeString = "<tr><td >" + plane.stationed + "</td><td id='" + plane.planeID + "'>" + plane.type + "</td><td>" + plane.fuel + "</td></tr>";

            planeList += planeString;
            });
            $("#planeTable").append(planeList);
        }
    });
 }