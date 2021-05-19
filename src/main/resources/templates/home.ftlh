
<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous">
    <title>Document</title>
    <link rel="stylesheet" href="/static/main.css" type="text/css">

</head>
<body>
<div class="wrapper">
    <div class="wrapper main_content">
        <div class="menu_sub-menu_new">
            <div class="container">
                <ul>
                <#list types as type>
                    <li>
                        <a href="${type.name}" data-href="#${type.name}">${type.rusName}</a>
                    </li>
                </#list>
                </ul>
            </div>
        </div>
        <div class="container-fixed ">
            <div id="toggle" class="button_container">
                <span class="top"></span>
                <span class="middle"></span>
                <span class="bottom"></span>
            </div>

        </div>

        <div class="menu_header_2 new_menu_header">
            <a href="/registration">Регистрация</a>
            <a href="/login">Авторизация</a>
            <a href="/order">Заказ</a>
            <h1 class="menu_header_title">меню</h1>
        </div>
        <#list types as type>
            <div class="section_menu" id="${type.name}">
                <div class="menu-flexbox__item__title">
                    ${type.rusName}
                </div>
                <div class="slider_mob_arrow slick-initialized slick-slider">


                    <div class="snacks__list__item">

                        <a href="#" class="menu__list__item__img">
                           <img src="/static/images/bananaSmileMenu/bananaMimoza.jpg" alt="NACHOS MEXICANOS" title="NACHOS MEXICANOS" class="img_transparent">
                        </a>
                        <a href="#" class="menu__list__item__img">
                            <img src="/static/images/bananaSmileMenu/BLOODY-BANANA-SHAKE.jpg" alt="NACHOS MEXICANOS" title="NACHOS MEXICANOS" class="img_transparent">
                        </a>

                    </div>
                </div>
            </div>
        </#list>
    </div>
</div>
<footer class="footer">
    <div class="content">
        <div class="footer__right_col" style="position: relative">
            <div class="col copyright_symbol">©</div>
            <div class="col year">2021</div>
            <div class="col">
                SOS.CAFE<br>Все права защищены
            </div>
            <a class="yadzen" style="position: absolute; left: 60px; bottom: -40px; text-decoration: none; color: #FFF;" href="https://zen.yandex.ru/id/5bd2cbff1ea36b00aa3a01ff">
                Читайте нас в Яндекс Дзен -
                <svg width="30px" height="25px" style="position: absolute; right: -30px; top: -2px;" viewBox="0 0 30 56" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
                    <g id="Symbols" stroke="none" stroke-width="1">
                        <g id="Icons-/-yzen" fill="#FFF">
                            <g id="Group-4">
                                <polygon id="Fill-1" points="0 10.0868 30 21.7278 30 11.6408 0 0.0008"></polygon>
                                <polygon id="Fill-2" points="0 43.547 30 55.188 30 45.1 0 33.461"></polygon>
                                <polygon id="Fill-3" points="12.0674 36.7554 1.2034 32.3534 18.2024 18.5384 28.6924 22.6594"></polygon>
                            </g>
                        </g>
                    </g>
                </svg>
            </a>
            <a class="sitemap-link desktop_hide" href="/sitemap/">Карта сайта</a>
        </div>
        <div class="footer__center_col">
            <a href="https://twitter.com/soscafemoscow" target="_blank" class="footer__tw"></a>
            <a href="https://www.facebook.com/soscafemoscow/" target="_blank" class="footer__fb"></a>
            <a href="http://instagram.com/sos.cafe.moscow/" target="_blank" class="footer__insta"></a>
            <a href="https://vk.com/soscafemoscow" target="_blank" class="footer__vk"></a>
        </div>
        <div class="footer__bottom_text ">
            <div class="footer_adr_block">
                <a href="tel:+74951504334">+7 (495) 150-43-34</a>
                <div>
                    <span>Москва</span> ул. Мясницкая дом 11
                </div>
            </div>
        </div>
        <div class="footer__left_col">
            <div class="footer_menu">
                <a href="/about/" class="footer_menu_item">о нас</a>
                <a href="/menu/" class="footer_menu_item">меню</a>
                <a href="/news/" class="footer_menu_item">new<span class="text_red">sos</span></a>
                <a href="/blog/" class="footer_menu_item">блог</a>
                <a href="/contacts/" class="footer_menu_item">адрес</a>
                <a href="/sales/" class="footer_menu_item">акции</a><br>
            </div>
        </div>
    </div>

</footer>

<script type="text/javascript" src="/static/main.js">
</script>
</body>
</html>