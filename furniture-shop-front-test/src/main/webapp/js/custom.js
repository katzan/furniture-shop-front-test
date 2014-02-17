$(function() {

    var button1 = $('.button1');

    var menu1 = $('.menc1');

   $('ul li a', menu1).each(function() {
        $(this).append('<span />');
    });


    
    button1.toggle(function(e) {
        e.preventDefault();
        menu1.css({display: 'block'});
        $('.ar', this).html('&#9650;').css({top: '3px'});
        $(this).addClass('active');
    },function() {
        menu1.css({display: 'none'});
        $('.ar', this).html('&#9660;').css({top: '5px'});
        $(this).removeClass('active');
    });

        
});

$(function() {

    var button2 = $('.button2');

    var menu2 = $('.menc2');

   $('ul li a', menu2).each(function() {
        $(this).append('<span />');
    });


    
    button2.toggle(function(e) {
        e.preventDefault();
        menu2.css({display: 'block'});
        $('.ar', this).html('&#9650;').css({top: '3px'});
        $(this).addClass('active');
    },function() {
        menu2.css({display: 'none'});
        $('.ar', this).html('&#9660;').css({top: '5px'});
        $(this).removeClass('active');
    });
});

$(function() {

    var button3 = $('.button3');

    var menu3 = $('.menc3');

   $('ul li a', menu3).each(function() {
        $(this).append('<span />');
    });


    
    button3.toggle(function(e) {
        e.preventDefault();
        menu3.css({display: 'block'});
        $('.ar', this).html('&#9650;').css({top: '3px'});
        $(this).addClass('active');
    },function() {
        menu3.css({display: 'none'});
        $('.ar', this).html('&#9660;').css({top: '5px'});
        $(this).removeClass('active');
    });

        
});

