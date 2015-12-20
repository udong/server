$(document).ready(function(){
			  $.ajax({
			          type: 'post'
			        , url: 'localhost:8080/udong/club/list'
			        , success: function(data) {
			        	$(data).each(function(index, item){
			        		
			        	});
			          }
			  });		
})

$(window).load(function() {
	
});