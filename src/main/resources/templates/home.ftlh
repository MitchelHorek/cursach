
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
                        <#list mapImages?keys as key>
                            <#if key == type.name>
                                <#list mapImages[key] as image>
                                    <a href="#" class="menu__list__item__img">
                                        <img src="/static/images/${key}/${image}" alt="NACHOS MEXICANOS" title="NACHOS MEXICANOS" class="img_transparent">

                                    </a>
                                </#list>
                            </#if>
                        </#list>
                        <!--<a href="#" class="menu__list__item__img">
                           <img src="/static/images/bananaSmileMenu/bananaMimoza.jpg" alt="NACHOS MEXICANOS" title="NACHOS MEXICANOS" class="img_transparent">
                        </a>
                        <a href="#" class="menu__list__item__img">
                            <img src="/static/images/bananaSmileMenu/BLOODY-BANANA-SHAKE.jpg" alt="NACHOS MEXICANOS" title="NACHOS MEXICANOS" class="img_transparent">
                        </a>-->

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

        </div>
    </div>

</footer>

<script type="text/javascript" src="/static/main.js">
</script>
</body>
</html>