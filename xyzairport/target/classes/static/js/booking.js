  $(document).ready(function(){
      getPlaneData();
   });

   // check if location from that the airplane is there

    // if the airplane is there you can fly

    // if airplane flying = true, you cant book airplen, it is i in the air

function getPlaneData(){
    // get dta from flight
    $.ajax({
        url: "http://localhost:8080/api/plane/",
        type:"get",
        contentType : "application/json",
        success:function(data){
            var choosePlane="";
            $.each(data, function(index, plane){
                // get the data types

                // first you get all the data of the guest
                console.log(plane.flying);
                console.log(plane.planeID);
                if(plane.flying == true){
                    var allPlanes = "<option value='" + plane.planeID + "' id='" + plane.planeID + "'>" + plane.type + "</option>"
                    choosePlane += allPlanes;
                }
            });
             $("#choosePlane").html(choosePlane);
        }
    });
}

function postData(){
        // i want to post data in flight from location to where with the plane chosen

        console.log("going to post flight");
        var inputFromLocation = $("#fromLocation").val();
         console.log(inputFromLocation);
        var inputToLocation = $("#toLocation").val();
        var inputPlaneID = $("#choosePlane").val();

        // i wna to loop through the table to find flight id
//        $("#choosePlane").each(function(){
//
//        )};

        console.log(inputPlaneID);

        // this needs to enter flight details at flight repository
        var newBooking={
            locationfrom:inputFromLocation,
            locationto :inputToLocation,
            plane:{ planeID : inputPlaneID}
        }

        var newBookingJson = JSON.stringify(newBooking);

        $.ajax({
            url:"http://localhost:8080/api/flights/save",
            type:"post",
            data : newBookingJson,
            contentType:"application/json",
            success : function(data){
                       console.log("successful put");
                    }
        });

        $("#flight").html("You are going to fly");
}
