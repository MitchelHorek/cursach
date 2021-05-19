<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Please sign in</title>

    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form class="form-signin" method="post" action="/registration">
        <h2 class="form-signin-heading">Регистрация</h2>
        <p>
            <label for="familia" class="sr-only">Фамилия</label>
            <input type="text" id="familia" name="familia" class="form-control" placeholder="Фамилия" required="" autofocus="">
        </p>
        <p>
            <label for="name" class="sr-only">Имя</label>
            <input type="text" id="name" name="name" class="form-control" placeholder="Имя" required="">
        </p>
        <p>
            <label for="otchestvo" class="sr-only">Отчество</label>
            <input type="text" id="otchestvo" name="otchestvo" class="form-control" placeholder="Отчество" required="">
        </p>
        <p>
            <label for="login" class="sr-only">Логин</label>
            <input type="text" id="login" name="login" class="form-control" placeholder="Логин" required="">
        </p>
        <p>
            <label for="password" class="sr-only">Пароль</label>
            <input type="password" id="password" name="password" class="form-control" placeholder="Пароль" required="">
        </p>
        <p>
            <label for="mail" class="sr-only">E-mail</label>
            <input type="email" id="mail" name="mail" class="form-control" placeholder="E-mail" required="">
        </p>
        <p>
            <label for="phone" class="sr-only">Телефон</label>
            <input type="number" id="phone" name="phone" class="form-control" placeholder="Телефон" required="">
        </p>
        <button class="btn btn-lg btn-primary btn-block" type="submit">OK</button>
    </form>
</div>
</body>
</html>







