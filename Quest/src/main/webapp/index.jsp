<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
    <title>MagicQuest</title>
</head>
<body>

<div class="content">

    <div class="info">

        <h3>Статистика</h3>
        <div>Исследовано: ${allAnswersViewed} / ${quantity}</div>
        <div>Игр сыграно: ${endGames}</div>

    </div>

    <h1 class="description">

    </h1>

    <div class="text">

    </div>

    <form class="variants">

    </form>

</div>
<br/>

<script>

    function doAnswer(answer){
        if (answer == 100){
            location.reload();
        }

        $.ajax({
            type: "GET",
            url: "/magic-quest",
            data: {
                value: answer
            },
            success: function (data) {
                $(".variants").empty();
                var answer = JSON.parse(data);

                $(".description").text(answer.description);

                document.querySelector('.text').innerHTML = answer.text.replaceAll(/\n\r?/g, '<br />')

                for (let i = 0; i < answer.variants.length; i++) {
                    var item = answer.variants[i];

                    $(".variants").append(
                        "<button type=\"button\" value=\"" + item.id + "\" onClick=\"doAnswer(this.value)\">" +
                        String(item.text) + "</button>"
                    );
                }
            }
        });
    }
    doAnswer(1)

</script>

<style>
    .info {
        position: fixed;
        top: 3%;
        left: 5%;
    }

    body{
        background: #f3f3f3;
        font: 1rem "Fira Sans", sans-serif;
    }

    .content{
        width: 50%;
        margin: auto;
        border: 1px solid #0065ff;
        border-radius: 20px;
        text-align: center;
        margin-top: 3%;
        margin-bottom: 10%;
        background: white;
    }

    .description{
        width: 80%;
        margin: auto;
        padding-top: 5%;
    }

    .text{
        padding: 5%;
        font-size: 115%;
    }

    .variants > * {
        display: inline-block;
        box-sizing: border-box;
        padding: 0 25px;
        margin: 0 15px 15px 0;
        outline: none;
        border: 1px solid #0065ff;
        border-radius: 50px;
        height: 46px;
        line-height: 46px;
        font-size: 14px;
        font-weight: 600;
        text-decoration: none;
        color: #444;
        background-color: #fff;
        box-shadow: 0 4px 6px rgb(65 132 144 / 10%), 0 1px 3px rgb(0 0 0 / 8%);
        cursor: pointer;
        user-select: none;
        appearance: none;
        touch-action: manipulation;
        vertical-align: top;
        transition: box-shadow 0.2s;
    }
    .variants > *:focus-visible {
        border: 1px solid #4c51f9;
        outline: none;
    }
    .variants > *:hover {
        transition: all 0.2s;
        box-shadow: 0 7px 14px rgb(65 132 144 / 10%), 0 3px 6px rgb(0 0 0 / 8%);
    }
    .variants > *:active {
        background-color: #808080;
    }
    .variants > *:disabled {
        background-color: #eee;
        border-color: #eee;
        color: #444;
        cursor: not-allowed;
    }

</style>

</body>
</html>