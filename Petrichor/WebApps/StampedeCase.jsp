<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Feedback</title>
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
<body>

<nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">ProApp</a>
        <div class="d-flex">
            <a class="btn btn-outline-light" href="index.jsp">Home</a>
        </div>
    </div>
</nav>

<h2 class="text-center">${msg}</h2>
<h1 class="form-title">File a Stampede Case</h1>



<div class="container form-container">
    <form action="case" method="POST">
        <div class="mb-3">
            <label class="form-label">Event</label>
            <input type="text" class="form-control" name="event">
        </div>


        <div class="mb-3">
            <div class="col">
                <label class="form-label">NO of Deaths</label>
                <input type="number" class="form-control" name="deaths" >
            </div>
            <div class="col">
                <label class="form-label">NO of Injuries</label>
                <input type="number" class="form-control" name="injuries" >
            </div>

            <div class="mb-3">
                <label class="form-label">Location</label>
                <input type="text" class="form-control" name="location">
            </div>

            <div class="d-grid">
                <button type="submit" class="btn btn-primary">File Case</button>
            </div>
        </div>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>

</body>
</html>