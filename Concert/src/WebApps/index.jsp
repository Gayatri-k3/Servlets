<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Concert Event</title>
    <style>
        body {
            background: #f2f2f2;
            font-family: Arial, sans-serif;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        h1 {
            color: #333;
            font-size: 32px;
            margin-bottom: 10px;
        }

        h2 {
            color: #666;
            font-size: 20px;
            margin-bottom: 30px;
        }

        a {
            text-decoration: none;
            color: white;
        }

        button {
            padding: 12px 25px;
            background: #4CAF50;
            color: white;
            font-size: 16px;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        button:hover {
            background: #45a049;
        }
    </style>
</head>
<body>

<h1>Welcome to BookEvents!!</h1>
<h2>Click the button below to hear your favourite artist!</h2>

<button><a href="Event.jsp">Let's Go!</a></button>
<br>
<button><a href="FindById.jsp">Find Event?</a></button>

</body>
</html>
