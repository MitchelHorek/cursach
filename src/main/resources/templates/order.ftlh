<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="/static/main.css" type="text/css">
</head>
<body>
<h1 class="order_header_title">СДЕЛАЙ ЗАКАЗИК♥</h1>
<form class="decor" method="post" action="/order">
    <div class="form-left-decoration"></div>
    <div class="form-right-decoration"></div>
    <div class="circle"></div>
    <div class="form-inner">
        <h3>ЗАКАЗИК ♥</h3>
        <input name="name" type="text" placeholder="Username">
        <input name="mail" type="email" placeholder="Email">
        <textarea name="comment" placeholder="Сообщение..." rows="10"></textarea>
        <input type="submit" value="Отправить">
    </div>
</form>
</body>
</html>