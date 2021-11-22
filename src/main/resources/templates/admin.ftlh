<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <!--<link rel="stylesheet" href="/static/main.css" type="text/css">-->
    <link rel="stylesheet" href="/static/admin.css" type="text/css">
</head>
<body>
<!--<p>ФОРМА ОТПРАВКИ ЗАКАЗА</p>
<form class="decor" method="post" action="/admin_form">
    <div class="form-left-decoration"></div>
    <div class="form-right-decoration"></div>
    <div class="circle"></div>
    <div class="form-inner">
        <h3>Написать нам</h3>
        <input name="userName" type="text" placeholder="Username">
        <input type="email" placeholder="Email">
        <textarea placeholder="Сообщение..." rows="3"></textarea>
        <input type="submit" value="Отправить">
    </div>
</form>-->
<h1>ПАНЕЛЬ АДМИНИСТРАТОРА</h1>
<div class="content_admin">
    <div class="navigation">
        <ul class="border">
            <li>
               <a href="/admin/orders">Заказы</a>
            </li>
            <li>
                <a href="/admin/users">Пользователи</a>
            </li>
            <li>
                <a href="/admin/menu">Меню</a>
            </li>
            <li>
                <a href="/admin/exit">Выход</a>
            </li>
        </ul>
    </div>
    <div class="editor">
        <table>
            <#if orders??>
                <tr>
                    <th class="c1">№</th>
                    <th class="c2">Комментарий</th>
                    <th class="c3">Имя пользователя</th>
                    <th class="c4">Mail</th>
                    <th class="c5">Дата</th>
                </tr>
                <#list  orders as order>
                    <tr>
                        <td class="c1">
                            ${order.id}
                        </td>
                        <td class="c2">
                            ${order.comment}
                        </td>
                        <td class="c3">
                            ${order.userName}
                        </td>
                        <td class="c4">
                            ${order.mail}
                        </td>
                        <td class="c5">
                            ${order.date}
                        </td>
                        <td class="c5">
                            <form action="/admin/order/edit" method="post">
                                <button>
                                    <img class="edit_image" src="/static/images/figure/edit.png">
                                </button>
                                <#--<input type="submit" value="Submit" />-->
                                <input type="hidden" value=${order.id} name="orderId">
                            </form>
                            <form>
                                <button>
                                    <img class="edit_image" src="/static/images/figure/delete.png">
                                </button>
                                <input type="hidden" value=${order.id}>
                            </form>
                        </td>
                    </tr>
                </#list>
            </#if>
            <#if orderEdit?? && order??>
                <form action="/admin/order/save" method="post">
                    <input type="text" value=${order.comment}>
                    <input type="email" value=${order.mail}>
                    <input type="submit" value="Сохранить">
                    <input type="reset" value="Отмена">
                </form>
                <form action="/admin/order/cancle" method="post">
                    //to do доделать отмету и сохранение заказа
                </form>
            </#if>
        </table>
    </div>
</div>

</body>
</html>