
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Find Concert by ID</title>
    <style>
        body {
            background: #f2f2f2;
            font-family: Arial, sans-serif;
            display: flex;
            align-items: center;
            justify-content: center;
            flex-direction: column;
            height: 100vh;
            margin: 0;
        }

        form {
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
            width: 300px;
            margin-bottom: 20px;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }

        label {
            font-weight: bold;
            color: #555;
        }

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

        .result {
            background: white;
            padding: 20px;
            border-radius: 10px;
            width: 320px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
        }

        .result h3 {
            color: #333;
            text-align: center;
        }

        .result p {
            margin: 8px 0;
            color: #444;
            font-size: 15px;
        }

        .error {
            color: red;
            text-align: center;
        }
    </style>
</head>
<body>

<!-- Search Form -->
<form action="findConcert" method="get">
    <h2>Find Booked Event</h2>
    <label for="id">ID:</label>
    <input type="number" name="id" id="id" required>
    <button type="submit">Search</button>
    <br><br>

</form>

<!-- Result using EL only -->
<div class="result" style="${concertDTO != null ? '' : 'display:none'}">
    <h3>Concert Details</h3>
    <p><strong>Name:</strong> ${concertDTO.name}</p>
    <p><strong>Email:</strong> ${concertDTO.email}</p>
    <p><strong>Contact Number:</strong> ${concertDTO.number}</p>
    <p><strong>Artist Name:</strong> ${concertDTO.AName}</p>
    <p><strong>Location:</strong> ${concertDTO.location}</p>
    <p><strong>Created At:</strong> ${concertDTO.created_at}</p>
</div>

<!-- Error Message -->
<p class="error" style="${errorMessage != null ? '' : 'display:none'}">${errorMessage}</p>

</body>
</html>
