
$(document).ready(function () {
    if (window.location.hash != "") {
        var elem = $('#' + window.location.hash.replace('#', ''));
        if (elem) {
            $('html, body').animate({
                scrollTop: elem.offset().top - 100
            }, 1000);
        }
    }
    $(document).on("scroll", onScroll);

    $('a[data-href^="#"]').on('click', function (e) {
        e.preventDefault();
        $(document).off("scroll");
        $('a').each(function () {
            $(this).removeClass('active');
        })
        $(this).addClass('active');
        var target = $(this).data("href"),
            menu = target;
        $target = $(target);
        $('html, body').stop().animate({
            'scrollTop': $target.offset().top - 100
        }, 600, 'swing', function () {
            window.location.hash = target;
            $(document).on("scroll", onScroll);
        });
    });
});

function onScroll(event) {
    var scrollPos = $(document).scrollTop();
    $('.menu_sub-menu_new li a').each(function () {
        var currLink = $(this);

        var refElement = $('#' + currLink.data("href").replace('#', ''));
        if (refElement.position().top - 110 <= scrollPos && refElement.position().top + refElement.height() > scrollPos) {
            $('.menu_sub-menu_new ul li a').removeClass("active");
            currLink.addClass("active");
        }
        else {
            // currLink.removeClass("active");
        }
    });
}
