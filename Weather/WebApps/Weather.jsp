<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Weather</title>
</head>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
<style>
    body {
        background-color: #f8f9fa;
    }

    .form-container {
        max-width: 800px;
        margin: 40px auto;
        padding: 30px;
        background-color: white;
        border-radius: 20px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
    }

    .form-title {
        text-align: center;
        margin-bottom: 25px;
        color: black;
    }

    .btn-primary {
        padding: 10px 30px;
        font-weight: bold;
        background-color: black;
    }

    .navbar-brand {
        font-weight: bold;
        font-size: 24px;
    }

    h2 {
        color: red;
        margin-top: 20px;
    }
</style>
<body>


<nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Weather</a>
        <div class="d-flex">
            <a class="btn btn-outline-light" href="index.jsp">Home</a>
        </div>
    </div>
</nav>

<h2 class="text-center">${msg}</h2>
<h1 class="form-title">File a Stampede Case</h1>



<div class="container form-container">
    <form action="weather" method="POST">
        <div class="mb-3">
            <label class="form-label">Place</label>
            <input type="text" class="form-control" name="place">
        </div>
        <div class="mb-3">
            <div class="col">
                <label class="form-label">Weather</label>
                <input type="text" class="form-control" name="weather" >
            </div>
            <div class="col">
                <label class="form-label">Humidity</label>
                <input type="number" class="form-control" name="humidity" >
            </div>

            <div class="mb-3">
                <label class="form-label">Precipitation</label>
                <input type="number" class="form-control" name="precipitation">
            </div>
            <div class="mb-3">
                <label class="form-label">Minimum Temperature</label>
                <input type="number" class="form-control" name="mintemp">
            </div>
            <div class="mb-3">
                <label class="form-label">Maximum Temperature</label>
                <input type="number" class="form-control" name="maxtemp">
            </div>
            <div class="mb-3">
                <label class="form-label">Cloudy</label>
                <input type="text" class="form-control" name="cloudy">
            </div>
            <div class="mb-3">
                <label class="form-label">Wind</label>
                <input type="number" class="form-control" name="wind">
            </div>
            <div class="mb-3">
                <label class="form-label">Raining</label>
                <input type="text" class="form-control" name="raining">
            </div>
            <div class="mb-3">
                <label class="form-label">Rain Start Time</label>
                <input type="time" class="form-control" name="rainStartTime">
            </div>
            <div class="mb-3">
                <label class="form-label">Rain End Time</label>
                <input type="time" class="form-control" name="rainEndTime">
            </div>
            <div class="mb-3">
                <label class="form-label">Rain in MM</label>
                <input type="number" class="form-control" name="rainmm">
            </div>
            <div class="mb-3">
                <label class="form-label">Sunrise</label>
                <input type="time" class="form-control" name="sunrise">
            </div>
            <div class="mb-3">
                <label class="form-label">Sunset</label>
                <input type="time" class="form-control" name="sunset">
            </div>
            <div class="mb-3">
                <label class="form-label">Moon Rise</label>
                <input type="time" class="form-control" name="moonrise">
            </div>
            <div class="mb-3">
                <label class="form-label">Moon set</label>
                <input type="time" class="form-control" name="moonset">
            </div>
            <div class="d-grid">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </div>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>