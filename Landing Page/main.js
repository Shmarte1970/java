$(document).ready(function() {
    $('#contact-form').submit(function(e) {
      e.preventDefault();
  
      var form = $(this);
      var url = form.attr('action');
      var formData = form.serialize();
  
      $.ajax({
        type: 'POST',
        url: url,
        data: formData,
        success: function(response) {
          $('#response-message').removeClass().addClass('success').text('¡Gracias por tu mensaje! Nos pondremos en contacto contigo pronto.');
          form[0].reset();
        },
        error: function()
  