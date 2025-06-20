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
            height: 100vh;
            align-items: center;
            justify-content: center;
        }

        form {
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
            width: 320px;
        }

        form h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        input[type="text"],
        input[type="email"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        button {
            width: 100%;
            padding: 12px;
            background: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        button:hover {
            background: #45a049;
        }

        label {
            font-weight: bold;
            color: #555;
        }
    </style>
</head>
<body>

<form action="concert" method="post">
    <h2>Book Concert</h2>
    <label for="name">Name:</label>
    <input type="text" name="name" required>

    <label for="email">Email:</label>
    <input type="email" name="email" required>

    <label for="num">Contact Number:</label>
    <input type="number" name="num" required>

    <label for="aName">Artist Name:</label>
    <input type="text" name="aName" required>

    <label for="location">Location:</label>
    <input type="text" name="location" required>

    <button type="submit">Book</button>
</form>

</body>
</html>
