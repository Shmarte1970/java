$(document).ready(function(){
    $("#botontamanyo").click(cambiarTamanyo);
});

    function cambiarTamanyo(){
        var ancho = $("#textancho").val();
        var alto = $("#textalto").val();
        $("#ancho").text("Ancho: "+alto);
        $("#alto").text("Alto: "+alto);
        $("#etiqueta".css("width", ancho + "px"));
        $("#etiqueta".css("height", alto + "px"));
    }