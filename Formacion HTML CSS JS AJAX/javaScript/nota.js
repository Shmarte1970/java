$(document).ready(function(){
    $("#btn").click(resultado);

    function resultado(){
        var res = $("#nota").val();
        if(res < 5){
            $("#res").text("No Apto");
            $("#res").css("color", "red");
            $("#res").css("font-weight","blod");
        }
    
    }
});

